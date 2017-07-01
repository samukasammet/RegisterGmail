package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	static WebDriver driver;
	public RegisterPage(WebDriver driver){
		this.driver = driver;	
			
		}
	public void FillFilds() throws Exception{
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("TesteName");
		WebElement lastName = driver.findElement(By.name("LastName"));
		lastName.sendKeys("Test Laast Name");
		WebElement gmail = driver.findElement(By.id("GmailAddress"));
		gmail.sendKeys("adjnsdkahsdnjsds@gmail.com");
		WebElement pswd = driver.findElement(By.id("Passwd"));
		pswd.sendKeys("Test12345");
		WebElement pswdAgain = driver.findElement(By.name("PasswdAgain"));
		pswdAgain.sendKeys("Test12345");
		
		WebElement birthDay = driver.findElement(By.id("BirthDay"));
		birthDay.sendKeys("04");
		
		Thread.sleep(500);
		WebElement birthMonth = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div"));
		birthMonth.click();
		
		Thread.sleep(500);
		WebElement birthMonthSelect = driver.findElement(By.xpath(".//*[@id=':3']/div"));		
		birthMonthSelect.click();
		
		Thread.sleep(500);
		WebElement birthYear = driver.findElement(By.id("BirthYear"));
		birthYear.sendKeys("1986");
		
		Thread.sleep(500);
		WebElement gender = driver.findElement(By.xpath(".//*[@id='Gender']/div[1]"));
		gender.click();
		
		Thread.sleep(500);
		WebElement genderSelect = driver.findElement(By.xpath(".//*[@id=':f']/div"));
		genderSelect.click();
		
		Thread.sleep(500);
		WebElement recoveryPhoneNumber = driver.findElement(By.id("RecoveryPhoneNumber"));
		recoveryPhoneNumber.sendKeys("19998989999");
		
		Thread.sleep(500);
		WebElement recoveryEmailAddress = driver.findElement(By.id("RecoveryEmailAddress"));
		recoveryEmailAddress.sendKeys("test244355@gmail.com");
		
		Thread.sleep(500);
		WebElement country = driver.findElement(By.xpath(".//*[@id=':i']"));
		country.click();
		
		Thread.sleep(500);
		WebElement countrySelect = driver.findElement(By.xpath(".//*[@id=':1e']/div"));
		countrySelect.click();
		
		Thread.sleep(500);
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
		
		Thread.sleep(500);
		WebElement scroll1 = driver.findElement(By.xpath(".//*[@id='tos-scroll-button']/div/img"));
		scroll1.click();
		
		Thread.sleep(500);
		WebElement scroll2 = driver.findElement(By.xpath(".//*[@id='tos-scroll-button']/div/img"));
		scroll2.click();
		
		Thread.sleep(1000);
		WebElement agreeAction = driver.findElement(By.xpath(".//*[@id='iagreebutton']"));
		agreeAction.click();
	}

}
