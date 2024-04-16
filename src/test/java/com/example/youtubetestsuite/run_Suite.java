package com.example.youtubetestsuite;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


@Test
public class run_Suite {

    protected WebDriver driver;
    String ChromeDriverPath =
            "C:\\Users\\Laser\\Desktop\\ChromeDriver\\chromedriver.exe";//must change to local path of driver

    @BeforeClass
    public void BeforeUnitTest() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.youtube.com/");
        Thread.sleep(1000);

        //System.out.println("Before Test");
    }

    @AfterClass
    public void AfterUnitTest() {
        driver.quit();
        //System.out.println("After Test");
    }
    @BeforeGroups (groups = "reset")
    public void resetToHP(){
        driver.get("https://www.youtube.com/");
    }
}
