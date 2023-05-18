package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    HW  (only use XPATH)
    navigate to fb.com
    click on create new account
    fill up all the textboxes
    close the popup
    close the browser
    Note : in order for ur code to work
    u have to put Thread.sleep(2000) after clicking on Create new account
    */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createBtn = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
        createBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Veranda");
        driver.findElement(By.name("lastname")).sendKeys("Morina");
        driver.findElement(By.name("reg_email__")).sendKeys("morinaveranda@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("morinaveranda@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("P@ssword123#.6");
        driver.findElement(By.name("birthday_day")).sendKeys("25");
        driver.findElement(By.id("month")).sendKeys("December");
        driver.findElement(By.id("year")).sendKeys("1994");
        WebElement gender = driver.findElement(By.xpath("//label[text() = 'Female']"));
        gender.click();
        driver.findElement(By.xpath("//img[@src = 'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png']")).click();
        Thread.sleep(6000);
        driver.quit();




    }
}
