package day05_CssSelector_RelativeLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_CssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        WebElement addElementButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addElementButton.click();
        Thread.sleep(3000);

        //Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[class='added-manually']"));
        if (deleteButton.isDisplayed()){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        //Delete tusuna basin
        deleteButton.click();
        Thread.sleep(3000);

        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.cssSelector("h3"));
        if (addRemoveElement.isDisplayed()){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //sayfayı kapatınız
        driver.close();

        /*
        CssSelector kullanmak icin ilk olarak tagName sonrasında köşeli parantez icinde attribute ve degeri yazilir.
        SYNTAX:
                tagName[attributeName='attributeDegeri']

                XPATH ILE CSSSELECTOR arasindaki fark
                1-Xpath ile bir webElement için birden fazla sonuc verirse index ile bunu tek e dusurebiliriz
                Fakat cssSelector ile index kullanamayiz
                2-Xpath ile bir tag e sahip webElement in text ini locate edebiliriz.
                Fakat css ile bunu yapamayiz
                3-cssSelector Xpath e gore daha hizli calisir.
         */

    }
}