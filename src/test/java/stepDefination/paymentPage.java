package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class paymentPage {

	ChromeDriver driver;
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", 
				"chromedriver.exe"); 
		driver = new ChromeDriver();
	//	wait = new WebDriverWait(driver,30);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
		
	@Given("User click on Your Payment tab")
	public void user_click_on_your_payment_tab() {
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a")).click();
	}

	@When("User clicks on add payment method")
	public void user_clicks_on_add_payment_method() {
		driver.findElement(By.id("pp-ZcW6ms-11")).click();
	}

	@When("User click add credit or debit card")
	public void user_click_add_credit_or_debit_card() {
		driver.findElement(By.id("pp-BjcP5D-55")).click();
	}

	@When("User should type card number in card number field")
	public void user_should_type_card_number_in_card_number_field() {
		driver.findElement(By.id("pp-QRymB0-16")).sendKeys("4012888888881881");
	}

	@When("User should type name in card name field")
	public void user_should_type_name_in_card_name_field() {
		driver.findElement(By.id("pp-QRymB0-18")).sendKeys("Ankur");
	}

	@When("User should enter expiry date")
	public void user_should_enter_expiry_date() {
		Select month= new Select(driver.findElement(By.id("pp-QRymB0-19")));
		month.selectByVisibleText("7");
		Select year= new Select(driver.findElement(By.id("pp-QRymB0-21")));
		year.selectByVisibleText("2027");
	}

	@When("User should enter CVV in the cvv field")
	public void user_should_enter_cvv_in_the_cvv_field() {
		driver.findElement(By.id("pp-QRymB0-25")).sendKeys("255");
	}

	@When("click on add card button")
	public void click_on_add_card_button() {
		driver.findElement(By.id("pp-QRymB0-29")).click();
	}

	@When("click on Add default")
	public void click_on_add_default() {
		driver.findElement(By.id("pp-bL5yoU-18")).click();
	}
	
	@Then("click on save card button")
	public void click_on_save_card_button() {
		driver.findElement(By.xpath("//*[@id=\"pp-bL5yoU-17\"]/div/div/form/div/div[2]/div/span[2]/span/input")).click();
	}
	
	@Then("Card should be saved in the Account")
	public void card_should_be_saved_in_the_account() {
		
		boolean check=driver.findElement(By.xpath("//*[@id=\"cpefront-mpo-widget\"]/div/div[2]/div[3]/div/div[2]/div/div/div[1]")).isDisplayed();
	    Assert.assertEquals(true, check);
	}
	
	
	
	
	@After
	public void close() {
		driver.close();
	}
}
