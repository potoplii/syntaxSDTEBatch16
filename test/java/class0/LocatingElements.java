package class0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        // send some tex in  the email

        driver.findElement(By.id("email")).sendKeys("kdkufhuhfl@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("ksdfaegA");
// print the url
        String url= driver.getCurrentUrl();
        System.out.println(url);

// print the title
        String titel= driver.getTitle();
        System.out.println(titel);
// confirm title is correct
        if(titel.equals("Facebook - log in or sign up")){
            System.out.println("the title is correct");
        }else {
            System.out.println("title is incorrect");
        }
        //close
        driver.quit();


    }
}
