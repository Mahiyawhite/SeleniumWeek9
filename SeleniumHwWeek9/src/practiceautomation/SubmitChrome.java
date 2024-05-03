package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SubmitChrome {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-automation.com/form-fields/");

//        String tital = driver.getTitle();
//        System.out.println(tital);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        WebElement textBox = driver.findElement(By.name("name"));
        textBox.sendKeys("Vaishali");

        WebElement checkBox = driver.findElement(By.id("drink1"));
        checkBox.click();

        WebElement radioButton = driver.findElement(By.id("color1"));
        radioButton.click();

        WebElement name = driver.findElement(By.name("siblings"));
        name.click();

        WebElement submitButton = driver.findElement(By.id("submit-btn"));
        submitButton.click();
        }
    }
