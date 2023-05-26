package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    HW1:
    Open chrome browser
    Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
    fill in the complete form
     */

        public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://practice.syntaxtechs.net/input-form-demo.php");

            WebElement name=driver.findElement(By.cssSelector("input[placeholder= 'First Name']"));
            name  .sendKeys("Veranda");

            WebElement last=driver.findElement(By.cssSelector("input[name='last_name']"));
            last .sendKeys("Morina");

            WebElement email=     driver.findElement(By.cssSelector("input[name='email']"));
            email.sendKeys("morinaveranda@gmail.com");

            WebElement phone= driver.findElement(By.cssSelector("input[name='phone']"));
            phone.sendKeys("845-555-1212");

            WebElement adress=driver.findElement(By.cssSelector("input[name='address']"));
            adress.sendKeys("Kurt-Eisner");

            WebElement city=driver.findElement(By.cssSelector("input[name='city']"));
            city.sendKeys("USA-");

            WebElement state=driver.findElement(By.xpath("//option[text()= 'Georgia']"));
            state.click();

            WebElement zip=driver.findElement(By.cssSelector("input[name='zip']"));
            zip.sendKeys("81735");



            WebElement web=driver.findElement(By.cssSelector("input[name='website']"));
            web.sendKeys("http/syntax.com");

            driver.findElement(By.cssSelector("input[value='yes']")).click();

            driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("Selenium Task");

            driver.findElement(By.cssSelector("button[type='submit']")).click();
        }
    }



