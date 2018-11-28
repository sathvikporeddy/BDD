package PageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConferencePageBeanFactory {
	
	WebDriver driver;
	
	public ConferencePageBeanFactory(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "txtFN")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(id = "txtLastName")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(xpath = ".//*[@id='txtEmail']")
	@CacheLookup
	WebElement email;
	
	@FindBy(name = "Phone")
	@CacheLookup
	WebElement phone;
	
	@FindBy(xpath = "html/body/form/table/tbody/tr[5]/td[2]/select")
	@CacheLookup
	WebElement people;
	
	@FindBy(how = How.NAME, using = "Address")
	@CacheLookup
	WebElement address;
	
	@FindBy(xpath = ".//*[@id='txtAddress2']")
	@CacheLookup
	WebElement area;
	
	@FindBy(name = "city")
	@CacheLookup
	WebElement city;
	
	@FindBy(xpath = "html/body/form/table/tbody/tr[10]/td[2]/select")
	@CacheLookup
	WebElement state;
	
	@FindBy(name = "memberStatus")
	@CacheLookup
	WebElement member;
	
	@FindBy(xpath = "html/body/form/table/tbody/tr[13]/td[2]/input")
	@CacheLookup
	WebElement nonMember;
	
	@FindBy(linkText = "Next")
	@CacheLookup
	WebElement next;

	public String getFirstName() {
		return firstName.getText();
	}

	public void setFirstName(String Name) {
		firstName.sendKeys(Name);
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String last) {
		lastName.sendKeys(last);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String em) {
		email.sendKeys(em);
	}

	public WebElement getPhone() {
		return phone;
	}

	public void setPhone(String ph) {
		phone.sendKeys(ph);
	}

	public WebElement getPeople() {
		return people;
	}

	public void setPeople(String ppl) {
		people.sendKeys(ppl);
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(String addr) {
		address.sendKeys(addr);
	}

	public WebElement getArea() {
		return area;
	}

	public void setArea(String ar) {
		area.sendKeys(ar);
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String cty) {
		city.sendKeys(cty);
	}

	public WebElement getState() {
		return state;
	}

	public void setState(String st) {
		state.sendKeys(st);
	}

	public WebElement getMember() {
		return member;
	}

	public void setMember() {
		member.click();
	}

	public WebElement getNonMember() {
		return nonMember;
	}

	public void setNonMember() {
		nonMember.click();
	}

	public WebElement getNext() {
		return next;
	}

	public void setNext() {
		next.click();
	}
	
}
