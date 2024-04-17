package com.example.youtubetestsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class UTVideoPlayer extends TestSuiteRun{

    @Test(priority = 0, groups = "VP")
    public void pauseButtonTest() throws InterruptedException {
        WebElement pauseButton = driver.findElement(By.cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-left-controls > button"));
        pauseButton.click();
        Thread.sleep(1000);

        Assert.assertTrue(driver.findElement(By.id("movie_player")).isDisplayed(), "Video is not in FullScreen" );

        System.out.println("pauseButton Test Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 1, groups = "VP")
    public void playButtonTest() throws InterruptedException {
        WebElement pauseButton = driver.findElement(By.cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-left-controls > button"));
        pauseButton.click();
        Thread.sleep(1000);

        WebElement playButton = pauseButton;
        playButton.click();
        Thread.sleep(1000);

        Assert.assertTrue(driver.findElement(By.id("movie_player")).isDisplayed(), "Video is not paused" );

        System.out.println("playButton Test Passed");
        Thread.sleep(2000);
    }

    @Test(priority = 2, groups = "VP")
    public void FullscreenTest() throws InterruptedException {
        driver.findElement(By.id("movie_player")).click();
        WebElement FSButton = driver.findElement(By.cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-right-controls > button.ytp-fullscreen-button.ytp-button"));
        FSButton.click();
        Thread.sleep(1000);

        Assert.assertTrue(driver.findElement(By.id("movie_player")).isDisplayed(), "Video is not in FullScreen" );

        System.out.println("Fullscreen Test Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 3 , groups = "VP")
    public void TheaterTest() throws InterruptedException {
        driver.findElement(By.id("movie_player")).click();
        WebElement FSButton = driver.findElement(By.cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-right-controls > button.ytp-size-button.ytp-button"));
        FSButton.click();
        Thread.sleep(1000);

        Assert.assertTrue(driver.findElement(By.id("movie_player")).isDisplayed(), "Video is not in Theatermode" );

        System.out.println("Theater Test Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 4 , groups = "VP")
    public void hoverTest() throws InterruptedException {
        WebElement timeline = driver.findElement(By.cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-progress-bar-container > div.ytp-progress-bar"));
        Thread.sleep(1000);


        Actions actions = new Actions(driver);
        actions.moveToElement(timeline).perform();

        Assert.assertTrue(driver.findElement(By.id("movie_player")).isDisplayed(), "Timeline is not Scrubbing" );

        System.out.println("hover Test Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 4 , groups = "VP")
    public void scrubTest() throws InterruptedException {
        WebElement timeline = driver.findElement(By.cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-progress-bar-container > div.ytp-progress-bar"));
        Thread.sleep(1000);


        Actions actions = new Actions(driver);
        actions.moveToElement(timeline).perform();
        actions.click().perform();

        Assert.assertTrue(driver.findElement(By.id("movie_player")).isDisplayed(), "Timeline is not Scrubbing" );

        System.out.println("hover Test Passed");
        Thread.sleep(2000);
    }

}
