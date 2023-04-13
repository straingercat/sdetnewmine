package practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTest {
	@Test
	public void test() {
		System.out.println("execute property");
		String url = System.getProperty("url");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		
		
	}

}