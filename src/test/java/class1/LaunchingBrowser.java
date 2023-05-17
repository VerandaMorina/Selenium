package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchingBrowser {
    public static void main(String[] args) {
        /*
        NAVIGATE TO WEBPAGE www.google.com
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //RETURN IT DISPLAY IN CONSOLE USING A VARIABLE
        String currentURL = driver.getCurrentUrl();
        System.out.println("The current url of the website is: "+currentURL);
        String title=driver.getTitle();
        System.out.println("The title of the website is: "+title);
        //ADDING TIME BEFORE CLOSING IT
        Thread.sleep(5000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.quit();

        }

        }

