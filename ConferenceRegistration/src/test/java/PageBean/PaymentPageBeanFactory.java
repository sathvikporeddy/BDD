package PageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPageBeanFactory {

	WebDriver driver;

	public PaymentPageBeanFactory(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id = "txtCardholderName")
	@CacheLookup
	WebElement cardHolderName;
	
	@FindBy(name = "debit")
	@CacheLookup
	WebElement debitCardNumber;
	
	@FindBy(xpath = ".//*[@id='txtCvv']")
	@CacheLookup
	WebElement cvv;
	
	@FindBy(id = "txtMonth")
	@CacheLookup
	WebElement expMonth;
	
	@FindBy(name = "year")
	@CacheLookup
	WebElement expYear;
	
	@FindBy(xpath = ".//*[@id='btnPayment']")
	@CacheLookup
	WebElement paymentButton;

	public WebElement getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String HolderName) {
		cardHolderName.sendKeys(HolderName);
	}

	public WebElement getDebitCardNumber() {
		return debitCardNumber;
	}

	public void setDebitCardNumber(String CardNumber) {
		debitCardNumber.sendKeys(CardNumber);
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(String c) {
		cvv.sendKeys(c);
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(String Month) {
		expMonth.sendKeys(Month);
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public void setExpYear(String Year) {
		expYear.sendKeys(Year);
	}

	public WebElement getPaymentButton() {
		return paymentButton;
	}

	public void setPaymentButton() {
		paymentButton.click();
	}
	
}
