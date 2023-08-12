package groupWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class date17agu02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //iphone aratınız
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone"+ Keys.ENTER);

        //çıkan sonuç yazısını konsola yazdırınız
        WebElement resultText=driver.findElement(By.xpath("//*[text()='1-16 of 42 results for']"));
        System.out.println("resultText = " + resultText.getText());

        //çıkan ürünlerden ilk 5 tanesine tıklayıp urun başlıklarını yazdırınız
        List<WebElement> ilkBesSonuc=driver.
                findElements(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[position()>=1 and position()<=5]"));

        for (int i = 0; i < ilkBesSonuc.size(); i++) {

            ilkBesSonuc=driver.
                    findElements(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[position()>=1 and position()<=5]"));

            ilkBesSonuc.get(i).click();
            System.out.println(driver.getTitle());

            Thread.sleep(2000);
            driver.navigate().back();

        }
        System.out.println();
        //sayfayi kapatiniz
        driver.close();
    }
}
