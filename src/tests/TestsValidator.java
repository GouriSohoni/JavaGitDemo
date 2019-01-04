package tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestsValidator {
	@Test
	public void ValidatorTest()
	{
		Validator target = new Validator();
		boolean act,exp=true;
		act = target.Validate("Gouri", "Sooni");
		assertEquals(exp,act);
	}
	@Test
	public void ValidatorTest2()
	{
		Validator target = new Validator();
		boolean act,exp=true;
		act = target.Validate("Gouri", "Sohoni");
		assertEquals(exp,act);
	}
	@Test
	public void ValidatorSum()
	{
		Validator target = new Validator();
		int act,exp=10;
		act = target.Sum(5, 5);
		assertEquals(exp,act);
	}
	@Test
	public void ValidatorSum2()
	{
		Validator target = new Validator();
		int act,exp=10;
		act = target.Sum(5, 15);
		assertEquals(exp,act);
	}
}
