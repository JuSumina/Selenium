package homework03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

        WebElement continueAnyway = driver.findElement(By.xpath("//a[@id='continue-with-click']"));
        continueAnyway.click();

        WebElement userMessage = driver.findElement(By.xpath("//input[@id='user-message']"));
        userMessage.sendKeys("Hello Batch 15");

        WebElement showMessage = driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessage.click();

        WebElement valueA = driver.findElement(By.xpath("//input[@id='sum1']"));
        valueA.sendKeys("10");

        WebElement valueB = driver.findElement(By.xpath("//input[@id='sum2']"));
        valueB.sendKeys("15");

        WebElement getTotal = driver.findElement(By.xpath("//button[text()='Get Total']"));
        getTotal.click();

        WebElement printTotal = driver.findElement(By.xpath("//span[@id='displayvalue']"));
        System.out.println(printTotal.getText());

    }
}
