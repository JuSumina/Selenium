package homework05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        textBox.clear();
        textBox.sendKeys("Hello World!");
        driver.switchTo().defaultContent();
    }
}
