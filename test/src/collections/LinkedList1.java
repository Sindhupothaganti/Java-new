package collections;

import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList();
al.add("gautham");
al.add("harsha");
al.add("shree");
al.add("yaseen");
al.add("balaji");
al.add("nar");
al.add("ram");
al.add("krishna");
Iterator<String> itr=al.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
al.remove("gautham");
System.out.println("after removing  "+al);
// adding an element to specific position
al.add(3,"bunny");
System.out.println("after adding element : "+al);
	}

}
