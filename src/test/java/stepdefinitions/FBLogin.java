package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBLogin {
	WebDriver driver;

	@Given("Open FB url using any browser")
	public void openURL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("User type invalid test data as UN and PSWD")
	public void typeInvalidCredentials() {
		driver.findElement(By.name("email")).sendKeys("sdgrwqewdsg@sdgsdgdsg.dsg");
		driver.findElement(By.name("pass")).sendKeys("sdgrwqewdsg");
	}

	@And("click on Login button")
	public void clickLoginButton() throws Exception {
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
	}

	@Then("system should display error message")
	public void verifyErroMsg() {
		if (driver.findElements(By.linkText("Find your account and log in.")).size() > 0
				|| driver.findElements(By.linkText("Create a new Facebook account.")).size() > 0) {
			System.out.println("Given credential are in-valid***");
		} else {
			System.out.println("Given credential are valid***");
		}
	}
	
	@When("User type valid test data as UN and PSWD")
	public void typevalidCredentials() {
		driver.findElement(By.name("email")).sendKeys("h2otestingtools@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Test@123");
	}
}
