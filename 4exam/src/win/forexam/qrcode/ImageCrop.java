package win.forexam.qrcode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ImageCrop {
	private  Logger logger = LogManager.getLogger(this.getClass());  
	public static void main(String args[]) throws IOException {

		ImageCrop t = new ImageCrop();
		//t.crop("d:\\QRCode\\answer.bmp");
		//t.crop("d:\\QRCode\\answer.png");
		//t.crop("d:\\QRCode\\download.png");
		BufferedImage bi=t.crop("d:\\QRCode\\answer_2.jpg",0,0,500,500);
		ImageIO.write(bi, "png", new File("d:\\QRCode\\t2.png"));// 输出png图片
		
		
	}
	
	public BufferedImage crop(String fileName)
	{
		File file = new File(fileName);
		BufferedImage bi = null;
		try {
			bi = ImageIO.read(file);
		} catch (Exception e) {
			logger.error("Parse image :"+e.getMessage(),e);
			e.printStackTrace();
		}
		return  crop(bi);
	}
	
	public BufferedImage crop(String fileName,int x,int y,int width,int height)
	{
		File file = new File(fileName);
		BufferedImage bi = null;
		try {
			bi = ImageIO.read(file);
		} catch (Exception e) {
			logger.error("Parse image :"+e.getMessage(),e);
			e.printStackTrace();
		}
		return  crop(bi,x,y,width,height);
	}
	public BufferedImage crop(BufferedImage bufferedImage)
	{
		return  crop(bufferedImage,0,0,50,50);
	}
	 /* 
     * 图片裁剪通用接口 
     */  
  
	public  BufferedImage crop(BufferedImage bufferedImage,int x,int y,int width,int height){  
		logger.debug("Image crop x:"+x +" y:"+y+" width:"+width+" height:"+height);
        return bufferedImage.getSubimage(x, y, width, height);  
}


}
