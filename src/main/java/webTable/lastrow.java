package webTable;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class lastrow {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        List<WebElement> columnsNumber1 = driver.findElements(By.xpath("//*[@class='tsc_table_s13']/tfoot/tr/th"));
        int columnCount1 = columnsNumber1.size();
        List<WebElement> columnNumber2 = driver.findElements(By.xpath("//*[@class='tsc_table_s13']/tfoot/tr/td"));
        int columnCount2 = columnNumber2.size();
        int columnCount = columnCount1 + columnCount2;
        //System.out.println("No of columns in last row : " + columnCount);
        int expectedColumnCount = 2;
        if (columnCount == expectedColumnCount)
        {
            System.out.println("Sixth row has 2 columns");
        }
        else {
            System.out.println("Expected Row count is wrong");
        }
        driver.quit();
    }

}