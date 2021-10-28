package Streams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutput {
public static void main(String[] args)
	throws Exception{    
	     FileOutputStream fout=new FileOutputStream("C:\\Users\\spothaganti2\\OneDrive - DXC Production\\Desktop\\testoutput.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="Welcome to DXC im sindhu pothaganti"; 
	     String c="hello everyone";
	     byte b[]=s.getBytes();   
	     byte b1[]=c.getBytes(); 
	     bout.write(b1);
	     bout.write(b);
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");    
}
}
