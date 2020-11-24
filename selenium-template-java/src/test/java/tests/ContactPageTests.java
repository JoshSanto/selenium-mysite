package tests;

import Factory.Contact_PF;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import enums.Browser;
import Factory.BrowserProvider;

import java.util.concurrent.TimeUnit;


public class ContactPageTests {

    static WebDriver driver;

    private static final String URL = "http://www.joshuaistoria.com";

    Contact_PF ContactPage;

    @BeforeSuite
    public void initialize() {
        driver = BrowserProvider.createDriver(Browser.CHROME);
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"element-container-GGYyl4\"]/div/div/nav/div[1]/div[2]/ul/li/a")).click();
        ContactPage = PageFactory.initElements(driver, Contact_PF.class);
    }

        @Test(priority = 2)
        public void sentAMessageFromContact() {
            ContactPage.fillInNameField();
            ContactPage.fillInEmailAddressField();
            ContactPage.fillInMessageField();
            ContactPage.fillInPhoneNumberField();
            ContactPage.clickButtonSubmit();
        }

        @Test(priority = 1)
        public void sentMessageWithoutName(){
            ContactPage.fillInEmailAddressField();
            ContactPage.fillInMessageField();
            ContactPage.fillInPhoneNumberField();
            ContactPage.clickButtonSubmit();
            ContactPage.setErrorNameThisFieldIsRequired();
        }
        //sentMessageWithoutEmailAddress
        //sentMessageWithNoneEmailAddress
        //sentMessageWithoutMessage
        //sentMessageWithoutPhoneNumber
        //sentMessageWithLetters



    /**
     * This method will be executed at the end of the test.
     */

    @AfterSuite
    public void quitDriver() {
        driver.quit();
        driver = null;
    }

}
