package class5;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends CommonMethods {

    public static void main(String[] args) throws InterruptedException{
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement alertbtn1=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alertbtn1.click();

        //switch the focus of the driver to the alert

        Thread.sleep(3000);
        Alert confirmationAlert1=driver.switchTo().alert();
        confirmationAlert1.accept();

        //find the other alert button and click on it
        WebElement alertbtn2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alertbtn2.click();
        Thread.sleep(3000);

        Alert confirmationAlert2=driver.switchTo().alert();
        confirmationAlert2.dismiss();

        WebElement alertbtn3=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertbtn3.click();
        Thread.sleep(3000);

        Alert confirmationAlert3=driver.switchTo().alert();
        confirmationAlert3.sendKeys("veranda");
        confirmationAlert3.getText();

    }
}
