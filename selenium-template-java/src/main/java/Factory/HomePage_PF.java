package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.testng.Assert.assertEquals;

public class HomePage_PF {

    /**
     * All WebElements are identified by @FindBy annotation
     */

    final WebDriver driver;

    @FindBy(how = How.XPATH, using = ".//*[@id=\\\"element-container-GGYyl4\\\"]/div/div/nav/div[1]/div[1]/ul/li[1]/a")

    public static WebElement homeButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\\\"element-container-GGYyl4\\\"]/div/div/nav/div[1]/div[1]/ul/li[2]/a")

    public static WebElement portfolioButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"element-container-GGYyl4\"]/div/div/nav/div[1]/a/img")

    public static WebElement logoJoshuaIstoria;

    @FindBy(how = How.XPATH, using = "//*[@id=\"element-container-GGYyl4\"]/div/div/nav/div[1]/div[2]/ul/li/a")

    public static WebElement contactButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"element-container-GGYyl4\"]/div/div/nav/div[1]/div[1]/ul/li[2]/div/ul/li[1]/a")

    public static WebElement portraitsButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"element-container-GGYyl4\"]/div/div/nav/div[1]/div[1]/ul/li[2]/div/ul/li[3]/a")

    public static WebElement businessButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"element-container-erYEn4\"]/div/div/div/div/a")

    public static WebElement contactCenterButton;

    public HomePage_PF(WebDriver driver) {

        this.driver = driver;

    }

    /**
     * This method will click on the Home Button
     */
    public void clickHomeButton() {
        homeButton.click();
        String actualTitleHome = homeButton.getText();
        String expectedTitleHome = "HOME";
        assertEquals(actualTitleHome, expectedTitleHome);
    }
}




