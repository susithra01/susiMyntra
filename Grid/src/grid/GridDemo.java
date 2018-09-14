package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo {

	@Test	public  void sample() throws MalformedURLException{
		// TODO Auto-generated method stub
		DesiredCapabilities cap = DesiredCapabilities.chrome();//DesiredCapabilities- i scalss in selenium env.
		cap.setPlatform(Platform.WINDOWS);
		
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url,cap);
		System.setProperty("WebDriver.chrome.driver", "D:/Selenium/Drivers/chromedriver/chromedriver.exe");
		driver.get("https://www.myntra.com");
		driver.getTitle();
	}

}
