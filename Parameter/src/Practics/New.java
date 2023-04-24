package Practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://demo.automationtesting.in/Frames.html");
		 Thread.sleep(2000);
        drive.findElement(By.xpath("//a[@class=\"analystic\" and @ href=\"#Multiple\"]")).click();
        System.out.println("Print");
        drive.switchTo().frame(1);
        System.out.println("Print web");
        
        
        Thread.sleep(4000);
        drive.close();
        
	}
}
