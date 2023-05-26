package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
    HW2:
    Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
    Enter valid username
    Leave password field empty
    Click on login button
    Verify error message with text “Password cannot be empty” is displayed.

     */
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();
        WebElement user = driver.findElement(By.cssSelector("input[id= 'txtUsername']"));
        user.sendKeys("Admin");

        WebElement login = driver.findElement(By.cssSelector("input[id= 'btnLogin']"));
        login.click();
        String text = driver.findElement(By.cssSelector("span[id='spanMessage']")).getText();

        if (text.equals("Password cannot be empty")) {
            System.out.println("Right message");
        } else {
            System.out.println("Incorrect message ");
        }

    }
}
