package class9;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutorDemo2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException{

        String url = "http://amazon.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //perform a scroll operation
        //using javascript

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");

        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0, -500)");

        //click on dropdown all

        WebElement select=driver.findElement(By.xpath("//select[@id='searchDropBox']"));
        Thread.sleep(3000);
        js.executeScript("arguments[0].click();", select);


    }
}
