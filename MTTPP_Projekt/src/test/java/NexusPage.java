import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class NexusPage extends PageObject {

    WebElement header = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/h2"));
    WebElement add = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
    WebElement cart = driver.findElement(By.xpath("//*[@id=\"cartur\"]"));

    public NexusPage(WebDriver driver) {
        super(driver);
    }

    public void verifyHeader() {
        Assert.assertEquals(header.getText(), "Nexus 6");
    }

    public void clickOnAdd() {
        add.click();
    }

    public void confirm(Robot robot) {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void clickOnCart() {
        cart.click();
    }

}

