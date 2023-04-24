package Practics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Iframes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
	       WebDriver d=new ChromeDriver();
	       d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	       System.out.println("enter");
	       d.switchTo().frame("iframeResult");
	       System.out.println("go");
	       Thread.sleep(2000);
	       String ele=d.findElement(By.xpath("//h2[contains(text(),'My First JavaScript')]")).getText();
	       System.out.println(ele);
	       Thread.sleep(2000);
	       System.out.println("hello");
	       Thread.sleep(4000);
           d.close();
	}
}
