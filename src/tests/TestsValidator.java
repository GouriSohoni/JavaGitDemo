package tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestsValidator {
	@Test
	public void ValidatorTest()
	{
		tests.Validator target = new tests.Validator();
		boolean act,exp=true;
		act = target.Validate("Gouri", "Sohoni");
		assertEquals(exp,act);
	}
}
