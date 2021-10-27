package UnitTest;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class Simple extends TestCase {
	@Test
	public void run()
{
	int actual=Sub.sing(33,13);
	int expected=12;
	assertEquals(expected,actual);
}

}
class Sub{
	static int sing(int a,int b)
	{
		 int actual=a-b;
		return actual;
	}
}