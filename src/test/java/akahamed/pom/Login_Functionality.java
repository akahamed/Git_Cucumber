package akahamed.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Functionality {

	WebDriver driver;

	@Given("^User should be in the homepage$")
	public void user_should_be_in_the_homepage() throws Throwable {
		driver = Utilityclass.getDriver("chrome");
		driver.get("http://newtours.demoaut.com/");
	}

	@When("^User enters the valid credentials\\.$")
	public void user_enters_the_valid_credentials() throws Throwable {
		Pages login = PageFactory.initElements(driver, Pages.class);
		login.login_new("akahamed", "Abcd1234");
	}

	@Then("^User must be in home page and display success message\\.$")
	public void user_must_be_in_home_page_and_display_success_message() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		System.out.println("Logged in Successfully !!");
		driver.close();
	}
}
