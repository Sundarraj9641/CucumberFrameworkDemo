package com.step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("User is on Registration Page")
	public void user_is_on_Home_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.navigate().to("http://register.rediff.com/register/register.php?FormName=user_details");
	  
	}

	@When("User able to enter details")
	public void user_Navigate_to_LogIn_Page() {
		
		WebElement full_name = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		
		full_name.sendKeys("Sundar raj");
		
		//id
		WebElement id = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		
		id.sendKeys("sundarraj.1545");
	  
	}

	@When("User enters UserName and Password")
	public void user_enters_UserName_and_Password() {
		System.out.println("User enters UserName and Password");
	    
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
	   System.out.println("Message displayed Login Successfully");
	}

	@When("User Logout from the Application")
	public void user_Logout_from_the_Application() {
	   System.out.println("User Logout from the Application");
	}

	@Then("Message displayed Logout Successfully")
	public void message_displayed_Logout_Successfully() {
	    System.out.println("Message displayed Logout Successfully");
	}


}
