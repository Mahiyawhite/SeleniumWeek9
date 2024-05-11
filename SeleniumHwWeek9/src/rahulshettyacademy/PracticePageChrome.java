package rahulshettyacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PracticePageChrome {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        WebElement RadioButton = driver.findElement(By.name("radioButton"));
        RadioButton.click();

        WebElement SuggessionBox = driver.findElement(By.id("autocomplete"));
        SuggessionBox.sendKeys("India");

        WebElement DropdownMenu = driver.findElement(By.name("dropdown-class-example"));
        DropdownMenu.click();

        WebElement CheckBox = driver.findElement(By.id("checkBoxOption1"));
        CheckBox.click();
    }
}
