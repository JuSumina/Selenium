package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        WebElement continueAnyway = driver.findElement(By.xpath("//a[@id='continue-with-click']"));
        continueAnyway.click();

        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement radioBtn: radioBtns) {
            String age = radioBtn.getAttribute("value");
            if (age.equalsIgnoreCase("5 - 15")) {
                radioBtn.click();
            }
        }
    }
}
