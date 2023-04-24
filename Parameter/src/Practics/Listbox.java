package Practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//        driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("ashishkawale1@gmail.com");
//        driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("ashishkawale2022");
//        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        Thread.sleep(2000);
          Actions act=new Actions(driver);
         act.moveToElement(driver.findElement(By.xpath("//div[@class=\"eFQ30H\"][6]"))).build().perform();
         Thread.sleep(5000);
         WebElement PI=driver.findElement(By.xpath("//div[@class=\"_3XS_gI _7qr1OC\"]/a[13]"));
         Thread.sleep(2000);
         act.moveToElement(PI).build().perform();
         System.out.println("find out");
         Thread.sleep(5000);
         WebElement So=driver.findElement(By.xpath("//div[@class=\"_3XS_gI\"]//a[3]"));
       Thread.sleep(2000);
         act.moveToElement(So).click().build().perform();
         System.out.println("get final");
         Thread.sleep(5000);  
       driver.close();
	}

}
