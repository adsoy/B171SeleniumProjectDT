package day04_GetTagNameGetAttribute_Xpath_Css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_GetTagNameAttribute {
    public static void main(String[] args)  {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Techpro sayfasina gidelim
        driver.get("http://www.techproeducation.com/");

        //Arama kutusunu locate edelim
        WebElement aramaKutusu=driver.findElement(By.id("searchHeaderInput"));

        //arama kutusunu tag name inin input oldugunu test edelim.
        System.out.println("Arama Kutusu WebElementi Tag Name : "+aramaKutusu.getTagName());
        String gercekTagName=aramaKutusu.getTagName();
        String BeklenenTagName="input";
        if(gercekTagName.equals(BeklenenTagName)){
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }

        //arama kutusunun class attribute degerinin "form-input" oldugunu test edelim
        String gercekAttributeName =aramaKutusu.getAttribute("class");//-->form-input
        System.out.println("Class Attribute Degeri  :"+ gercekAttributeName);
        String beklenenAttributeDegeri="form-input";
        if(gercekAttributeName.equals(beklenenAttributeDegeri)){
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }

    //sayfayı kapat
        driver.close();

    }
}
