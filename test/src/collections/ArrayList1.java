package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {
public static void main(String[] args) {
	ArrayList<String> name=new ArrayList();
	name.add("sindhu");
	name.add("kuamri");
	name.add("priya");
	name.add("anusha");
	name.add("bhu");
	//name.add(33);
	Iterator itr=name.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
}
	Collections.sort(name);
	for(String Name:name)
	{
		System.out.println(name);
	}
}
}
