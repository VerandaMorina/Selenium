package class6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Task2 extends CommonMethods {
    /*
    goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
    click on get new user
    print the firstname of user

     */
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement getUserBtn = driver.findElement(By.xpath("(//button[text()='Get New User'])"));
        getUserBtn.click();


        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String text = firstName.getText();
        System.out.println(text);


        closeBrowser();
    }
}
