package tests;

public class Validator {
	public boolean Validate(String name, String pwd)
	{
		if (name == "Gouri" && pwd == "Sohoni")
		{
			System.out.println("Passed");
			return true;
		}
		else
		{
			System.out.println("Falied");
			return false;
		}
	}
}
