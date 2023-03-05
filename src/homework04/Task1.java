package homework04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        WebElement continueAnyway = driver.findElement(By.xpath("//a[@id='continue-with-click']"));
        continueAnyway.click();

        WebElement checkBtn1 = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean isSelectedCheck = checkBtn1.isSelected();
        System.out.println("The check box is selected "+isSelectedCheck);

        if (checkBtn1.isSelected()==false) {
            checkBtn1.click();
        }

        boolean isSelectedCheck2 = checkBtn1.isSelected();
        System.out.println("The check box is selected "+isSelectedCheck2);
    }
}
