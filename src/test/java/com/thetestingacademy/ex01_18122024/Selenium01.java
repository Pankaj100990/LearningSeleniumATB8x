package com.thetestingacademy.ex01_18122024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium01 {
    @Test
    public void test_Selenium(){

        // In Selenium 3
//        System.setProperty("webdriver.gecko.driver", "path/to/firefoxdriver");

        // Selenium 4
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

    }
}
