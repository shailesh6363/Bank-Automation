package bankautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class bankAutomation {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/button")));
		WebElement manager=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/button"));
		manager.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")));
		WebElement addCustomer=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]"));
		addCustomer.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")));
		WebElement firstName=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
		firstName.sendKeys("Pornima");
		WebElement lastName=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"));
		lastName.sendKeys("Avghade");
		Thread.sleep(3000);
		WebElement postalCode=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"));
		postalCode.sendKeys("41111");
		WebElement submit=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
		submit.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		driver.navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]")));
		WebElement openAccount=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]"));
		openAccount.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"userSelect\"]")));
		WebElement user=driver.findElement(By.xpath("//*[@id=\"userSelect\"]"));
		user.click();
		Select select=new Select(user);
		select.selectByIndex(6);
		WebElement currency=driver.findElement(By.id("currency"));
		Select select1=new Select(currency);
		select1.selectByVisibleText("Rupee");
		WebElement procced=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
		procced.click();
		Alert alt1=driver.switchTo().alert();
		alt1.accept();
		WebElement home=driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]"));
		home.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")));
		WebElement customerlogin=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button"));
		customerlogin.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("userSelect")));
		WebElement selectuser=driver.findElement(By.id("userSelect"));
		selectuser.click();
		Select select2=new Select(selectuser);
		select2.selectByIndex(6);
		WebElement login=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button"));
		login.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")));
		WebElement deposit=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]"));
		deposit.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")));
		WebElement amount=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input"));
		amount.sendKeys("15000");
		WebElement submitAmount=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button"));
		submitAmount.click();
		Thread.sleep(3000);
		WebElement logout=driver.findElement(By.xpath("/html/body/div/div/div[1]/button[2]"));
		logout.click();
		driver.quit();
	}

}
