package com.example.youtubetestsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UTVideoPlayerSettings extends TestSuiteRun{

    @BeforeMethod(groups = "VP")
    private void setVP() throws InterruptedException {
        Thread.sleep(1000);
        driver.get("https://www.youtube.com/watch?v=lepYkDZ62OY");
        Thread.sleep(2000);
    }


    @Test(priority = 0, groups = "VP")
    public void settingsButtonTest() throws InterruptedException {
        WebElement settingsButton = driver.findElement(By.cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-right-controls > button.ytp-button.ytp-settings-button"));
        settingsButton.click();
        Thread.sleep(1000);

        Assert.assertTrue(driver.findElement(By.cssSelector("#ytp-id-18 > div > div > div:nth-child(1) > div.ytp-menuitem-content > div")).isDisplayed(), "Settings is not open" );

        System.out.println("settings Button Test Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 1, groups = "VP")
    public void ambientCheckboxTest() throws InterruptedException {

        WebElement settingsButton = driver.findElement(By.cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-right-controls > button.ytp-button.ytp-settings-button"));
        settingsButton.click();
        Thread.sleep(1000);
        WebElement ambientCheckbox = driver.findElement(By.cssSelector("#ytp-id-18 > div > div > div:nth-child(1) > div.ytp-menuitem-content > div"));
        ambientCheckbox.click();
        Thread.sleep(1000);
        System.out.println("ambientCheckbox Test Passed");
        Thread.sleep(2000);
    }

    @Test(priority = 2, groups = "VP")
    public void annotationTest() throws InterruptedException {
        WebElement settingsButton = driver.findElement(By.cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-right-controls > button.ytp-button.ytp-settings-button"));
        settingsButton.click();
        Thread.sleep(1000);
        WebElement annotationsCheckbox = driver.findElement(By.cssSelector("#ytp-id-18 > div > div > div:nth-child(2) > div.ytp-menuitem-content > div"));
        annotationsCheckbox.click();
        Thread.sleep(1000);


        System.out.println("annotationsCheckbox Test Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 3 , groups = "VP")
    public void PlaybackSpeedTest() throws InterruptedException {
        WebElement settingsButton = driver.findElement(By.cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-right-controls > button.ytp-button.ytp-settings-button"));
        settingsButton.click();
        Thread.sleep(1000);
        WebElement playbackSpeed = driver.findElement(By.cssSelector("#ytp-id-18 > div > div > div:nth-child(3) > div.ytp-menuitem-content"));
        playbackSpeed.click();
        Thread.sleep(1000);

        System.out.println("playbackSpeed Test Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 4 , groups = "VP")
    public void qualityTest() throws InterruptedException {
        WebElement settingsButton = driver.findElement(By.cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-right-controls > button.ytp-button.ytp-settings-button"));
        settingsButton.click();
        Thread.sleep(1000);
        WebElement quality = driver.findElement(By.cssSelector("#ytp-id-18 > div > div > div:nth-child(4) > div.ytp-menuitem-content"));
        quality.click();
        Thread.sleep(1000);

        System.out.println("Quality Test Passed");
        Thread.sleep(2000);
    }


}
