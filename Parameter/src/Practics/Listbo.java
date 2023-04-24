package Practics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbo {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.com/");
		    WebElement popcl=driver.findElement(By.xpath("//input[ @data-action-type=\"DISMISS\"]"));
			if(popcl.isDisplayed()) {
				popcl.click();
			}
		    
			driver.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]")).click();
			List<WebElement> azli=driver.findElements(By.xpath("//ul[@class=\"hmenu hmenu-visible\"]/li"));
			System.out.println(azli.size());
			Thread.sleep(2000);
			
			for(int i=0;i<azli.size();i++) {
			 System.out.println(azli.get(i).getText());
			 
			 if(azli.get(i).getText().equals("Electronics")) {
			 Thread.sleep(2000);
			   azli.get(i).click();						
			 }
			
		driver.close();	
	}
	}
}
