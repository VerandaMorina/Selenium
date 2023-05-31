package class5;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException{
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement alertbtn1=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertbtn1.click();

        Thread.sleep(3000);

        Alert confirmationAlert1=driver.switchTo().alert();
        confirmationAlert1.sendKeys("veranda");
        confirmationAlert1.accept();
    }
}
