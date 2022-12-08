package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signIn {

	ChromeDriver driver;
		@Before
		public void setUp() throws Exception{
			System.setProperty("webdriver.chrome.driver", 
					"chromedriver.exe"); 
			driver = new ChromeDriver();
		//	wait = new WebDriverWait(driver,30);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		}
		
		//Sign In page code
		
		@Given("user clicks on singin button")
		public void user_clicks_on_singin_button() {
			Actions action=new Actions(driver);
			action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
			driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		}

		@When("User enters unregistered email in email mobile field")
		public void user_enters_unregistered_email_in_email_mobile_field() {
			driver.findElement(By.id("ap_email")).sendKeys("bansalankur0007@gmail.com");
		}

		@Then("Error should be displayed under email mobile field")
		public void error_should_be_displayed_under_email_mobile_field() {
			Boolean check=driver.findElement(By.id("auth-error-message-box")).isDisplayed();
			Assert.assertEquals(true, check);
		}
		
		@When("User enters preregistered email in email mobile field")
		public void user_enters_preregistered_email_in_email_mobile_field() {
			driver.findElement(By.id("ap_email")).sendKeys("bansalankur834@gmail.com");
		}

		@Then("user should be directed to password page")
		public void user_should_be_directed_to_password_page() {
			String check=driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/div/form/div/div[1]/div[1]/div[1]/label")).getText();
			Assert.assertEquals("Password", check);
		}
		
		@When("User enters unregistered mobile number in email mobile field")
		public void user_enters_unregistered_mobile_number_in_email_mobile_field() {
			driver.findElement(By.id("ap_email")).sendKeys("437");
		}
		
		@When("User enters preregistered mobile number in email mobile field")
		public void user_enters_preregistered_mobile_number_in_email_mobile_field() {
			driver.findElement(By.id("ap_email")).sendKeys("4379867511");
		}
		
		@Given("user enters correct password in password field")
		public void user_enters_correct_password_in_password_field() {
			driver.findElement(By.id("ap_password")).sendKeys("B@nsalankur834");
		}

		@When("Keep me signin checkbox is clickable")
		public void keep_me_signin_checkbox_is_clickable() {
			driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/div/form/div/div[2]/div/div/label/div/label/input")).click();
		}

		@When("Click on signin button")
		public void click_on_signin_button() {
			driver.findElement(By.id("id=\"signInSubmit\"")).click();
		}

		@Then("user should be directed to homepage")
		public void user_should_be_directed_to_homepage() {
		    String url=driver.getCurrentUrl();
		    Assert.assertEquals("https://www.amazon.com/ref=nav_signin", url);
		}
		
		@When("User hover on Hello name")
		public void user_hover_on_hello_name() {
			Actions action=new Actions(driver);
			action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
			driver.findElement(By.id("nav-al-your-account")).click();
		}

		@When("Clicks on Your Account page")
		public void clicks_on_your_account_page() {
			driver.findElement(By.id("nav-al-your-account")).click();
		}

		@Then("User should be directed to Account page")
		public void user_should_be_directed_to_account_page() {
			String url=driver.getCurrentUrl();
		    Assert.assertEquals("https://www.amazon.com/gp/css/homepage.html?ref_=nav_AccountFlyout_ya", url);
		}
		
		
		
		@After
		public void close() {
			driver.close();
		}
}
