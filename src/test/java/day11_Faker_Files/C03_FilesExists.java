package day11_Faker_Files;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FilesExists extends TestBase {
    @Test
    public void test01() {
         /*
Bilgisayarımızdaki bir dosyanın varlığını test edebilmemiz için;
    1-Öncelikle dosyanın yolunu almamız gerekir. Sağ klik yaparak copy path yapılır.
    2-Files.exists(Paths.get(dosyaYolu)) Files class'ından exists() methodu ile dosya yolunun
    varlığını test edebiliriz. Yukarıdaki kod bize true veya false döner. Dolayısıyla
    bu kodu direk Assert.assertTrue(Files.exists(Paths.get(dosyaYolu))) şeklinde yazarak
    dosya varsa testim passed yoksa failed olur
 */
        //Masaüstünde bir dosya oluşturalım "C:\Users\soyle\OneDrive\Masaüstü\B171.txt"
        String dosyaYolu="C:\\Users\\soyle\\OneDrive\\Masaüstü\\B171.txt";


        //Ve bu dosyanın varlığını doğrulayalım
        System.out.println(Files.exists(Paths.get(dosyaYolu)));
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }

    @Test
    public void test02 () {
        /*
        Ortak çalışmalarda bir server üzerinden bir dosya yolu almak istersek, her kullanıcının bilgisayarının
        ana yolu farklı olabilir ve server daki dosyanın yolu ortaktır. Dolayısıyla System.getProperty(user.home)
        methodu ile bilgisayarımızın ana yolunu alabilir, server daki ortak yol ile bunu birleştirip dosyanın yolunu
        dinamik olarak alabiliriz
        */

        //Test01 methodundaki gibi dosyanın yolunu doğrulayalım
        System.out.println(System.getProperty("user.home"));//C:\Users\soyle
        String farkliYol=System.getProperty("user.home");//-->herkeste farklı yol

        //"C:\Users\Lenovo\OneDrive\Masaüstü\B171.txt"
        String ortakYol = "/OneDrive/Masaüstü/B171.txt";//-->Server'daki dosyanın yolu
        String dosyaYolu = farkliYol+ortakYol;//-->Bu şekilde dosyanın yolunu aldık
        System.out.println(Files.exists(Paths.get(dosyaYolu)));
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
