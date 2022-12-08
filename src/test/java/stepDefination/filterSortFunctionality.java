package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class filterSortFunctionality {

	ChromeDriver driver;
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
		driver = new ChromeDriver();
	//	wait = new WebDriverWait(driver,30);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	}
	
	@When("User click on New Arrival")
	public void user_click_on_new_arrival() {
		driver.findElement(By.xpath("//*[@id=\"p_n_date/1249033011\"]/span/a")).click();
	}
	
	@When("User click on three or plus star")
	public void user_click_on_three_or_plus_star() {
		driver.findElement(By.xpath("//*[@id=\"p_72/1248879011\"]/span/a")).click();
	}
	
	@When("User click on discounted option")
	public void user_click_on_discounted_option() {
		driver.findElement(By.xpath("//*[@id=\"p_n_deal_type/23566065011\"]/span/a")).click();
	}
	
	@When("User click on dell brand to apply filter")
	public void user_click_on_dell_brand_to_apply_filter() {
		driver.findElement(By.xpath("//*[@id=\"p_89/Dell\"]/span/a/div/label/input")).click();
	}
	
	@When("User click on price range to apply filter")
	public void user_click_on_price_range_to_apply_filter() {
		driver.findElement(By.xpath("//*[@id=\"p_36/2421884011\"]/span/a")).click();
	}
	
	@When("User click on availability to apply filter")
	public void user_click_on_availability_to_apply_filter() {
		driver.findElement(By.xpath("//*[@id=\"p_n_availability/2661601011\"]/span/a/div/label/i")).click();
	}
	
	@When("User select new arrival from sort list")
	public void user_select_new_arrival_from_sort_list() {
		Select dropTest1= new Select(driver.findElement(By.id("s-result-sort-select")));
		dropTest1.selectByValue("date-desc-rank");
	}
	
	@When("User select Avg. Customer Review from sort list")
	public void user_select_avg_customer_review_from_sort_list() {
		Select dropTest1= new Select(driver.findElement(By.id("s-result-sort-select")));
		dropTest1.selectByValue("review-rank");
	}
	
	@When("User select Featured from sort list")
	public void user_select_featured_from_sort_list() {
		Select dropTest1= new Select(driver.findElement(By.id("s-result-sort-select")));
		dropTest1.selectByValue("relevanceblender");
	}
	
	
	@After
	public void close() {
		driver.close();
	}
}
