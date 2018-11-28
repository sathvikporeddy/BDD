package com.example.test;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JAVASeleniumIDEConferenceRegistration {
  private WebDriver driver;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testJAVASeleniumIDEConferenceRegistration() throws Exception {
    driver.get("file:///D:/BDD%20MPT%20case%20study/ConferenceRegistartion.html");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please fill the First Name", closeAlertAndGetItsText());
    driver.findElement(By.id("txtFirstName")).click();
    driver.findElement(By.id("txtFirstName")).clear();
    driver.findElement(By.id("txtFirstName")).sendKeys("Vamshi");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please fill the Last Name", closeAlertAndGetItsText());
    driver.findElement(By.id("txtLastName")).click();
    driver.findElement(By.id("txtLastName")).clear();
    driver.findElement(By.id("txtLastName")).sendKeys("Nani");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please fill the Email", closeAlertAndGetItsText());
    driver.findElement(By.id("txtEmail")).click();
    driver.findElement(By.id("txtEmail")).clear();
    driver.findElement(By.id("txtEmail")).sendKeys("vamshi.com");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please enter valid Email Id.", closeAlertAndGetItsText());
    driver.findElement(By.id("txtEmail")).click();
    driver.findElement(By.id("txtEmail")).clear();
    driver.findElement(By.id("txtEmail")).sendKeys("vamshi@gmail.com");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please fill the Contact No.", closeAlertAndGetItsText());
    driver.findElement(By.xpath("//tr[4]/td[2]")).click();
    driver.findElement(By.id("txtPhone")).click();
    driver.findElement(By.id("txtPhone")).clear();
    driver.findElement(By.id("txtPhone")).sendKeys("789456");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please enter valid Contact no.", closeAlertAndGetItsText());
    driver.findElement(By.id("txtPhone")).click();
    driver.findElement(By.id("txtPhone")).clear();
    driver.findElement(By.id("txtPhone")).sendKeys("7894561230");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please fill the Number of people attending", closeAlertAndGetItsText());
    new Select(driver.findElement(By.name("size"))).selectByVisibleText("2");
    driver.findElement(By.cssSelector("option[value=\"two\"]")).click();
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please fill the Building & Room No", closeAlertAndGetItsText());
    driver.findElement(By.id("txtAddress1")).click();
    driver.findElement(By.id("txtAddress1")).clear();
    driver.findElement(By.id("txtAddress1")).sendKeys("Capgemini");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please fill the Area name", closeAlertAndGetItsText());
    driver.findElement(By.id("txtAddress2")).click();
    driver.findElement(By.id("txtAddress2")).clear();
    driver.findElement(By.id("txtAddress2")).sendKeys("Hinjewadi");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please select city", closeAlertAndGetItsText());
    new Select(driver.findElement(By.name("city"))).selectByVisibleText("Pune");
    driver.findElement(By.cssSelector("option[value=\"Pune\"]")).click();
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please select state", closeAlertAndGetItsText());
    new Select(driver.findElement(By.name("state"))).selectByVisibleText("Maharashtra");
    driver.findElement(By.cssSelector("option[value=\"Maharashtra\"]")).click();
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please Select MemeberShip status", closeAlertAndGetItsText());
    driver.findElement(By.name("memberStatus")).click();
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Personal details are validated.", closeAlertAndGetItsText());
    driver.findElement(By.id("btnPayment")).click();
    assertEquals("Please fill the Card holder name", closeAlertAndGetItsText());
    driver.findElement(By.id("txtCardholderName")).clear();
    driver.findElement(By.id("txtCardholderName")).sendKeys("Vamshi");
    driver.findElement(By.id("btnPayment")).click();
    assertEquals("Please fill the Debit card Number", closeAlertAndGetItsText());
    driver.findElement(By.id("txtDebit")).clear();
    driver.findElement(By.id("txtDebit")).sendKeys("789456123012");
    driver.findElement(By.id("btnPayment")).click();
    assertEquals("Please fill the CVV", closeAlertAndGetItsText());
    driver.findElement(By.id("txtCvv")).clear();
    driver.findElement(By.id("txtCvv")).sendKeys("789");
    driver.findElement(By.id("btnPayment")).click();
    assertEquals("Please fill expiration month", closeAlertAndGetItsText());
    driver.findElement(By.id("txtMonth")).clear();
    driver.findElement(By.id("txtMonth")).sendKeys("12");
    driver.findElement(By.id("btnPayment")).click();
    assertEquals("Please fill the expiration year", closeAlertAndGetItsText());
    driver.findElement(By.id("txtYear")).clear();
    driver.findElement(By.id("txtYear")).sendKeys("2020");
    driver.findElement(By.id("btnPayment")).click();
    assertEquals("Conference Room Booking successfully done!!!", closeAlertAndGetItsText());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
