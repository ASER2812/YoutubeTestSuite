package com.example.youtubetestsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UTShorts extends TestSuiteRun{
    @BeforeMethod(groups = "shorts")
    private void setshorts() throws InterruptedException {
        driver.get("https://www.youtube.com/feed/trending");
        Thread.sleep(2000);
    }
    @Test(priority = 0 , groups = "shorts")
    public void previewTest() throws InterruptedException {
        WebElement videoshorts = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[3]"));
        videoshorts = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[3]/div[3]/ytd-reel-shelf-renderer/div[2]/yt-horizontal-list-renderer/div[2]/div/div/ytd-reel-item-renderer[1]/div[1]"));
        Thread.sleep(1000);


        Actions actions = new Actions(driver);
        actions.moveToElement(videoshorts).perform();

        System.out.println("Preview Test Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 1 , groups = "shorts")
    public void openShortTest() throws InterruptedException {
        WebElement  videoshorts = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[3]/div[3]/ytd-reel-shelf-renderer/div[2]/yt-horizontal-list-renderer/div[2]/div/div/ytd-reel-item-renderer[1]/div[1]"));
        videoshorts.click();

        Thread.sleep(1000);

        String expectedTitle = "https://www.youtube.com/shorts";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(expectedTitle), "URL does not match that a Shorts video: " + currentUrl);


        System.out.println("Open Video Test Passed");
        Thread.sleep(2000);
    }

}
