package homework02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("firstname")).sendKeys("Julia");
        driver.findElement(By.name("lastname")).sendKeys("Milova");
        driver.findElement(By.name("reg_email__")).sendKeys("yuliyasuminamilova@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("yuliyasuminamilova@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Syntax15");
        driver.findElement(By.name("birthday_month")).sendKeys("Mar");
        driver.findElement(By.name("birthday_day")).sendKeys("1");
        driver.findElement(By.name("birthday_year")).sendKeys("1990");
        driver.findElement(By.name("sex")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("websubmit")).click();
        
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(3000);
        driver.quit();
    }
}
