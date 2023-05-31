package class5;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) {
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.switchTo().frame(0);
        driver.switchTo().frame(0);

        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(dd);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);

        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Veranda");
    }
}
