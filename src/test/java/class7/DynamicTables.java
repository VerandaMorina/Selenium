package class7;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DynamicTables extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");


        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");


        WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@id, 'Login')]"));
        loginBtn.click();

        WebElement pimTab=driver.findElement(By.xpath("(//a[@id='menu_pim_viewPimModule'])"));
        pimTab.click();
    }
}
