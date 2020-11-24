//package tests;
//
//import static org.testng.Assert.assertEquals;
//
//import Factory.HomePage_PF;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//import enums.Browser;
//import Factory.BrowserProvider;
//
//
//import java.util.concurrent.TimeUnit;
//
//@Test
//public class HomePageTests {
//
//    static WebDriver driver;
//
//    HomePage_PF HomePage = PageFactory.initElements(driver, HomePage_PF.class);
//
//    /**
//     * This method will be executed before the test start.
//     */
//    @BeforeSuite
//    public void initialize() {
////        driver = BrowserProvider.createDriver(Browser.FIREFOX);
//        driver = BrowserProvider.createDriver(Browser.CHROME);
//        driver.manage().window().maximize();
//        driver.get(URL);
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    }
//
//
//    /**
//     * This method perform a google search test. We can have multiple @Test methods inside this class.
//     */
//
//    private static final String URL = "http://www.joshuaistoria.com";
//
//
//    @Test
//    public void verifyTitle() {
//        String actualTitle = driver.getTitle();
//        String expectedTitle = "JoshuaIstoria";
//        assertEquals(actualTitle, expectedTitle);
//    }
//
//    public void goToHome(){
//        HomePage.clickHomeButton();
//    }
////    public void verifyHomeMenuBarTitle() {
////        String actualTitleHome = driver.findElement(By.xpath("//*[@id=\"element-container-GGYyl4\"]/div/div/nav/div[1]/div[1]/ul/li[1]/a")).getText();
////        String expectedTitleHome = "HOME";
////        assertEquals(actualTitleHome, expectedTitleHome);
////    }
//
//    public void verifyPortfolioMenuBarTitle() {
//        String actualTitlePortfolio = driver.findElement(By.xpath("//*[@id=\"element-container-GGYyl4\"]/div/div/nav/div[1]/div[1]/ul/li[2]/a")).getText();
//        String expectedTitleHomePortfolio = "PORTFOLIO";
//        assertEquals(actualTitlePortfolio, expectedTitleHomePortfolio);
//    }
//
//    public void verifyContactMenuBarTitle() {
//        String actualTitleContact = driver.findElement(By.xpath("//*[@id=\"element-container-GGYyl4\"]/div/div/nav/div[1]/div[2]/ul/li/a")).getText();
//        String expectedTitleHomeContact = "CONTACT";
//        assertEquals(actualTitleContact, expectedTitleHomeContact);
//    }
//
//    public void verifyLogoMenuBarTitle() throws Exception {
//            WebElement ImageFile = driver.findElement(By.xpath("//*[@id=\"element-container-GGYyl4\"]/div/div/nav/div[1]/a/img"));
//
//            Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
//            if (!ImagePresent)
//            {
//                System.out.println("Image not displayed.");
//            }
//            else
//            {
//                System.out.println("Image displayed.");
//            }
//        }
//
//    public void contactButton() {
//        driver.findElement(By.xpath("//*[@id=\"element-container-erYEn4\"]/div/div/div/div/a")).click();
//        String actualTitle = driver.getTitle();
//        String expectedTitle = "Contact - JoshuaIstoria";
//        assertEquals(actualTitle, expectedTitle);
//
//        String actualContactText = driver.findElement(By.xpath("//*[@id=\"element-container-3K6Jxb\"]/div/div/h1")).getText();
//        String expectedContactTitle = "Let's have a (digital) coffee";
//        assertEquals(actualContactText, expectedContactTitle);
//
//        driver.navigate().back();
//    }
//
//    /**
//     This section is for the functionality of the menubar
//     */
//
//    public void clickMenuBarHome() {
//        driver.findElement(By.xpath("//*[@id=\"element-container-GGYyl4\"]/div/div/nav/div[1]/div[1]/ul/li[1]/a")).getText();
//        String actualHeaderHome = driver.findElement(By.xpath("//*[@id=\"element-container-AQl6v6\"]/div/div/div/div/div[2]/div/div/h1")).getText();
//        String expectedHeaderHome = "Photography";
//        assertEquals(actualHeaderHome, expectedHeaderHome);
//    }
//
//    public void clickLogoMenuBarHome() {
//        driver.findElement(By.xpath("//*[@id=\"element-container-GGYyl4\"]/div/div/nav/div[1]/a/img")).click();
//        String actualHeaderHome = driver.findElement(By.xpath("//*[@id=\"element-container-AQl6v6\"]/div/div/div/div/div[2]/div/div/h1")).getText();
//        String expectedHeaderHome = "Photography";
//        assertEquals(actualHeaderHome, expectedHeaderHome);
//    }
//
//
//    public void clickMenuBarPortfolio() {
//        driver.findElement(By.xpath("//*[@id=\"element-container-GGYyl4\"]/div/div/nav/div[1]/div[1]/ul/li[2]/a")).click();
//        String actualDescriptionPortfolio = driver.findElement(By.xpath("//*[@id=\"element-container-J3Lkjj\"]/div/div/h2")).getText();
//        String expectedDescriptionPortfolio = "\"Great stories happen to those who can tell them.\" - Ira Glass";
//        assertEquals(actualDescriptionPortfolio, expectedDescriptionPortfolio);
//
//        driver.navigate().back();
//    }
//
//    public void clickMenuBarContact() {
//        driver.findElement(By.xpath("//*[@id=\"element-container-GGYyl4\"]/div/div/nav/div[1]/div[2]/ul/li/a")).click();
//        String actualContactText = driver.findElement(By.xpath("//*[@id=\"element-container-3K6Jxb\"]/div/div/h1")).getText();
//        String expectedContactTitle = "Let's have a (digital) coffee";
//        assertEquals(actualContactText, expectedContactTitle);
//
//        driver.navigate().back();
//    }
//
//
//    /**
//     * This method will be executed at the end of the test.
//     */
//
//    @AfterSuite
//    public void quitDriver() {
//        driver.quit();
//        driver = null;
//    }
//
//}
