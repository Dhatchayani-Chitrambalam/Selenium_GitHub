package guru99.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest
{
	protected WebDriver driver;

	@Test
	public void guru99Tutorials() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		String eTitle = "Meet Guru99";
		String aTitle = "";

		driver.get("https://www.guru99.com");
		driver.manage().window().maximize();
		aTitle = driver.getTitle();

		if (aTitle.contentEquals(eTitle))
		{
			System.out.println("Test Passed");

		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.close();
	}
}
// import junit.framework.Test;
// import junit.framework.TestCase;
// import junit.framework.TestSuite;
//
/// **
// * Unit test for simple App.
// */
// public class AppTest
// extends TestCase
// {
// /**
// * Create the test case
// *
// * @param testName name of the test case
// */
// public AppTest( String testName )
// {
// super( testName );
// }
//
// /**
// * @return the suite of tests being tested
// */
// public static Test suite()
// {
// return new TestSuite( AppTest.class );
// }
//
// /**
// * Rigourous Test :-)
// */
// public void testApp()
// {
// assertTrue( true );
// }
// }
