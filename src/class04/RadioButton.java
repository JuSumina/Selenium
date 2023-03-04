package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        WebElement continueAnyway = driver.findElement(By.xpath("//a[@id='continue-with-click']"));
        continueAnyway.click();

        WebElement maleBtn1 = driver.findElement(By.cssSelector("input[value='Male']"));
        boolean isEnabaledMale = maleBtn1.isEnabled();
        System.out.println("the radio button male is enabled "+isEnabaledMale);
        boolean isDisplayed = maleBtn1.isDisplayed();
        System.out.println("the radio button male is displayed "+isDisplayed);
        boolean isSelectedMale = maleBtn1.isSelected();
        System.out.println("the radio button male is selected "+isSelectedMale);



        maleBtn1.click();




    }
}
