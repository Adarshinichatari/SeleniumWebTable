import java.util.List;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Noofrowsandcols {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //Finding number of Rows
        List<WebElement> rowsNumber = driver.findElements(By.xpath("//*[@class='tsc_table_s13']/tbody/tr"));
        int rowCount = rowsNumber.size();
        System.out.println("No of rows in this table : " + rowCount);
        //Finding number of Columns
        List<WebElement> columnsNumber = driver.findElements(By.xpath("//*[@class='tsc_table_s13']/thead/tr/th"));
        int columnCount = columnsNumber.size();
        System.out.println("No of columns in this table : " + columnCount);

        List<WebElement> column1 = driver.findElements(By.xpath("//*[@class='tsc_table_s13']/tbody/tr/th[1]"));
        //tbody/tr/td[1]
        System.out.println("No of rows with actual data = " + column1.size());
        int row_num = 1;
        for (WebElement tdElement : column1) {
            System.out.println("row" + row_num + ", column 1 text=" + tdElement.getText());
            row_num++;
        }
            driver.quit();
        }
    }
