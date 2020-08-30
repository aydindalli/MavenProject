package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_BeforeAfterClass {


    @BeforeClass  // bu annotation a sahip method her class calismasindan once calisir
    public static void setup(){
        System.out.println("Setup calisti");
    }
    @Test
    public void test1(){
        System.out.println("Test1 calisti");
    }
    @Test
    public void test2(){
        System.out.println("Test2 calisti");
    }

    @AfterClass  // bu annotation a sahip method her class calismasindan sonra calisir
    public static void tearDown(){
        System.out.println("tearDown calisti");
    }



}
