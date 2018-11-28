package PaymentDetails;

import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageBean.PaymentPageBeanFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionsPayment {

	private WebDriver driver;
	private PaymentPageBeanFactory ppbf;
	
	@Given("^user is on the payment details form$")
	public void user_is_on_the_payment_details_form() throws Throwable {
		
		driver = new FirefoxDriver(); Thread.sleep(100);
	    ppbf = new PaymentPageBeanFactory(driver);
	    driver.get("file:///D:/BDD%20MPT%20case%20study/PaymentDetails.html");
	    
	}

	@Then("^verify the title of payment details form$")
	public void verify_the_title_of_payment_details_form() throws Throwable {
	    
		assertEquals("Payment Details", driver.getTitle());
		driver.close();
		
	}

	@When("^user leaves the card holder name field as blank$")
	public void user_leaves_the_card_holder_name_field_as_blank() throws Throwable {
		
		ppbf.setCardHolderName("");
	    
	}

	@Then("^alert message should be displayed$")
	public void alert_message_should_be_displayed() throws Throwable {
	    
		ppbf.setPaymentButton();
		System.out.println("***"+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.close();
	    
	}

	@When("^user enters all the previous data and leaves the debit card number as blank$")
	public void user_enters_all_the_previous_data_and_leaves_the_debit_card_number_as_blank() throws Throwable {
	    
		ppbf.setCardHolderName("Vamshi");
		ppbf.setDebitCardNumber("");
	    
	}

	@When("^user enters all the previous data and leaves the card expiration month as blank$")
	public void user_enters_all_the_previous_data_and_leaves_the_card_expiration_month_as_blank() throws Throwable {
	    
		ppbf.setCardHolderName("Vamshi");
		ppbf.setDebitCardNumber("7894561285217896");
		ppbf.setCvv("");
	    
	}

	@When("^user enters all the previous data and leaves the card expiration year as blank$")
	public void user_enters_all_the_previous_data_and_leaves_the_card_expiration_year_as_blank() throws Throwable {
	    
		ppbf.setCardHolderName("Vamshi");
		ppbf.setDebitCardNumber("7894561285217896");
		ppbf.setCvv("789");
		ppbf.setExpMonth("");
	    
	}

	@When("^user enters all valid and clicks make payment button$")
	public void user_enters_all_valid_and_clicks_make_payment_button() throws Throwable {
	    
		ppbf.setCardHolderName("Vamshi");
		ppbf.setDebitCardNumber("7894561285217896");
		ppbf.setCvv("789");
		ppbf.setExpMonth("03");
		ppbf.setExpYear("2026");
	   
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
	
}
