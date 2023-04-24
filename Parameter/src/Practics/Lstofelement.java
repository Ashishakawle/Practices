package Practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lstofelement {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Register.html");
			WebElement Ele=driver.findElement(By.xpath("//select[@type=\"text\"][1]"));
		    Select Sc=new Select(Ele);
	    	Sc.selectByVisibleText("C");	        	 
   }
}