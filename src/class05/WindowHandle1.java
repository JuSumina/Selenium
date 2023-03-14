package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-2097044116%3A1678243057850633&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHeJYj294AkJ5-H0Zw5XxnXZ55_fFmC7Qlj7WE-xRHaAgFGjvUDpy3t6-6_PNOGJKQe1TC9lLg");

        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        driver.findElement(By.xpath("//a[text()='Terms']")).click();

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);

        Set<String> windowHandles = driver.getWindowHandles();
        for (String wh: windowHandles) {
            System.out.println(wh);
        }

        for(String wh: windowHandles) {
            driver.switchTo().window(wh);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")) {
                break;
            }
        }

        System.out.println(driver.getTitle());


        
    }
}
