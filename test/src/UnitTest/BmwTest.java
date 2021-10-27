package UnitTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BmwTest {
	@Test
public void testAdd()
{
	int expected=30;
	int actual=BmwFlyingCar.add(10,20);
	assertEquals(expected,actual);
}
}
