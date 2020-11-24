package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.testng.Assert.assertEquals;

public class Contact_PF {

    /**
     * All WebElements are identified by @FindBy annotation
     */

    final WebDriver driver;

    @FindBy(how = How.XPATH ,using = "//*[@id=\"name-DbO5GZ\"]")

    public static WebElement nameFieldContact;

    @FindBy(how = How.XPATH ,using = "//*[@id=\"email-address-robQnD\"]")

    public static WebElement emailAddressFieldContact;

    @FindBy(how = How.XPATH ,using = "//*[@id=\"message-ZR3mQ8\"]")

    public static WebElement messageFieldContact;

    @FindBy(how = How.XPATH ,using = "//*[@id=\"phone-number-OA5E4l\"]")

    public static WebElement phoneNumberFieldContact;

    @FindBy(how = How.XPATH ,using = "//*[@id=\"element-container-odjav9\"]/div/div/div/div/div/form/button")

    public static WebElement submitButtonContact;

    @FindBy(how = How.XPATH ,using = "//*[@id=\"error-DbO5GZ\" and contains(text(), 'This field is required.')]")

    public static WebElement errorNameThisFieldIsRequired;

    public Contact_PF(WebDriver driver){

        this.driver = driver;

    }

    public void fillInNameField() {
        nameFieldContact.click();
        nameFieldContact.sendKeys("Joshua Susanto");
    }

    public void fillInEmailAddressField() {
        emailAddressFieldContact.click();
        emailAddressFieldContact.sendKeys("Joshua@test.nl");
    }

    public void fillInMessageField() {
        messageFieldContact.click();
        messageFieldContact.sendKeys("This is a test");
    }

    public void fillInPhoneNumberField() {
        phoneNumberFieldContact.click();
        phoneNumberFieldContact.sendKeys("0623433434");
    }

    public void clickButtonSubmit() {
        submitButtonContact.click();
    }

    public void setErrorNameThisFieldIsRequired() {
        String actualTextHome = errorNameThisFieldIsRequired.getText();
        String expectedTextHome = "This field is required.";
        assertEquals(actualTextHome, expectedTextHome);
    }

}

