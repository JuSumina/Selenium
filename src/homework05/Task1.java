package homework05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startBtn = driver.findElement(By.xpath("//button[text()='Start']"));
        startBtn.click();

        WebElement finishBtn = driver.findElement(By.xpath("//div[@id='finish']"));
        finishBtn.click();

        WebElement message = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

        if (message.isDisplayed()) {
            System.out.println("'Hello World!' message is now displayed");
        } else {
            System.out.println("'Hello World!' message is NOT displayed");
        }

    }
}
