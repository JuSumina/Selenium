package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");

        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));
        textBox.sendKeys("Julia");

        driver.switchTo().defaultContent();

        WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println("The text is "+text.getText());
        
    }
}
