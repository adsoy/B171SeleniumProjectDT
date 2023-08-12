package udemy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestPractice_01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


            // 1. Launch browser
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            // 2. Navigate to url 'http://automationexercise.com'
             driver.get("http://automationexercise.com");

            // 3. Verify that home page is visible successfully
            WebElement verifyWeb = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img"));
            if(verifyWeb.isDisplayed()){
                System.out.println("Verifying is supported");
            }else{
                System.out.println("Verifying is not supported");
            }

            // Click on 'Products' button
            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();



            // 4. Verify user is navigated to PRODUCTS page successfully
            WebElement verifyProducts = driver.findElement(By.xpath("//*[@id=\"submit_search\"]"));
            if(verifyProducts.isDisplayed()){
            System.out.println("Verifying is supported");
            }else{
            System.out.println("Verifying is not supported");
            }

            // Enter product name in search input and click search button
            driver.findElement(By.xpath("//*[@id=\"search_product\"]")).sendKeys("tshirt");
            driver.findElement(By.xpath("//*[@id=\"submit_search\"]")).click();


            // 5. Verify user is navigated to ALL PRODUCTS page successfully
        driver.navigate().back();
        WebElement verifyAllProducts = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2"));
        if(verifyAllProducts.isDisplayed()){
            System.out.println("Verifying is supported");
        }else{
            System.out.println("Verifying is not supported");
        }
        //6. Sayfayi kapatin
        driver.close();




        }


    }

