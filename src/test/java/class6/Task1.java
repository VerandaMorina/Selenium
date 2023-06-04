package class6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 extends CommonMethods {
    /*
    HW1:
    goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
    click on start
    print the text  "welcome syntax technologies "on console

     */
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement startBtn = driver.findElement(By.xpath("//button[@id='startButton']"));
        startBtn.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement display = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        wait.until(ExpectedConditions.visibilityOf(display));


        WebElement welcomeDisplay = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text = welcomeDisplay.getText();
        System.out.println(text);


        closeBrowser();
    }
}
