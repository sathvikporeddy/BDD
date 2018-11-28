package ConferenceRegistration;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageBean.ConferencePageBeanFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionsConference {
	
	private WebDriver driver;
	private ConferencePageBeanFactory cpbf;
	
	@Given("^user is on the conference registration form$")
	public void user_is_on_the_conference_registration_form() throws Throwable {
	    
	    driver = new FirefoxDriver(); Thread.sleep(111);
	    cpbf = new ConferencePageBeanFactory(driver);
	    driver.get("file:///D:/BDD%20MPT%20case%20study/ConferenceRegistartion.html");
		
	}

	@Then("^check the title of the web page$")
	public void check_the_title_of_the_web_page() throws Throwable {
	    
		assertEquals("Conference Registartion", driver.getTitle());
		driver.close();
	    
	}

	@When("^user leaves the first name field as blank$")
	public void user_leaves_the_first_name_field_as_blank() throws Throwable {
	    
		cpbf.setFirstName("");
	    
	}

	@Then("^alert message should be displayed$")
	public void alert_message_should_be_displayed() throws Throwable {
		
		cpbf.setNext();
		System.out.println("***"+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.quit();
	    
	}

	@When("^user enters all the previous data and leaves the last name field as blank$")
	public void user_enters_all_the_previous_data_and_leaves_the_last_name_field_as_blank() throws Throwable {
	    
		cpbf.setFirstName("Vamshi");
		cpbf.setLastName("");
	    
	}

	@When("^user enters all the previous data and enters the email format in wrong format then$")
	public void user_enters_all_the_previous_data_and_enters_the_email_format_in_wrong_format_then() throws Throwable {
	    
		cpbf.setFirstName("Vamshi");
		cpbf.setLastName("Nani");
		cpbf.setEmail("Vamshi.com");
	    
	}

	@When("^user enters all the previous data and leaves the contact field as blank$")
	public void user_enters_all_the_previous_data_and_leaves_the_contact_field_as_blank() throws Throwable {
	    
		cpbf.setFirstName("Vamshi");
		cpbf.setLastName("Nani");
		cpbf.setEmail("vamshi@gmail.com");
		cpbf.setPhone("");
	    
	}

	@When("^user enters all the previous data$")
	public void user_enters_all_the_previous_data() throws Throwable {
	    
		cpbf.setFirstName("Vamshi");
		cpbf.setLastName("Nani");
		cpbf.setEmail("vamshi@gmail.com");
	    
	}

	@When("^enters invalid mobile number format$")
	public void enters_invalid_mobile_number_format(DataTable arg1) throws Throwable {
	    
	    List<String> list = arg1.asList(String.class);
	    
	    for(String s : list) {
	    	cpbf.getPhone().clear();
	    	cpbf.setPhone(s);
	    	if(Pattern.matches("[7-9][1-9]{9}", s)) {
	    		System.out.println("Matched");
	    		cpbf.setNext();
	    		driver.switchTo().alert().accept();
	    	}
	    	else {
	    		System.out.println("Not matched");
	    		cpbf.setNext();
	    		driver.switchTo().alert().accept();
	    	}
	    }
	}

	@When("^user enters all the previous data and leaves the select people field blank$")
	public void user_enters_all_the_previous_data_and_leaves_the_select_people_field_blank() throws Throwable {
	    
		cpbf.setFirstName("Vamshi");
		cpbf.setLastName("Nani");
		cpbf.setEmail("vamshi@gmail.com");
		cpbf.setPhone("7894561231");
		cpbf.setPeople("");
	    
	}

	@When("^user enters all the previous data and leaves building name and room number field as blank$")
	public void user_enters_all_the_previous_data_and_leaves_building_name_and_room_number_field_as_blank() throws Throwable {
	    
		cpbf.setFirstName("Vamshi");
		cpbf.setLastName("Nani");
		cpbf.setEmail("vamshi@gmail.com");
		cpbf.setPhone("7894561231");
		cpbf.setPeople("3");
		cpbf.setAddress("");
	    
	}

	@When("^user enters all the previous data and leaves area name field as blank$")
	public void user_enters_all_the_previous_data_and_leaves_area_name_field_as_blank() throws Throwable {
	    
		cpbf.setFirstName("Vamshi");
		cpbf.setLastName("Nani");
		cpbf.setEmail("vamshi@gmail.com");
		cpbf.setPhone("7894561231");
		cpbf.setPeople("3");
		cpbf.setAddress("Capgemini, Room-421");
		cpbf.setArea("");
	    
	}

	@When("^user enters all the previous data and leaves the select city list as blank$")
	public void user_enters_all_the_previous_data_and_leaves_the_select_city_list_as_blank() throws Throwable {
	    
		cpbf.setFirstName("Vamshi");
		cpbf.setLastName("Nani");
		cpbf.setEmail("vamshi@gmail.com");
		cpbf.setPhone("7894561231");
		cpbf.setPeople("3");
		cpbf.setAddress("Capgemini, Room-421");
		cpbf.setArea("Hinjewadi");
		cpbf.setCity("");
	    
	}

	@When("^user enters all the previous data and leaves the select state list as blank$")
	public void user_enters_all_the_previous_data_and_leaves_the_select_state_list_as_blank() throws Throwable {
	    
		cpbf.setFirstName("Vamshi");
		cpbf.setLastName("Nani");
		cpbf.setEmail("vamshi@gmail.com");
		cpbf.setPhone("7894561231");
		cpbf.setPeople("3");
		cpbf.setAddress("Capgemini, Room-421");
		cpbf.setArea("Hinjewadi");
		cpbf.setCity("Pune");
		cpbf.setState("");
	    
	}

	@When("^user enters all the previous data and leaves the membership option unselected$")
	public void user_enters_all_the_previous_data_and_leaves_the_membership_option_unselected() throws Throwable {
	    
		cpbf.setFirstName("Vamshi");
		cpbf.setLastName("Nani");
		cpbf.setEmail("vamshi@gmail.com");
		cpbf.setPhone("7894561231");
		cpbf.setPeople("3");
		cpbf.setAddress("Capgemini, Room-421");
		cpbf.setArea("Hinjewadi");
		cpbf.setCity("Pune");
		cpbf.setState("Maharashtra");
	    
	}

	@When("^user enters all the data and clicks next$")
	public void user_enters_all_the_data_and_clicks_next() throws Throwable {
	    
		cpbf.setFirstName("Vamshi");
		cpbf.setLastName("Nani");
		cpbf.setEmail("vamshi@gmail.com");
		cpbf.setPhone("7894561231");
		cpbf.setPeople("3");
		cpbf.setAddress("Capgemini, Room-421");
		cpbf.setArea("Hinjewadi");
		cpbf.setCity("Pune");
		cpbf.setState("Maharashtra");
		cpbf.setMember();
	    
	}

	@When("^user click OK on the alert box$")
	public void user_click_OK_on_the_alert_box() throws Throwable {
	    
		cpbf.setFirstName("Vamshi");
		cpbf.setLastName("Nani");
		cpbf.setEmail("vamshi@gmail.com");
		cpbf.setPhone("7894561231");
		cpbf.setPeople("3");
		cpbf.setAddress("Capgemini, Room-421");
		cpbf.setArea("Hinjewadi");
		cpbf.setCity("Pune");
		cpbf.setState("Maharashtra");
		cpbf.setMember();
		cpbf.setNext();
		driver.switchTo().alert().accept();
	    
	}

	@Then("^navigate to the next page and verify whether the correct page has been loaded$")
	public void navigate_to_the_next_page_and_verify_whether_the_correct_page_has_been_loaded() throws Throwable {
	    
		driver.navigate().to("file:///D:/BDD%20MPT%20case%20study/PaymentDetails.html");
		driver.close();
	    
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
	
}
