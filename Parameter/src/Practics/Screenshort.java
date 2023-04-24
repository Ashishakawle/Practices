package Practics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;


public class Screenshort {

	public static void main(String[] args) throws IOException {
	    System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
           File Sou=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           String random= RandomString.make(2);
		File dest=new File(".//Screenshot//Flipkart"+random+".jpg");
		FileHandler.copy(Sou, dest);
        driver.close();
	}

}
