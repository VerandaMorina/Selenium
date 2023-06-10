package class7;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class tables extends CommonMethods {
    public static void main(String[] args) {

    String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
    String browser = "chrome";
    openBrowserAndLaunchApplication(url, browser);
       //print the whole table on the console
        // get the whole table
    WebElement wholeTable = driver.findElement(By.xpath("//table[@id='customers']"));
    String allText = wholeTable.getText();
        System.out.println(allText);

        System.out.println("*****************************************************************");

        //print the rows of the tables
       List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
       for (WebElement row:rows){
           String rowText=row.getText();
           System.out.println(rowText);
       }
        System.out.println("*****************************************************************");

       //this one we use when we want to get a specific data for example from header company nif it containes google
        //print all data of the tables
        List<WebElement> allCellData=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement cell:allCellData){
            String cellData=cell.getText();
            System.out.println(cellData);
        }


}
}
