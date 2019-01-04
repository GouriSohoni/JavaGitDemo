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
}
