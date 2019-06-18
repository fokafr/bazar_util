package com.bazar.training.main;

import java.io.File;

import com.bazar.training.freemarker.FreeMarkerMainTest;
import com.bazar.training.freemarker.TestAppQuicktart;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        //System.out.println( "Hello World!" );
    	//FreeMarkerMainTest.excecute();
    	//TestAppQuicktart.execute();
    	String fich = "qrcode-01.png";
    	File chemin = new File(fich);
    	System.out.println(chemin.getAbsolutePath());
    	//System.out.println(chemin.getCanonicalPath());
    }
}
