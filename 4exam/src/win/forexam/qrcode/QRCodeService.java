package win.forexam.qrcode;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Binarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class QRCodeService {

	private Logger logger = LogManager.getLogger(this.getClass());

	private static final int BLACK = 0xFF000000;
	private static final int WHITE = 0xFFFFFFFF;
	private static final int QRCODE_WIDTH = 200;

	public void writeQRCodeWithAnswer(String content, String imgPath) {
		try {
			BufferedImage bufImg = this.getQRCodeWithAnswer(content);

			File imgFile = new File(imgPath);
			// 生成二维码QRCode图片
			ImageIO.write(bufImg, "png", imgFile);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public BufferedImage getQRCodeWithAnswer(String content) {
		BufferedImage imgQR = getQRCode(content);

		ResultPoint[] rp = getQRCodePoint(imgQR);
		int widthQRCodeLocationPoint = (int) (rp[0].getY() - rp[0].getX());
		BufferedImage imgAnswer = new AnswerImage()
				.getAnswerImage(widthQRCodeLocationPoint * 4 / 5);
		Graphics2D gs = imgQR.createGraphics();
		int imgQRWidth = imgQR.getWidth();
		int imgQRHeight = imgQR.getHeight();
		int imgAnswerWitdh = imgAnswer.getWidth();
		int imgAnswerHeight = imgAnswer.getHeight();

		int x = (int) rp[1].getX()
				+ (widthQRCodeLocationPoint - imgAnswerWitdh) / 2;
		int y = (int) rp[1].getY()
				+ (widthQRCodeLocationPoint - imgAnswerHeight) / 2;
		logger.debug("imgQR witdh:" + imgQRWidth + " height:" + imgQRHeight);
		logger.debug("imgAnswer x:" + x + " y:" + y + " width:"
				+ imgAnswerWitdh + " height:" + imgAnswerHeight);

		gs.drawImage(imgAnswer, x, y, imgAnswerWitdh, imgAnswerHeight, null);
		gs.dispose();
		imgQR.flush();
		return imgQR;
	}

	/**
	 * @param content
	 * @return
	 */
	public BufferedImage getQRCode(String content) {

		try {
			MultiFormatWriter multiFormatWriter = new MultiFormatWriter();

			Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
			hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
			hints.put(EncodeHintType.MARGIN, 0);
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");

			BitMatrix matrix = multiFormatWriter.encode(content,
					BarcodeFormat.QR_CODE, QRCODE_WIDTH, QRCODE_WIDTH, hints);

			int width = matrix.getWidth();
			int height = matrix.getHeight();
			BufferedImage image = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			for (int x = 0; x < width; x++) {
				for (int y = 0; y < height; y++) {
					image.setRGB(x, y, matrix.get(x, y) ? BLACK : WHITE);
				}
			}
			return image;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;

	}

	public String getAnswer(String qrImagePath) throws IOException {

		logger.debug("qrImagePath:" + qrImagePath);
		BufferedImage qrCodeImage = ImageIO.read(new File(qrImagePath));

		return getAnswer(qrCodeImage);
	}

	public String getAnswer(BufferedImage imgQR) {
		String answer = "";
		try {

			LuminanceSource source = new BufferedImageLuminanceSource(imgQR);
			Binarizer binarizer = new HybridBinarizer(source);
			BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
			Map<DecodeHintType, Object> hints = new HashMap<DecodeHintType, Object>();
			hints.put(DecodeHintType.CHARACTER_SET, "UTF-8");
			Result result = new MultiFormatReader().decode(binaryBitmap, hints);// 对图像进行解码

			String content = result.getText();

			logger.info("QRCode content is :" + content);

			ResultPoint[] rp = result.getResultPoints();

			for (int i = 0; i < rp.length; i++) {
				logger.debug("result point: " + rp[i]);
			}

			ImageRotate imageRatate = new ImageRotate();
			double degree = imageRatate.getRotateDegree(rp);
			if (degree != 0) {
				imgQR = imageRatate.Rotate(imgQR, degree);
				ImageIO.write(imgQR, "png", new File ("d:/QRCode/QRCodeAnswer_ratated.png"));
				
				source = new BufferedImageLuminanceSource(imgQR);
				binarizer = new HybridBinarizer(source);
				binaryBitmap = new BinaryBitmap(binarizer);

				result = new MultiFormatReader().decode(binaryBitmap, hints);// 对图像进行解码
				rp = result.getResultPoints();
				for (int i = 0; i < rp.length; i++) {
					logger.debug("rotated result point: " + rp[i]);
				}
			}

			int widthQRCodeLocationPoint = (int) (Math.sqrt(Math.pow(
					(rp[0].getX() - rp[1].getX()), 2)
					+ Math.pow((rp[0].getY() - rp[1].getY()), 2)));

			logger.debug("widthQRCodeLocationPoint:" + widthQRCodeLocationPoint);

			int witdhImageAnswer = (widthQRCodeLocationPoint * 4 / 5);

			int heightImageAnswer = ((witdhImageAnswer - 1) / 4) + 1;

			int x = (int) rp[1].getX()
					+ (widthQRCodeLocationPoint - witdhImageAnswer) / 2;
			int y = (int) rp[1].getY()
					+ (widthQRCodeLocationPoint - heightImageAnswer) / 2;

			logger.debug("answer image start x,y: (" + x + "," + y + ")");

			BufferedImage imageAnswer = imgQR.getSubimage(x, y,
					witdhImageAnswer, heightImageAnswer);

			//
			ImageSelected t = new ImageSelected();

			int rectSize = (witdhImageAnswer - 1) / 4;

			logger.debug("width:" + witdhImageAnswer + " rectangle size:"
					+ rectSize);

			BufferedImage imageAnswerA = imageAnswer.getSubimage(1 + 1, 1 + 1,
					rectSize - 3, rectSize - 3);
			BufferedImage imageAnswerB = imageAnswer.getSubimage(
					1 + (rectSize) + 1, 1 + 1, rectSize - 3, rectSize - 3);
			BufferedImage imageAnswerC = imageAnswer.getSubimage(
					1 + 2 * (rectSize) + 1, 1 + 1, rectSize - 3, rectSize - 3);
			BufferedImage imageAnswerD = imageAnswer.getSubimage(
					1 + 3 * (rectSize) + 1, 1 + 1, rectSize - 3, rectSize - 3);

			if (logger.isDebugEnabled()) {
				ImageIO.write(imageAnswerA, "png", new File(
						"d:/QRCode/answerImageA.png"));
				ImageIO.write(imageAnswerB, "png", new File(
						"d:/QRCode/answerImageB.png"));
				ImageIO.write(imageAnswerC, "png", new File(
						"d:/QRCode/answerImageC.png"));
				ImageIO.write(imageAnswerD, "png", new File(
						"d:/QRCode/answerImageD.png"));
			}
			if (t.isSelected(imageAnswerA)) {
				answer = "A" + ",";
			}
			if (t.isSelected(imageAnswerB)) {
				answer = answer + "B" + ",";
			}
			if (t.isSelected(imageAnswerC)) {
				answer = answer + "C" + ",";
			}
			if (t.isSelected(imageAnswerD)) {
				answer = answer + "D" + ",";
			}

			logger.info("answer is:" + answer);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return answer;
	}

	public ResultPoint[] getQRCodePoint(BufferedImage image) {

		ResultPoint rp[] = null;
		try {

			
			LuminanceSource source = new BufferedImageLuminanceSource(image);
			Binarizer binarizer = new HybridBinarizer(source);
			BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
			logger.debug("binaryBitmap width:" + binaryBitmap.getWidth());

			Map<DecodeHintType, Object> hints = new HashMap<DecodeHintType, Object>();
			hints.put(DecodeHintType.CHARACTER_SET, "UTF-8");
			Result result = new MultiFormatReader().decode(binaryBitmap, hints);// 对图像进行解码
			String content = result.getText();
			logger.debug("content： " + content);
			rp = result.getResultPoints();

		} catch (Exception e) {
			logger.error(e.getMessage(), e);

		}
		return rp;
	}

	public static void main(String[] args) throws IOException {

		String imgPath = "d:\\QRCode\\QRCodeAnswer_ratated.png";
		String content = "This is a test QRCode with answer.This is a test QRCode with answer.";

		QRCodeService handler = new QRCodeService();

		handler.writeQRCodeWithAnswer(content, imgPath);
		handler.getAnswer(imgPath);

	}
}