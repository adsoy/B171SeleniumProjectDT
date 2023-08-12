package day07_Dropdown_Alert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class HomeWork01 extends TestBase {

            //●https://the-internet.herokuapp.com/dropdown adresine gidin.
        @Test
        public void test01 () {

            driver.get("https://the-internet.herokuapp.com/dropdown");

            // 1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
            WebElement options = driver.findElement(By.xpath("(//select[@id='dropdown'][1])"));
            Select optionsTotal=new Select(options);
            optionsTotal.selectByIndex(1);
            System.out.println("Index : "+optionsTotal.getFirstSelectedOption());
            System.out.println("______________________");
            bekle(5);

            //2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
            optionsTotal.selectByValue("2");
            System.out.println("Value  : "+optionsTotal.getFirstSelectedOption());
            System.out.println("________________");
            bekle(5);

            // 3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
            optionsTotal.selectByVisibleText("Option 1");
            System.out.println("Visible :"+optionsTotal.getFirstSelectedOption());
            System.out.println("_________________________");

            //4.Tüm dropdown değerleri(value) yazdırın
            System.out.println("AllDrops :"+optionsTotal.getAllSelectedOptions());
        }





        //5.Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True , degilse
        // False yazdırın.
        //
}
