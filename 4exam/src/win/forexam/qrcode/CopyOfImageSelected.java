package win.forexam.qrcode;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CopyOfImageSelected {
	private  Logger logger = LogManager.getLogger(this.getClass());
	
	public static void main(String args[]) {

		CopyOfImageSelected t = new CopyOfImageSelected();
		
		t.isSelected("d:\\QRCode\\answerImageA.png");
		
	}

	/**
	 * @param fileName
	 * @return
	 */
	public boolean isSelected(String fileName) {

		File file = new File(fileName);
		BufferedImage bi = null;
		try {
			bi = ImageIO.read(file);
		} catch (Exception e) {
			logger.error("Parse image :"+e.getMessage(),e);
			e.printStackTrace();
		}

		return isSelected(bi);
	}

	public boolean isSelected(BufferedImage bufferedImage) {

		boolean isSelected=false;
		// the selected pixel color threshold 50% of black grey value
		int colorValue = 127;

		// the selected pixel percent threshold

		float selectedPixelPercent = (float)1 / 1000;

		int[] rgb = new int[3];

		BufferedImage bi = bufferedImage;

		int width = bi.getWidth();
		int height = bi.getHeight();
		

		int totalPix = width * height;
		float selectedPix = 0;

		logger.debug("width=" + width + ",height=" + height + ".");
		

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				// System.out.print(bi.getRGB(jw, ih));
				int pixel = bi.getRGB(i, j);
				// bi.get
				rgb[0] = (pixel & 0xff0000) >> 16;
				rgb[1] = (pixel & 0xff00) >> 8;
				rgb[2] = (pixel & 0xff);

				if (rgb[0] < colorValue || rgb[1] < colorValue
						|| rgb[2] < colorValue)
					selectedPix++;
			}
		}

		 java.text.DecimalFormat percentFormat =new java.text.DecimalFormat(); 
		 //percentFormat.setMinimumFractionDigits(1);
		 percentFormat.setMaximumFractionDigits(1);
		 String selectedPixel= percentFormat.format(100*selectedPix / totalPix); 
		 logger.debug("selected pixel is : " + selectedPixel+"/100");

		if (selectedPix / totalPix > selectedPixelPercent)
			isSelected=true;

		logger.debug("is selected : " +isSelected);
		
		return isSelected;
	}

}
