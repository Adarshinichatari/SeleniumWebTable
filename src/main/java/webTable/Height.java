package webTable;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Height {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        List<WebElement> Bruj_Khalifa = driver.findElements(By.xpath("//*[@class='tsc_table_s13']/tbody/tr[1]"));
      for (WebElement element : Bruj_Khalifa ) {
          String Height = element.getText();
           if (Height.contains("829m"))
           {
           System.out.println("Height of Bruj Khalifa is 829m");
         } else{
            System.out.println("Expected height is wrong");
        }

      }

        driver.quit();

    }
}