package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorTagName {
    public static void main(String[] args) {
        // navigate to amazon
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();

        List<WebElement>allLinks=driver.findElements(By.tagName("a"));

        for (WebElement link:allLinks){
            String LinkOfWebsite= link.getAttribute("href");
            System.out.println(LinkOfWebsite);
        }

    }
}
