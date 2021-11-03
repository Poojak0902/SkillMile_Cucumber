package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {
	
	WebDriver driver;
	
	public void Setup(String browser, String url) {
		
		String currdir= System.getProperty("user.dir");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", currdir+"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",currdir+"\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", currdir + "\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}else {
			System.out.println("The chosen browser is not valid, Please provide valid browser name");
			System.exit(0);
		}
		driver.manage().window().maximize();
		
		if (url!=null) {
			driver.get(url);	
		}else {
			driver.get("about:blank");
		}
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		}
	
	public void teardown() {
		driver.quit();
	}
	
	public WebDriver getdriver() {
		return driver;
	}

}
