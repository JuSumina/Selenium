package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("yuliyasumina@gmail.com");

        driver.findElement(By.name("pass")).sendKeys("ZXC789zxc");
        //driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.partialLinkText("password?")).click();


    }
}
