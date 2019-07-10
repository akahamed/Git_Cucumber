package akahamed.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utilityclass {
	static WebDriver driver;
	  public static WebDriver getDriver(String browser)
	  {
		  if (browser.equalsIgnoreCase("Firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\Training_C2a.04.30\\Desktop\\Drivers\\geckodriver.exe");
		      driver = new FirefoxDriver();
//			  driver.get("http://www.google.com");
		  }
		  else if (browser.equalsIgnoreCase("Chrome")) 
		  {
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_C2a.04.30\\Desktop\\Drivers\\chromedriver.exe");
		      driver = new ChromeDriver();
			  //driver.get("http://www.google.com");
		}
		  else if (browser.equalsIgnoreCase("internetexplorer"))
		  {
			  System.setProperty("webdriver.ie.driver","C:\\Users\\Training_C2a.04.30\\Desktop\\Drivers\\IEDriverServer.exe");
		      driver = new InternetExplorerDriver();
			  driver.get("http://www.google.com");
		  }
		  else 
		  {
			  System.out.println("Invalid Browser");
		  }
		  return driver;
	  }
}
