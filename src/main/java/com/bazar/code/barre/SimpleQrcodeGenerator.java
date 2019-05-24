package com.bazar.code.barre;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class SimpleQrcodeGenerator {

	public static void main(String[] args) {
		String data = "Je suis Aymar et je suis un méchant.";
		int size = 400;
		String imageFormat = "png";
		String outputFileName = "resourcesData/qrcode-01."+imageFormat;
		 // encode
        try {
			BitMatrix bitMatrix = generateMatrix(data, size);
			   // write in a file
	        writeImage(outputFileName, imageFormat, bitMatrix);
			
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static BitMatrix generateMatrix(String data, int size) throws WriterException {
		return new QRCodeWriter().encode(data, BarcodeFormat.QR_CODE, size, size);
	}
	
	private static void writeImage(String outputFileName, String imageFormat, BitMatrix bitMatrix) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(new File(outputFileName));
			MatrixToImageWriter.writeToStream(bitMatrix, imageFormat, fileOutputStream);
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
