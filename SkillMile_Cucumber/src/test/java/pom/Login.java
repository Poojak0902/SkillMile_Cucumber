package pom;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login {
	WebDriver driver;
	
	
	@CacheLookup
	@FindBy(xpath="//*[@class='css-ya5i48 evkjyb01']//a")
	WebElement signin;
	
	@CacheLookup
	@FindBy(id="username")
	WebElement username;
	
	@CacheLookup
	@FindBy(id="password")
	WebElement password;
	
	@CacheLookup
	@FindBy(xpath="//button[@class='css-vfxkzw edzik9p0']")
	WebElement signinbtn;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void valdiatelandingpage(String expectedurl) {
		String Actual=driver.getCurrentUrl();
		String Expected=expectedurl;
		System.out.println("URL is not valid URL >>This is actual url"+ Actual);
		Assertions.assertTrue(Expected.equals(Actual), "URL is not valid URL >>This is actual url"+ Actual);
	}
	public void clickSignin() {
		Assertions.assertTrue(signin.isDisplayed(), "Sign in is not displayed");
		signin.click();
	}
	public void Logincredentails(String un, String pw) {
		Assertions.assertTrue(username.isDisplayed(), "Username is not displayed");
		username.sendKeys(un);
		Assertions.assertTrue(password.isDisplayed(), "Password is not displayed");
		username.sendKeys(pw);
		
	}
	
	public void clicksignin() {
		Assertions.assertTrue(signinbtn.isDisplayed(), "Signin button is not displayed");
		signinbtn.click();
		System.out.println("This is new change to show push");
	}
	
	
	

}
