package Streams;

import java.io.*;

public class SequenceInput {
public static void main(String[] args) 
	throws Exception{    
		   FileInputStream input1=new FileInputStream("C:\\Users\\spothaganti2\\OneDrive - DXC Production\\Desktop\\testoutput.txt");    
		   FileInputStream input2=new FileInputStream("C:\\Users\\spothaganti2\\OneDrive - DXC Production\\Desktop\\testoutput.txt");    
		   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		   int j;    
		   while((j=inst.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   inst.close();    
		   input1.close();    
		   input2.close();    	
}
}
