package Stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("user open the Redbus url")
	public void user_open_the_redbus_url() {
		 WebDriverManager.chromedriver().setup();
		   driver =new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.get("https://www.redbus.in");
	}

	@And("user validate the url")
	public void user_validate_the_url() {
	     
	          Assert.assertEquals(driver.getCurrentUrl(),"https://www.redbus.in/");
	          System.out.println(driver.getCurrentUrl());
	}

	@When("User put the travaling From to Destination At date and click on sarch buttonn")
	public void user_put_the_travaling_from_to_destination_at_date_and_click_on_sarch_buttonn() {
		WebElement from= driver.findElement(By.id("src"));
		 from.sendKeys("Darwha");
		 driver.findElement(By.xpath("//li[@data-id=\"70441\"]")).click();
		 driver.findElement(By.id("dest")).sendKeys("Pune");
		 driver.findElement(By.xpath("//li[@data-id=\"130\"]")).click();
		 driver.findElement(By.id("onward_cal")).click();
		 driver.findElement(By.xpath("//table[@class=\"rb-monthTable first last\"]/tbody/tr[6]/td[7]")).click();
		 driver.findElement(By.id("search_btn")).click();
	}

	@And("user find the buses page are open or not")
	public void user_find_the_buses_page_are_open_or_not() {
		  Assert.assertEquals(driver.getTitle(), "Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India");
		  System.out.println(driver.getTitle());
	}

	@Then("use close the brawose")
	public void use_close_the_brawose() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
