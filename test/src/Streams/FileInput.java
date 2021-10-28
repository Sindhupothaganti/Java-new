package Streams;

import java.io.FileInputStream;

public class FileInput {
	  public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("C:\\Users\\spothaganti2\\OneDrive - DXC Production\\Desktop\\testoutput.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e)
          {
        	  System.out.println(e);
        	  }    
         }    
}
