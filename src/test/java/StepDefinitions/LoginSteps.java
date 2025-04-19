package StepDefinitions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;

	@Given("user on the login page")
	public void user_on_the_login_page() 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.get("https://snapmoneytest.micnxt.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	}


	@When("user enters username and password")
	public void user_enters_username_and_password() throws IOException
	{
		driver.findElement(By.id("j_username")).sendKeys("Prasanth");
		driver.findElement(By.id("j_password")).sendKeys("Prasanth@123");
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\Rajsekhar\\eclipse-workspace\\Project\\Screenshots\\screenshot.png"));

	}

	@And("user clicks on the login button")
	public void user_clicks_on_the_login_button() 
	{
		driver.findElement(By.name("submit")).click();

	}

	@Then("user will navigate to home screen")
	public void user_will_navigate_to_home_screen() 
	{


	}

}
