package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepsdefins {

	  WebDriver driver;
	@Given("user opens login portal")
	public void user_opens_login_portal() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Training_c2d.02.11\\\\Downloads\\\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com");
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String un) {
		 driver.findElement(By.name("userName")).sendKeys(un);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String psd) {
		  driver.findElement(By.name("password")).sendKeys(psd);
	}

	@When("Clicks on singn button")
	public void clicks_on_singn_button() {
		  // System.out.println("click signin");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("validate login success")
	public void validate_login_success() {
		//System.out.println("login sucess");
				Assert.assertTrue(driver.getTitle().contains("Flight"));
				  driver.close();
	}


	
}
