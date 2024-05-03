package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SearchEdge {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        WebElement textButton = driver.findElement(By.id("small-searchterms"));
        textButton.sendKeys("Books");

        WebElement submitButton = driver.findElement(By.className("button-1 search-box-button"));
        submitButton.click();
    }
}
