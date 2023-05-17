package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    HW1:
   navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
   fill out the form
   close the browser
   Note: use name or id as locators
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Veranda");
        driver.findElement(By.id("customer.lastName")).sendKeys("Morina");
        driver.findElement(By.id("customer.address.street")).sendKeys("Kurt-Eisner");
        driver.findElement(By.id("customer.address.city")).sendKeys("Munich");
        driver.findElement(By.id("customer.address.state")).sendKeys("Germany");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("81735");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-456-7899");
        driver.findElement(By.id("customer.ssn")).sendKeys("111-22-3333");
        driver.findElement(By.id("customer.username")).sendKeys("Vera");
        driver.findElement(By.id("customer.password")).sendKeys("Password");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Password");

        // driver.quit();

    }
}
