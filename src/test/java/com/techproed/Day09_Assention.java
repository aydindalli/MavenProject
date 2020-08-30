package com.techproed;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day09_Assention {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1(){
        driver.get("http://google.com");
        // Test Case: Google.com un basligi "Google Arama Sayfasi" olsun
        String titleGoogle= driver.getTitle();

        // Title de "Googgle arama Sayfasi" icerip icermedigini TEST ediniz
        Assert.assertEquals("Google Arama Sayfasi", titleGoogle);
    }

    @Test
    public void test2(){
        driver.get("http://amazon.com");
        // Amazon.com un basligi Amazon kelimesini iceriyor olsun!

        String titleAmazon = driver.getTitle();

        boolean iceriyorMu = titleAmazon.contains("Amazon");

        // boolean veri tipinde bir deger giriyoruz
        Assert.assertTrue(iceriyorMu);

    }

    @Test
    public  void test3(){
        driver.get("https://facebook.com");
        String titleFacebook= driver.getTitle();
        boolean icerirMi= titleFacebook.contains("Youtube");
        Assert.assertFalse(icerirMi);
    }

    @Test
    public void test4(){
        driver.get("http://google.com");
        String title = driver.getTitle();
        System.out.println("MERHABALAR..");
        Assert.assertEquals("Google Arama Sayfası",title);
        // eğer test başarısızsa içerisinde bulunulan testin kalan kısmı çalıştırmıyor.
        System.out.println("TEST DOĞRULAMA İŞLEMİ BİTTİ..");
    }
    @Test
    public void test5(){
        driver.get("http://facebook.com");
        String title = driver.getTitle();
        // Facebook.com'un title'ı Youtube kelimesini içermesin.
        boolean iceriyorMu = title.contains("Google");
        Assert.assertFalse(iceriyorMu); // False olduğunu doğrula.
        System.out.println("TEST DOĞRULAMA İŞLEMİ BİTTİ..");
    }


    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
