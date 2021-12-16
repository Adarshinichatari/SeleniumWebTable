package webTable;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RowData {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        List<WebElement> column1 = driver.findElements(By.xpath("//*[@class='tsc_table_s13']/tbody/tr"));
        int row_num=1;
        for (WebElement trElement : column1 )
        {
            System.out.println("row" + row_num + ", row text=" +trElement.getText());
            row_num++;
        }
        driver.quit();
    }

    }
