package win.forexam.qrcode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AnswerImage {
	public static void main(String[] args) throws Exception {

		AnswerImage chart = new AnswerImage();
		// chart.createImage("�л����񹲺͹�", new Font("����", Font.BOLD, 18), new File(
		// "d:/QRCode/a.png"));
		// chart.createImage("�л�����", new Font("����", Font.BOLD, 30), new File(
		// "d:/QRCode/a1.png"));
		// chart.createImage("�л����񹲺͹�", new Font("����", Font.PLAIN, 24), new
		// File(
		// "d:/QRCode/a2.png"));

		ImageIO.write(chart.getAnswerImage(30), "png", new File(
				"d:/QRCode/a3.png"));// ���pngͼƬ
	}

	private Logger logger = LogManager.getLogger(this.getClass());

	public BufferedImage getAnswerImage(int width) {

		// the marge 1 pixel

		int rectSize = (width - 1) / 4;

		logger.debug("with:" + width + " rectangle size:" + rectSize);

		int height = rectSize + 1;

		// single rectangle size 1+24+1+1

		// ����ͼƬ
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_BGR);
		Graphics g = image.getGraphics();
		g.setColor(Color.WHITE);

		g.fillRect(0, 0, width, height);// ���ð�ɫ�������ͼƬ,Ҳ���Ǳ���
		g.setColor(Color.black);// �ڻ��ɺ�ɫ

		g.drawRect(1, 1, (rectSize - 2), (rectSize - 2));
		g.drawRect(1 + (rectSize), 1, (rectSize - 2), (rectSize - 2));
		g.drawRect(1 + 2 * (rectSize), 1, (rectSize - 2), (rectSize - 2));
		g.drawRect(1 + 3 * (rectSize), 1, (rectSize - 2), (rectSize - 2));

		g.dispose();

		return image;
	}
}