package Stepdefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class naukaristep {
    WebDriver driver;
		@SuppressWarnings("deprecation")
		@Given("Open the naukari url")
		public void open_the_naukari_url() {
		WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         driver.get("https://www.naukri.com/nlogin/login");
		}

		@And("Its a login page or not")
		public void its_a_login_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.naukri.com/nlogin/login");
        System.out.println(driver.getCurrentUrl());
		}

		@When("put the usrid and password")
		public void put_the_usrid_and_password() {
			driver.findElement(By.id("login_Layer")).click();
	        
			driver.findElement(By.id("usernameField")).sendKeys("ashishkawale095@gmail.com");

			driver.findElement(By.id("passwordField")).sendKeys("ashishkawale2022"); 

			driver.findElement(By.xpath("//span[@class=\"showhide blue-text\"]")).click();

			driver.findElement(By.xpath("//button[contains(text(),'Login')and @type=\"submit\"]")).click();
           
		}

		@And("validate open home page or not")
		public void validate_open_home_page_or_not() {
           Assert.assertEquals(driver.getTitle(), "Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com");
           System.out.println(driver.getTitle());
		}

		@Then("validate the file uplod or not")
		public void validate_the_file_uplod_or_not() throws InterruptedException {
			driver.findElement(By.xpath("//div[@class=\"nI-gNb-drawer\"]")).click();

			driver.findElement(By.xpath("//a[contains(text(),'View & Update Profile')]")).click();
			
			WebElement resume=driver.findElement(By.id("attachCV"));
			 Thread.sleep(2000);
			resume.sendKeys("C:\\Users\\Admin\\Desktop\\ALL be software testing\\7972408941\\(Ashishkawale).pdf");
			
		}

		@And("user closed the brawoser")
		public void user_closed_the_brawoser() throws InterruptedException {
			 Thread.sleep(5000);
            driver.close();
            System.out.println("Closed the brawoser");
		}

	}

