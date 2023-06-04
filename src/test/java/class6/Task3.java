package class6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task3 extends CommonMethods {
    /*
    HW3:
    develop a function in common methods to select from dropdown(single select)
     */
    public static void main(String[] args) throws InterruptedException {
        String url = " http://facebook.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);


        WebElement createAccountBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccountBtn.click();


        WebElement months = driver.findElement(By.xpath("//Select[@name='birthday_month']"));
        selectOptionByVisibleText(months, "May");


        WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
        selectOptionByVisibleText(days, "15");


        WebElement years = driver.findElement(By.xpath("//Select[@name='birthday_year']"));

        selectOptionByVisibleText(years, "1994");


        closeBrowser();

    }
}
