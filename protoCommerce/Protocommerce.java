package rahulacademy;

import java.sql.Driver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rahul_academy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdrive.chrome.driver","/Users/macbookair/Documents/Selenium_FIles/chromedriver_mac_arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		enter_form();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));//waits for the specified time to execute and always on top 
		url_info();

	}
	public static void enter_form() throws InterruptedException
	{
		System.setProperty("Webdrive.chrome.driver","/Users/macbookair/Documents/Selenium_FIles/chromedriver_mac_arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximizes the window
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("sita");
		//Thread.sleep(10000);
		driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
		//Thread.sleep(5000);
		WebDriverWait P_wait = new WebDriverWait(driver, Duration.ofSeconds(50));//before using explicit wait making the object is compulsory
		//P_wait.until(ExpectedCondition.visibilityOf(driver.findElement(By.id("exmapleCheck1"))));
		
		//P_wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("exampleCHeck1"))));//use of explicit wait
		
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		//select gender from drop down
		Select Gender = new Select(driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")));
		Gender.selectByVisibleText("Female");
		driver.findElement(By.name("bday")).sendKeys("20/12/2022");
		driver.findElement(By.xpath("//body/app-root[1]/form-comp[1]/div[1]/form[1]/input[1]")).submit();
	}
	public static void url_info() {
		System.setProperty("Webdrive.chrome.driver","/Users/macbookair/Documents/Selenium_FIles/chromedriver_mac_arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		System.out.println(driver.getTitle());//gets the title of the tab
		System.out.println(driver.getCurrentUrl());//gets the current url
		
		
	}

}
