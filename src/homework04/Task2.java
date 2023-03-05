package homework04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        WebElement continueAnyway = driver.findElement(By.xpath("//a[@id='continue-with-click']"));
        continueAnyway.click();

        List<WebElement> checkBtns = driver.findElements(By.cssSelector("input[class='cb1-element']"));
        for (WebElement checkBtn: checkBtns) {
            String age = checkBtn.getAttribute("value");
            if (age.equalsIgnoreCase("Option-2")) {
                checkBtn.click();
            }
        }
    }
}
