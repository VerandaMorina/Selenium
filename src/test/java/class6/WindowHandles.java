package class6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowHandles extends CommonMethods {
    public static void main(String[] args) {
        String url="http://accounts.google.com/signup";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement helpBtn= driver.findElement(By.linkText("Hilfe"));
        helpBtn.click();

        WebElement privacyBtn= driver.findElement(By.xpath("//a[text()='Datenschutz']"));
        privacyBtn.click();

        String mainPageHandle=driver.getWindowHandle();
        System.out.println("main page handle is: "+mainPageHandle);

        //get handles
        //swich the focus of the driver to google help page
        Set<String> allHandles=driver.getWindowHandles();
        for (String handle:allHandles){
            driver.switchTo().window(handle);
            String title=driver.getTitle();
            if (title.equalsIgnoreCase("Google-Konto-Hilfe")){
                break;
            }

        }
        //when the switch is shifted to correct page
        System.out.println("The current page under focus is :"+driver.getTitle());

        driver.switchTo().window(mainPageHandle);

        System.out.println("the focus now is on: "+driver.getTitle());
    }
}
