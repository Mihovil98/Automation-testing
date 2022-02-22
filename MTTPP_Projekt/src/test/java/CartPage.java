import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends PageObject {

    WebElement order = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
    WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
    WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
    WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
    WebElement card = driver.findElement(By.xpath("//*[@id=\"card\"]"));
    WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
    WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
    WebElement send = driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnOrder() {
        order.click();
    }

    public void input(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
        String js = "arguments[0].setAttribute('value','" + arg1 + "')";
        ((JavascriptExecutor) driver).executeScript(js, name);
        js = "arguments[0].setAttribute('value','" + arg2 + "')";
        ((JavascriptExecutor) driver).executeScript(js, country);
        js = "arguments[0].setAttribute('value','" + arg3 + "')";
        ((JavascriptExecutor) driver).executeScript(js, city);
        js = "arguments[0].setAttribute('value','" + arg4 + "')";
        ((JavascriptExecutor) driver).executeScript(js, card);
        js = "arguments[0].setAttribute('value','" + arg5 + "')";
        ((JavascriptExecutor) driver).executeScript(js, month);
        js = "arguments[0].setAttribute('value','" + arg6 + "')";
        ((JavascriptExecutor) driver).executeScript(js, year);
    }

    public void clickOnSend() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", send);
    }

}
