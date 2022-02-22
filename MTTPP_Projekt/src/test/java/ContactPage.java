import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ContactPage extends PageObject {

    WebElement email = driver.findElement(By.xpath("//*[@id=\"recipient-email\"]"));
    WebElement name = driver.findElement(By.xpath("//*[@id=\"recipient-name\"]"));
    WebElement message = driver.findElement(By.xpath("//*[@id=\"message-text\"]"));
    WebElement send = driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]"));

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public void input(String arg1, String arg2, String arg3) {
        String js = "arguments[0].setAttribute('value','" + arg1 + "')";
        ((JavascriptExecutor) driver).executeScript(js, email);
        js = "arguments[0].setAttribute('value','" + arg2 + "')";
        ((JavascriptExecutor) driver).executeScript(js, name);
        js = "arguments[0].setAttribute('value','" + arg3 + "')";
        ((JavascriptExecutor) driver).executeScript(js, message);
    }

    public void clickOnSend() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", send);
    }

    public void confirm(Robot robot) {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

}
