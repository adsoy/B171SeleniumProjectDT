package day05_CssSelector_RelativeLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        ÖDEV:
        https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        Add Element butonuna basin 100 kez basınız
        Delete butonuna 90 kez basınız
        Ve 90 kez basıldığını doğrulayınız
        */
        WebElement pressAddElement = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        for (int i = 0; i < 100; i++) {
            pressAddElement.click();
        }
        //Delete tusuna basin
        int count =0;
        for (int i = 0; i <= 90 ; i++) {
            driver.findElement(By.cssSelector("button[class='added-manually']")).click();
            count++;
        }

        if (count==90){
            System.out.println(count + "KEZ BASILDI");
        }else System.out.println(count + "KEZ BASILMADI");
    }
}
