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
		// chart.createImage("中华人民共和国", new Font("宋体", Font.BOLD, 18), new File(
		// "d:/QRCode/a.png"));
		// chart.createImage("中华人民", new Font("黑体", Font.BOLD, 30), new File(
		// "d:/QRCode/a1.png"));
		// chart.createImage("中华人民共和国", new Font("黑体", Font.PLAIN, 24), new
		// File(
		// "d:/QRCode/a2.png"));

		ImageIO.write(chart.getAnswerImage(30), "png", new File(
				"d:/QRCode/a3.png"));// 输出png图片
	}

	private Logger logger = LogManager.getLogger(this.getClass());

	public BufferedImage getAnswerImage(int width) {

		// the marge 1 pixel

		int rectSize = (width - 1) / 4;

		logger.debug("with:" + width + " rectangle size:" + rectSize);

		int height = rectSize + 1;

		// single rectangle size 1+24+1+1

		// 创建图片
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_BGR);
		Graphics g = image.getGraphics();
		g.setColor(Color.WHITE);

		g.fillRect(0, 0, width, height);// 先用白色填充整张图片,也就是背景
		g.setColor(Color.black);// 在换成黑色

		g.drawRect(1, 1, (rectSize - 2), (rectSize - 2));
		g.drawRect(1 + (rectSize), 1, (rectSize - 2), (rectSize - 2));
		g.drawRect(1 + 2 * (rectSize), 1, (rectSize - 2), (rectSize - 2));
		g.drawRect(1 + 3 * (rectSize), 1, (rectSize - 2), (rectSize - 2));

		g.dispose();

		return image;
	}
}