import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.awt.*;

public class Setup {

    private static final WebDriver driver = new ChromeDriver();
    Robot robot = new Robot();
    String browser = "webdriver.chrome.driver";
    String path = "C:\\drivers\\chromedriver.exe";
    HomePage objHomePage;
    ContactPage objContactPage;
    CartPage objCartPage;
    LoginPage objLoginPage;
    SignupPage objSignupPage;
    NexusPage objNexusPage;

    public Setup() throws AWTException {
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        System.setProperty(browser, path);
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void homepageTest() throws InterruptedException {
        objHomePage = new HomePage(driver);
        objHomePage.verifyHeader();
    }

    @Test(priority = 2)
    public void signupTest() throws InterruptedException {
        objHomePage = new HomePage(driver);
        objHomePage.clickOnSignup();
        objSignupPage = new SignupPage(driver);
        objSignupPage.input("Mihovil", "123");
        objSignupPage.clickOnSend();
        Thread.sleep(2000);
        objSignupPage.confirm(robot);
    }

    @Test(priority = 3)
    public void loginTest() throws InterruptedException {
        objHomePage = new HomePage(driver);
        objHomePage.clickOnLogin();
        objLoginPage = new LoginPage(driver);
        objLoginPage.input("Mihovil", "123");
        objLoginPage.clickOnSend();
        Thread.sleep(2000);
        objLoginPage.confirm(robot);
    }

    @Test(priority = 4)
    public void sendMessageTest() throws InterruptedException {
        objHomePage = new HomePage(driver);
        objHomePage.clickOnContact();
        objContactPage = new ContactPage(driver);
        objContactPage.input("mihovilkovacevic1998@gmail.com", "Mihovil", "Message");
        objContactPage.clickOnSend();
        Thread.sleep(2000);
        objContactPage.confirm(robot);
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void purchaseItem() throws InterruptedException {
        objHomePage = new HomePage(driver);
        objHomePage.clickOnNexus();
        Thread.sleep(2000);
        objNexusPage = new NexusPage(driver);
        objNexusPage.verifyHeader();
        objNexusPage.clickOnAdd();
        Thread.sleep(2000);
        objNexusPage.confirm(robot);
        objNexusPage.clickOnCart();
        Thread.sleep(2000);
        objCartPage = new CartPage(driver);
        objCartPage.clickOnOrder();
        Thread.sleep(2000);
        objCartPage.input("Mihovil", "Croatia", "Osijek", "1234567890", "12", "2030");
        objCartPage.clickOnSend();
    }

    @AfterMethod
    public void teardownTest() {
    }
}
