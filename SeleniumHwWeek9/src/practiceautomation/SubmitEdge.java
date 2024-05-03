package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SubmitEdge {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://practice-automation.com/form-fields/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        WebElement textBox = driver.findElement(By.name("name"));
        textBox.sendKeys("Vaishali");

        WebElement checkBox = driver.findElement(By.id("drink3"));
        checkBox.click();

        WebElement radioButton = driver.findElement(By.name("fav_color"));
        radioButton.click();

        WebElement submitButton = driver.findElement(By.id("submit-btn"));
        submitButton.click();
    }
}
