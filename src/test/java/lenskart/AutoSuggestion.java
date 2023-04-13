package lenskart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lenskart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("q"));
		Select s=new Select(ele);
		Thread.sleep(3000);
				s.selectByValue("Eyeglasses");
				Thread.sleep(3000);
		List<WebElement> f = s.getOptions();
		Thread.sleep(3000);
				System.out.println(f.size());
		for(WebElement g:f)
			System.out.println(g.getText());
		
		driver.close();
		


	}

}
