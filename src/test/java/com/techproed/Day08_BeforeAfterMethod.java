package com.techproed;

import org.junit.*;

public class Day08_BeforeAfterMethod {

    @Before
    public void methoddanOnce(){
        System.out.println("Methoddan once calisti...");
    }

    @BeforeClass
    public static void setUp(){
        System.out.println("Setup calisti...");
    }
    @Test
    public void test1(){
        System.out.println("Test1 calisti...");
    }
    @Test
    public void test2(){
        System.out.println("Test2 calisti...");
    }

    @After
    public void tearDown(){
        System.out.println("tearDown calisti...");
    }

    @AfterClass
    public static void methoddanSonra(){
        System.out.println("Methoddan sonra calisti...");
    }
}
