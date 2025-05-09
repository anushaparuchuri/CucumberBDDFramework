package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpensourceLoginLogout {

	WebDriver driver;

	@Given("Open OPENSOURCE url using any browser")
	public void openURL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User type valid test data as UN and PSWD")
	public void typeValidCredentials() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@And("click on Login button")
	public void clickLoginButton() {
		driver.findElement(
				By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();
	}

	@Then("User should be able to login")
	public void ableToLogin() {
		if (driver.findElements(By.xpath("//p[text()='Time at Work']")).size() > 0) {// 1>0
			System.out.println("Given credential are in-valid***");
		}
	}
}
