package UnitTest;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestJava1 {
	int value1, value2;
	   
	   // assigning the values
	@Test
	  public void setUp(){
	      value1 = 3;
	      value2 = 3;
	   }
      // test method to add two values
	   public void testAdd(){
	      double result = value1 + value2;
	      assertTrue(result == 6);
}
}