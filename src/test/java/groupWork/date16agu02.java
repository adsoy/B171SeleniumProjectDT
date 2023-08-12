package groupWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class date16agu02 {

    public static void main(String[] args) throws InterruptedException {
        //1 launch browser
        //3 maximize browser
        //4 do implicitly wait 15sn
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2 open url https://amazon.com/
        driver.get("https://amazon.com/");

        //6 write links number and links name
        List<WebElement> linksList=driver.findElements(By.tagName("a"));
        System.out.println("Tum linklerin sayisi : "+linksList.size());

        for (WebElement w : linksList) {
            if (!w.getText().isEmpty()){
                System.out.println(w.getText());
            }
        }


        //7 click products
        driver.findElement(By.xpath("//*[@alt='Headsets']")).click();

        //8 test to searchbox tagname (what?)
        WebElement searchBox=driver.findElement(By.xpath("//*[@type='text']"));
        String name=searchBox.getTagName();
        System.out.println("tag name : "+name);

        if (name.equals("input")){
            System.out.println("tagname is correct");
        }else System.out.println("tagname is incorrect");


        //9 test to searchbox name tag's attribute name
        String actualName=searchBox.getAttribute("name");
        String expectedName="field-keywords";

        if (actualName.equals(expectedName)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //10 close driver
        driver.close();

    }
}