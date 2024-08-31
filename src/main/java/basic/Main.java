package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {

	public static RemoteWebDriver driver;
	public static WebDriver wait;

	public static void browserLaunch(String bname) {

		if (bname.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("Edge")) {

			WebDriverManager.chromedriver().setup();

			driver = new EdgeDriver();
		}
	}
}
