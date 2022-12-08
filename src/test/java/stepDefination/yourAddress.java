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

public class yourAddress {

	ChromeDriver driver;
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", 
				"chromedriver.exe"); 
		driver = new ChromeDriver();
	//	wait = new WebDriverWait(driver,30);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
	@When("Clicks on Your Adddress page")
	public void clicks_on_your_adddress_page() {
		driver.findElement(By.linkText("Your addresses")).click();
	}

	@Then("User should be directed to Adddress page")
	public void user_should_be_directed_to_adddress_page() {
		String url=driver.getCurrentUrl();
	    Assert.assertEquals("https://www.amazon.com/a/addresses?ref_=ya_d_l_addr", url);
	}
	
	@When("Clicks on add Adddress")
	public void clicks_on_add_adddress() {
		driver.findElement(By.id("ya-myab-address-add-link")).click();
	}

	@Then("User should be directed to add Adddress page")
	public void user_should_be_directed_to_add_adddress_page() {
		String url=driver.getCurrentUrl();
	    Assert.assertEquals("https://www.amazon.com/a/addresses/add?ref=ya_address_book_add_button", url);
	}
	
	@When("Country should be selected Canada")
	public void country_should_be_selected_canada() {
		Select dropTest1= new Select(driver.findElement(By.id("address-ui-widgets-countryCode-dropdown-nativeId")));
		dropTest1.selectByVisibleText("CA");
	}

	@When("Full name should be empty")
	public void full_name_should_be_empty() {
		driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).clear();
	}

	@When("click on add address")
	public void click_on_add_address_page() {
		driver.findElement(By.id("address-ui-widgets-form-submit-button")).click();
	}

	@Then("error should be displayed under name")
	public void error_should_be_displayed_under_name() {
		boolean check=driver.findElement(By.id("address-ui-widgets-enterAddressFullName-full-validation-alerts")).isDisplayed();
	    Assert.assertEquals(true, check);	
	}
	
	@When("Full name should be entered in name field")
	public void full_name_should_be_entered_in_name_field() {
		driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Rohit Garg");
	}

	@When("Phone number should be left empty")
	public void phone_number_should_be_left_empty() {
		driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).clear();
	}

	@Then("error should be displayed under phone number")
	public void error_should_be_displayed_under_phone_number() {
		boolean check=driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber-full-validation-alerts")).isDisplayed();
	    Assert.assertEquals(true, check);
	}
	
	@When("Phone number should be entered in phone field")
	public void phone_number_should_be_entered_in_phone_field() {
		driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("4379860000");
	}

	@When("leave address field empty")
	public void leave_address_field_empty() {
		driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).clear();
	}

	@Then("error should be displayed under address")
	public void error_should_be_displayed_under_address() {
		boolean check=driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/div[7]/div/div[10]/div")).isDisplayed();
	    Assert.assertEquals(true, check);
	}
	
	@When("enter address in address field empty")
	public void enter_address_in_address_field_empty() {
		driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("26 Swans Acre Trail");
	}

	@When("leave city field empty")
	public void leave_city_field_empty() {
		driver.findElement(By.id("address-ui-widgets-enterAddressCity")).clear();
	}
	
	@Then("error should be displayed city")
	public void error_should_be_displayed_city() {
		boolean check=driver.findElement(By.id("address-ui-widgets-enterAddressCity-full-validation-alerts")).isDisplayed();
	    Assert.assertEquals(true, check);
	}
	
	@When("entry city in city field")
	public void entry_city_in_city_field() {
		driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("Brampton");
	}

	@When("enter province in province field")
	public void enter_province_in_province_field() {
		Select dropTest1= new Select(driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId")));
		dropTest1.selectByVisibleText("Ontario");
	}
	
	@When("leave postal field empty")
	public void leave_postal_field_empty() {
		driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).clear();
	}

	@Then("error should be displayed on postal field")
	public void error_should_be_displayed_on_postal_field() {
		boolean check=driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode-full-validation-alerts")).isDisplayed();
	    Assert.assertEquals(true, check);
	}
	
	@When("postal code entered in postal field")
	public void postal_code_entered_in_postal_field() {
		driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("L6R 0B3");
	}

	@When("check make address default")
	public void check_make_address_default() {
		driver.findElement(By.id("address-ui-widgets-use-as-my-default")).click();
	}
	
	@When("Call box Instructions")
	public void call_box_instructions() {
		driver.findElement(By.id("address-ui-widgets-addr-details-gate-code")).sendKeys("Buzz 2222");
	}

	@When("Weekend Delivery")
	public void weekend_delivery() {
		Select dropTest1= new Select(driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/div[9]/div[5]/span/select")));
		dropTest1.selectByVisibleText("BOTH");
		driver.findElement(By.xpath("//*[@id=\"a-popover-4\"]/div/div/ul/li[2]")).click();
	}

	@Then("Address should be saved")
	public void address_should_be_saved() {
		boolean check=driver.findElement(By.id("yaab-alert-box")).isDisplayed();
	    Assert.assertEquals(true, check);
	}
	
	@Given("entry wrong city in city field")
	public void entry_wrong_city_in_city_field() {
		driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("Delhi");
	}

	@Then("suggestions for Address should be provided")
	public void suggestions_for_address_should_be_provided() {
		boolean check=driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-suggested-address-block_id-outer\"]/label/span/div/span")).isDisplayed();
	    Assert.assertEquals(true, check);
	}
	
	
	
	
	@After
	public void close() {
		driver.close();
	}
}
