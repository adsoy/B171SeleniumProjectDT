package day12_Upload_SeleniumWait;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_UploadFile extends TestBase {
    @Test
    public void test01() {
        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        //chooseFile butonuna basalim
        WebElement dosyaSec = driver.findElement(By.id("file-upload"));
        //dosyaSec.click();-->Tiklama işleminde windows penceresi açılacağından burda hata alırız
        //selenium windows pencerelerine müdehale edemez

        //Yuklemek istediginiz dosyayi secelim.
        //""C:\Users\soyle\OneDrive\Masaüstü\B171.txt"" --> Yüklemek istediğimiz dosyanın yolu
        String dosyaYolu = "C:\\Users\\soyle\\OneDrive\\Masaüstü\\B171.txt";
        dosyaSec.sendKeys(dosyaYolu);
        //uploadFilePath(dosyaYolu);//-->TestBase den cekeriz
        bekle(2);

        //Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();

        //"File Uploaded!" textinin goruntulendigini test edelim
        WebElement text = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals("File Uploaded!",text.getText());
        Assert.assertTrue(text.isDisplayed());

    }
}