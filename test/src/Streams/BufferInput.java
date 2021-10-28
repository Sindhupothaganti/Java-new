package Streams;

import java.io.*;

public class BufferInput {
	public static void main(String args[]){    
		  try{    
		    FileInputStream fin=new FileInputStream("C:\\Users\\spothaganti2\\OneDrive - DXC Production\\Desktop\\testoutput.txt");    
		    BufferedInputStream bin=new BufferedInputStream(fin);    
		    int i;    
		    while((i=bin.read())!=-1)
		    {    
		     System.out.print((char)i);    
		    }    
		    bin.close();    
		    fin.close();    
		  }
		  catch(Exception e){System.out.println(e);
		  }    
		  }
}
