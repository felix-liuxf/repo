package win.forexam.qrcode;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.zxing.ResultPoint;
import com.google.zxing.WriterException;

public class ImageRotate {  
	public static void main(String[] args) throws WriterException, IOException {
		
		ImageRotate rotateImage = new ImageRotate();
		BufferedImage src = ImageIO.read(new File("d:/QRCode/QRCodeAnswer.png"));  
		ResultPoint[] rp = new ResultPoint[2];
		
		rp[0]=new ResultPoint((float)202.5,(float)379.0);
		
		rp[1]=new ResultPoint((float)182.5,(float)238.5);
		
		double degree = rotateImage.getRotateDegree(rp);
		
        BufferedImage des = rotateImage.Rotate(src, degree);  
        
        ImageIO.write(des, "png", new File ("d:/QRCode/QRCodeAnswer_1.png"));
         
	}

	private Logger logger = LogManager.getLogger(this.getClass());
  
	public double getRotateDegree(ResultPoint[] rp)
	{
	
		float x1=rp[1].getX();
		float y1= rp[1].getY();
	
		float x2=rp[0].getX();
		float y2= rp[0].getY();
		
		
		
		
		
		
		float x=Math.abs(x1-x2);
		float y=Math.abs(y1-y2);
        double z=Math.sqrt(x*x+y*y);
        double degree=(Math.asin(x/z)/Math.PI*180);
        
        
        if((x2>x1)&&(y2<y1))
        {
        	
        	degree=degree+90;
        	
        }
        if(x2<x1&&y2<y1)
        {
        	degree=degree+180;
        }
        
        if(x2<x1&&y2>y1)
        {
        	degree=degree+270;
        }
    
        logger.debug("x2:"+x2+" x1: "+ x1+ " y2:"+ y2 +" y1:"+y1+" roate degree:"+degree);
        
        return degree;
	}
	
    public  BufferedImage Rotate(Image src, double angel) {  
        int src_width = src.getWidth(null);  
        int src_height = src.getHeight(null);  
        // calculate the new image size  
        Rectangle rect_des = CalcRotatedSize(new Rectangle(new Dimension(  
                src_width, src_height)), angel);  
  
        int width=rect_des.width;
        int height=rect_des.height;
        
        BufferedImage res = null;  
        res = new BufferedImage(width, height,  
                BufferedImage.TYPE_INT_RGB);  
        Graphics2D g2 = res.createGraphics();  
        g2.setBackground(Color.WHITE);
        g2.clearRect(0, 0, width, height);
        //g2.setColor(Color.WHITE);
        // transform  
        g2.translate((width- src_width) / 2,  
                (height - src_height) / 2);  
        g2.rotate(Math.toRadians(angel), src_width / 2, src_height / 2);  
        //g2.setColor(Color.WHITE);
        g2.drawImage(src, null, null);  
        return res;  
    }  
  
    public  Rectangle CalcRotatedSize(Rectangle src, double angel) {  
        // if angel is greater than 90 degree, we need to do some conversion  
        if (angel >= 90) {  
            if(angel / 90 % 2 == 1){  
                int temp = src.height;  
                src.height = src.width;  
                src.width = temp;  
            }  
            angel = angel % 90;  
        }  
  
        double r = Math.sqrt(src.height * src.height + src.width * src.width) / 2;  
        double len = 2 * Math.sin(Math.toRadians(angel) / 2) * r;  
        double angel_alpha = (Math.PI - Math.toRadians(angel)) / 2;  
        double angel_dalta_width = Math.atan((double) src.height / src.width);  
        double angel_dalta_height = Math.atan((double) src.width / src.height);  
  
        int len_dalta_width = (int) (len * Math.cos(Math.PI - angel_alpha  
                - angel_dalta_width));  
        int len_dalta_height = (int) (len * Math.cos(Math.PI - angel_alpha  
                - angel_dalta_height));  
        int des_width = src.width + len_dalta_width * 2;  
        int des_height = src.height + len_dalta_height * 2;  
        return new java.awt.Rectangle(new Dimension(des_width, des_height));  
    }  
}