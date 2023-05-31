package class5;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Frames extends CommonMethods {
    //task1:  print animal on screen
    public static void main(String[] args) {
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.switchTo().frame(1);
        WebElement animal=driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());

        //select baby cat
        WebElement dd =driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(dd);
        sel.selectByVisibleText("Baby Cat");

        //switch the focus to the main page
        driver.switchTo().defaultContent();
        //switch to frame containing text box
        driver.switchTo().frame("frame1");
        WebElement textbox= driver.findElement(By.xpath("//input"));
        textbox.sendKeys("veranda");

        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.id("a")).click();
    }
}
