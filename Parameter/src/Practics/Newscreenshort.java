package Practics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Newscreenshort {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https:\\www.facebook.com");
         File sour=((TakesScreenshot)drive).getScreenshotAs(OutputType.FILE);
         File dest= new File(".\\Screenshot\\pic.jpg");
         FileHandler.copy(sour, dest);
	}
}
