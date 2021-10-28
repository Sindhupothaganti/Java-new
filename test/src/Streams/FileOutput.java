package Streams;

import java.io.FileOutputStream;

public class FileOutput {
public static void main(String[] args) {
	  try{    
          FileOutputStream fout=new FileOutputStream("C:\\Users\\spothaganti2\\OneDrive - DXC Production\\Desktop\\testoutput.txt");    
	fout.write(69);
	fout.close();
	System.out.println("success");
}
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
}}
