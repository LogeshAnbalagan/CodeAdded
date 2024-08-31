package learn;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basic.Main;

public class Basic extends Main{
	@Test
	public static void main(String[] args) {
	    
		//Actions act = new Actions(driver);

	    browserLaunch("chrome");
		
//		driver.get("https://www.amazon.in/");
//		
//		driver.manage().window().maximize();
//		 
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		
//		WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
//		
//		search.sendKeys("Iphone14");
//		
//		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
//		
//		List<WebElement> phone = driver.findElements(By.xpath("//*[contains(text(),\"iPhone 14 \")]"));
//		
//		System.out.println(phone);
//		
//	    driver.close();
	    
	    driver.get("https://www.swiggy.com/");
	    
	    driver.manage().window().maximize();
	   
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//div[@class=\"_2CgXb\"]")).click();
	    
	    driver.quit();
	    
	    
		
		
		
	}

}
