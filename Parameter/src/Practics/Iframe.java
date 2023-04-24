package Practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
        driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		driver.switchTo().frame("//iframe[@src=\"MultipleFrames.html\"]");
		driver.close();				
	}
}
