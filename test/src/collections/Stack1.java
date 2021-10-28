package collections;

import java.util.Stack;

public class Stack1 {
public static void main(String[] args) {
	Stack stk= new Stack();  
	// checking stack is empty or not  
	boolean result = stk.empty();  
	System.out.println("Is the stack empty? " + result);  
	// pushing elements into stack  
	stk.push(78);  
	stk.push(113);  
	stk.push(90);  
	stk.push(120);  
	System.out.println(stk);
	stk.pop();
	System.out.println(stk);
	stk.push("sindhu");  
	//prints elements of the stack  
	System.out.println("Elements in Stack: " + stk);  
	result = stk.empty();  
	System.out.println("Is the stack empty? " + result);  
	

}
}
