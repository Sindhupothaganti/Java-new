package collections;

import java.util.Vector;

public class Vector1 {
public static void main(String[] args) {
	Vector<String> vec=new Vector<String>();
	vec.add("horse");
	vec.add("elephant");
	vec.add("dog");
	//adding elements by using addElement()
	vec.addElement("cow");
	vec.addElement("tiger");
	 Vector<Integer>  vector = new Vector<Integer>(); 
	 vector.add(22);  
     vector.add(33);  
     System.out.println("Existence: "+vec.containsAll(vector));  
}
}
