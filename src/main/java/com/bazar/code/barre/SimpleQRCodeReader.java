package com.bazar.code.barre;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class SimpleQRCodeReader {

	public static void main(String[] args) {
	    try {
            File file = new File("resourcesData/qrcode-01.png");
            String decodedText = decodeQRCode(file);
            if(decodedText == null) {
                System.out.println("No QR Code found in the image");
            } else {
                System.out.println("Decoded text = " + decodedText);
            }
        } catch (IOException e) {
            System.out.println("Could not decode QR Code, IOException :: " + e.getMessage());
        }
    }

	
	
/*	private static String decodeQRCode(File qrCodeimage) {
		
		try {
			BufferedImage bufferedImage = ImageIO.read(qrCodeimage);
			LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage); 
			BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
			
			Result result = new MultiFormatReader().decode(bitmap);
			return result.getText();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("There is no QR code in the image");
			
		}
		return null;
	}*/

	 private static String decodeQRCode(File qrCodeimage) throws IOException {
	        BufferedImage bufferedImage = ImageIO.read(qrCodeimage);
	        LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
	        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

	        try {
	            Result result = new MultiFormatReader().decode(bitmap);
	            return result.getText();
	        } catch (NotFoundException e) {
	            System.out.println("There is no QR code in the image");
	            return null;
	        }
	    }

}
