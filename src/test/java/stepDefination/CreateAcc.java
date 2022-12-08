package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

//import junit.framework.Assert;
import org.junit.Assert;

public class CreateAcc {
	
	ChromeDriver driver;
//	WebDriverWait wait;

    	@Before
    		public void setUp() throws Exception{
    		System.setProperty("webdriver.chrome.driver", 
    				"chromedriver.exe"); 
    		driver = new ChromeDriver();
//    		wait = new WebDriverWait(driver,30);
    		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    	}
	
	@Given("User must be on homepage by clicking on url {string}")
	public void user_must_be_on_homepage_by_clicking_on_url(String string) {
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver=new ChromeDriver();
		driver.get(string);
	}

	@When("User click on Start Here button")
	public void user_click_on_start_here_button() {
		Actions action = new Actions(driver);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		driver.findElement(By.linkText("Start here.")).click();
	}

	@Then("User should be directed to SignUp page")
	public void user_should_be_directed_to_sign_up_page() {
	    String checker=driver.findElement(By.cssSelector("#ap_register_form > div > div > h1")).getText();
	    Assert.assertEquals("Create account", checker);
	}
		
	
	@When("User leaves name field empty")
	public void user_leaves_name_field_empty() {
		driver.findElement(By.id("ap_customer_name")).sendKeys("");
	}

	@When("Click on Continue button")
	public void click_on_continue_button() {
		driver.findElement(By.id("continue")).click();
	}

	@Then("Error should be displayed under Name field")
	public void error_should_be_displayed_under_name_field() {
		Boolean check=driver.findElement(By.xpath("//*[@id=\"auth-customerName-missing-alert\"]/div/div")).isDisplayed();
		Assert.assertEquals(true, check);
	}
	
	@When("User enters name in name field")
	public void user_enters_name_in_name_field()
	{
		driver.findElement(By.id("ap_customer_name")).sendKeys("Rohit Garg");
	}

	@Then("Error should not be displayed under Name field")
	public void error_should_not_be_displayed_under_Name_field() {
		Boolean check=driver.findElement(By.xpath("//*[@id=\"auth-customerName-missing-alert\"]/div/div")).isDisplayed();
		Assert.assertEquals(false, check);
	}
	
	@When("User enters mobile number in mobile field")
	public void user_enters_mobile_number_in_mobile_field()
	{
		driver.findElement(By.id("ap_email")).sendKeys("7468289547");
	}
	
	@Then("Error should not be displayed under mobile field")
	public void error_should_not_be_displayed_under_mobile_field() {
		Boolean check=driver.findElement(By.id("auth-email-missing-alert")).isDisplayed();
		Assert.assertEquals(false, check);
	}
	
	@When("User does not enters mobile number in mobile field")
	public void user_does_not_enters_mobile_number_in_mobile_field()
	{
		driver.findElement(By.id("ap_email")).clear();;
	}
	
	@When("Click on password field")
	public void click_on_password_field() {
		driver.findElement(By.id("ap_password")).click();
	}
	
	@Then("verify mobile button should be active")
	public void verify_mobile_button_should_be_active() {
		String check=driver.findElement(By.id("continue")).getText();
		Assert.assertEquals("Verify mobile number", check);
	}
	
	@When("User enters email in mobile field")
	public void user_enters_email_in_mobile_field()
	{
		driver.findElement(By.id("ap_email")).sendKeys("bansalankur834@gmail.com");
	}
	
	@Then("verify email button should be active")
	public void verify_email_button_should_be_active() {
		String check=driver.findElement(By.id("continue")).getText();
		Assert.assertEquals("Verify email", check);
	}
	@When("^User type wrong (.*) in password field$")
	public void user_type_wrong_password_in_password_field(String password)
	{
		driver.findElement(By.id("ap_password")).sendKeys(password);
	}
	
	@Then("Error should be displayed under password field")
	public void error_should_be_displayed_under_password_field() {
		Boolean check=driver.findElement(By.id("auth-password-missing-alert")).isDisplayed();
		Assert.assertEquals(true, check);
	}
	
	@When("User type correct password in password field")
	public void user_type_correct_password_in_password_field()
	{
		driver.findElement(By.id("ap_password")).sendKeys("B@nsalankur834");
	}
	
	@Then("Error should not be displayed under password field")
	public void error_should_not_be_displayed_under_password_field() {
		Boolean check=driver.findElement(By.id("auth-password-missing-alert")).isDisplayed();
		Assert.assertEquals(false, check);
	}
	
	@When("User type same password in re-enter password field")
	public void user_type_same_password_in_reenter_password_field()
	{
		driver.findElement(By.id("ap_password")).sendKeys("B@nsalankur834");
	}

	@Then("Error should not be displayed under reenter password field")
	public void error_should_not_be_displayed_under_reenter_password_field() {
		Boolean check=driver.findElement(By.id("auth-password-mismatch-alert")).isDisplayed();
		Assert.assertEquals(false, check);
	}
	
	@When("User type different password in reenter password field")
	public void user_type_different_password_in_reenter_password_field()
	{
		driver.findElement(By.id("ap_password")).sendKeys("ankur834");
	}
	
	@Then("Error should be displayed under reenter password field")
	public void error_should_be_displayed_under_reenter_password_field() {
		Boolean check=driver.findElement(By.id("auth-password-mismatch-alert")).isDisplayed();
		Assert.assertEquals(true, check);
	}
	
	@After
	public void close() {
		driver.close();
	}
	
}

