package tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Before;
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
		int act,exp=15;
		act = target.Sum(15, 0);
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
	WebDriver driver=null;
	@Before
    public void StartUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\SeleniumJava\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@After
	public void CleanUp()
	{
		driver.quit();
	}
	@Test
	public void StartGoogle() throws InterruptedException
	{
		driver.get("http://www.ssgsonline.com");
		Thread.sleep(5);
	}

}
