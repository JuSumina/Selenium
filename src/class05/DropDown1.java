package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        WebElement continueAnyway = driver.findElement(By.xpath("//a[@id='continue-with-click']"));
        continueAnyway.click();

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select sel = new Select(dropDown);
        sel.selectByIndex(1);
        Thread.sleep(2000);
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);
        sel.selectByVisibleText("Friday");

    }
}
