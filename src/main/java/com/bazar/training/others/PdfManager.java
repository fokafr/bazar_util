package com.bazar.training.others;

import java.beans.Statement;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PdfManager {


public static void generatePdfFile() {
	try {
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;	
		String connectionURL = null;
        Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection(connectionURL, "sa", "sa");
        statement = (Statement) connection.createStatement();
        rs = ((java.sql.Statement) statement).executeQuery("SELECT fileName,blobFile FROM tblBlobFiles");
     
     
        if (rs.next()) {
  
String filename = rs.getString(1);
           Blob blob = rs.getBlob(2);
          InputStream is = blob.getBinaryStream();
              FileOutputStream fos = new FileOutputStream("C:\\DownloadedFiles"+ "\\" + filename);
 
int b = 0;
while ((b = is.read()) != -1)
{
    fos.write(b); 
}
        }
    } catch (IOException e) 
    {
    e.getMessage (); e.printStackTrace(); 
System.out.println(e); 
    } 
    catch (SQLException e) 
    {
    e.getMessage (); e.printStackTrace(); 
System.out.println(e); 
    } catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	
}
