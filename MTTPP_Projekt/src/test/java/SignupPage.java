import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;

public class SignupPage extends PageObject {

    WebElement username = driver.findElement(By.xpath("//*[@id=\"sign-username\"]"));
    WebElement password = driver.findElement(By.xpath("//*[@id=\"sign-password\"]"));
    WebElement send = driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    public void input(String arg1, String arg2) {
        String js = "arguments[0].setAttribute('value','" + arg1 + "')";
        ((JavascriptExecutor) driver).executeScript(js, username);
        js = "arguments[0].setAttribute('value','" + arg2 + "')";
        ((JavascriptExecutor) driver).executeScript(js, password);
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
