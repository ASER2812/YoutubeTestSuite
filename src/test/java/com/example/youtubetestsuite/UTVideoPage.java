package com.example.youtubetestsuite;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UTVideoPage extends TestSuiteRun{
    @BeforeMethod(groups = "VidPage")
    private void setVP() throws InterruptedException {
        Thread.sleep(1000);
        driver.get("https://www.youtube.com/watch?v=lepYkDZ62OY");
        Thread.sleep(2000);
    }


    @Test(priority = 0, groups = "VidPage")
    public void likeButtonTest() throws InterruptedException {

        WebElement likeButton = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[2]/ytd-watch-metadata/div/div[2]/div[2]/div/div/ytd-menu-renderer/div[1]/segmented-like-dislike-button-view-model/yt-smartimation/div/div/like-button-view-model"));
        likeButton.click();

        Thread.sleep(1000);

        WebElement confirmElement = driver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-iron-dropdown/div/ytd-modal-with-title-and-button-renderer/div/ytd-button-renderer"));




        Assert.assertTrue(confirmElement.isDisplayed(), "Liked button not pressed" );

        System.out.println("Liked Button Test Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 1, groups = "VidPage")
    public void dislikeButtonTest() throws InterruptedException {

        WebElement dislikeButton = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[2]/ytd-watch-metadata/div/div[2]/div[2]/div/div/ytd-menu-renderer/div[1]/segmented-like-dislike-button-view-model/yt-smartimation/div/div/dislike-button-view-model"));
        dislikeButton.click();

        Thread.sleep(1000);

        WebElement confirmElement = driver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-iron-dropdown/div/ytd-modal-with-title-and-button-renderer/div/ytd-button-renderer"));




        Assert.assertTrue(confirmElement.isDisplayed(), "Disliked button not pressed" );

        System.out.println("Disliked Button Test Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 2, groups = "VidPage")
    public void shareButtonTest() throws InterruptedException {

        WebElement shareButton = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[2]/ytd-watch-metadata/div/div[2]/div[2]/div/div/ytd-menu-renderer/div[1]/yt-button-view-model/button-view-model"));
        shareButton.click();

        Thread.sleep(1000);

        WebElement confirmElement = driver.findElement(By.id("copy-button"));



        Assert.assertTrue(confirmElement.isDisplayed(), "Share button not pressed" );

        System.out.println("Share Button Test Passed");
        Thread.sleep(2000);
    }

}
