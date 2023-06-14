package class9;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://jqueryui.com/droppable/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //as the element is inside an iframe first we need to switch focus
        driver.switchTo().frame(0);

        //find the dragable webElement
        WebElement dragable=driver.findElement(By.id("draggable"));
        //find element where u want to drop
        WebElement dropable=driver.findElement(By.id("droppable"));

        //action class
        Actions action=new Actions(driver);
        action.dragAndDrop(dragable,dropable).perform();

    }
}
