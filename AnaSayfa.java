package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnaSayfa {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		WebElement fullname = driver.findElement(By.id("userName"));
		fullname.click();
		fullname.sendKeys("Berkuk Karacay");
		
		WebElement emailAdresi = driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"name@example.com\"]"));
		emailAdresi.click();
		emailAdresi.sendKeys("berkuk@lughra.com");
		
		WebElement currentAdresimiz = driver.findElement(By.cssSelector(".form-control[placeholder=\"Current Address\"]"));
		currentAdresimiz.click();
		currentAdresimiz.sendKeys("Montclair,New Jersey");
		
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,450)", args);
		
		WebElement permenantAdresimiz = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		permenantAdresimiz.click();
		permenantAdresimiz.sendKeys("Midland,New Jersey");
		
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		submitButton.click();
		
		driver.quit();	
		
		
		
		
		
		
		
		
		
//		WebElement element1 = driver.findElement(By.id("userName")).sendKeys("Berkuk");
//		WebElement element2 = driver.findElement(By.cssSelector(""));
//		WebElement element3 = driver.findElement(By.xpath(""));
//		WebElement element4 = driver.findElement(By.name(""));
//		WebElement element5 = driver.findElement(By.linkText(""));
//		WebElement element6 = driver.findElement(By.partialLinkText(""));
//		WebElement element7 = driver.findElement(By.className(""));
//		WebElement element8 = driver.findElement(By.tagName(""));

	}

}
