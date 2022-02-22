import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends PageObject {

    WebElement header = driver.findElement(By.xpath("//*[@id=\"nava\"]"));
    WebElement contact = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a"));
    WebElement login = driver.findElement(By.xpath("//*[@id=\"login2\"]"));
    WebElement signup = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[8]"));
    WebElement nexus = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a"));

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void verifyHeader() {
        Assert.assertEquals(header.getText(), "PRODUCT STORE");
    }

    public void clickOnContact() {
        contact.click();
    }

    public void clickOnLogin() {
        login.click();
    }

    public void clickOnSignup() {
        signup.click();
    }

    public void clickOnNexus() {
        nexus.click();
    }

}