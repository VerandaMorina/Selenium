package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HW2 {
    public static void main(String[] args) {
        /*
        navigate to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
        enter the username "Tester"
        enter the password "test"
        get the title of the webPage and confirm that it is  "Web Orders Login"
         */
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("Test");
        System.out.println(driver.getTitle());
        //driver.quit();
        // }
    }
}
