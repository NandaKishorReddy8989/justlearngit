package seleniumCssParcticePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagAttributeCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//SeleniumJavaProject//webDriver//NewWebDriver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.cssSelector("input[title=Search]")).sendKeys("Attribute text");

	}

}
