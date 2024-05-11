package rahulshettyacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class PracticePageFirefox {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        WebElement RadioButton = driver.findElement(By.name("radioButton"));
        RadioButton.click();

        WebElement SuggessionBox = driver.findElement(By.id("autocomplete"));
        SuggessionBox.sendKeys("Canada");

        WebElement DropdownMenu = driver.findElement(By.name("dropdown-class-example"));
        DropdownMenu.click();

        WebElement CheckBox = driver.findElement(By.id("checkBoxOption3"));
        CheckBox.click();



    }

}
