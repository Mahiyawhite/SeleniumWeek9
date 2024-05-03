package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SearchChrome {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

      //  String tital = driver.getTitle();
      //  System.out.println(tital);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys("Books");

        WebElement submitbutton = driver.findElement(By.name("q"));
        submitbutton.click();
    }
}
