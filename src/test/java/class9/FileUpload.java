package class9;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://the-internet.herokuapp.com/upload";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement upload= driver.findElement(By.xpath("//input[@id='file-upload']"));
        //in order to upload u send keys the path of that file
        upload.sendKeys("C:\\Users\\49176\\Desktop\\Inheritance.txt");

    }
}
