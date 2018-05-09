package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	WebElement unTB;
	
	@FindBy(name="pwd")
	
	WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	
	WebElement loginBTN;
			
   
	public LoginPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}

	
	public void setUsername(String un){
		
	   unTB.sendKeys(un);
	}
	
	
	public void setPassword(String pwd){
		
		pwTB.sendKeys(pwd);
		}
	
	public void clickLogin(){
		loginBTN.click();
	}
	
	
	
	
	
	
	
	
	
	
}
