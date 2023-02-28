package homework02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");

        driver.findElement(By.id("customer.firstName")).sendKeys("Julia");
        driver.findElement(By.id("customer.lastName")).sendKeys("Sumina");
        driver.findElement(By.id("customer.address.street")).sendKeys("505 Park Avenue");
        driver.findElement(By.id("customer.address.city")).sendKeys("New York");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("10022");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("7183334455");
        driver.findElement(By.id("customer.ssn")).sendKeys("098038935");

        driver.findElement(By.id("customer.username")).sendKeys("JuSumina");
        driver.findElement(By.id("customer.password")).sendKeys("Syntax15");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Syntax15");
        driver.findElement(By.xpath("//input[@value='Register']")).click();

        driver.quit();

    }
}
