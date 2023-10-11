package testScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOpenCart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String strTitle = (String)js.executeScript("return document.title");
		
		System.out.println("Page Title...."+ strTitle);
		WebElement srcBox = (WebElement)js.executeScript("return document.getElementByName('search')[0]");
        srcBox.sendKeys("phone");
	}

}
