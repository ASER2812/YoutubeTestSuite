package com.example.youtubetestsuite;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UTMainPage extends TestSuiteRun {
    @BeforeMethod(groups = "reset")
    private void resetToHP(){
        driver.get("https://www.youtube.com/");
    }

    @Test (priority = 0)
    public void searchBarTest() throws InterruptedException {
        WebElement searchBar = driver.findElement(By.name("search_query"));
        searchBar.click();
        searchBar.sendKeys("gangnam style");
        Thread.sleep(1000);
        searchBar.submit();

        WebElement videoLink = driver.findElement(By.linkText("PSY - GANGNAM STYLE(강남스타일) M/V"));
        videoLink.click();

        Thread.sleep(2000);
        String expectedTitle = "https://www.youtube.com/watch?v=9bZkp7q19f0";
        Assert.assertEquals(driver.getCurrentUrl(), expectedTitle, "URL does not match HomePage expectation");

        Thread.sleep(1000);
        System.out.println("SearchTest passed");
    }
    @Test(priority = 1, groups = "reset")
    public void voiceSearchTest() throws InterruptedException {
        WebElement voiceSearchButton = driver.findElement(By.id("voice-search-button"));
        voiceSearchButton.click();
        Thread.sleep(2000);

        WebElement closeButton = driver.findElement(By.id("exit-button"));
        Assert.assertTrue(closeButton.isDisplayed(), "Voice search Close button not on page!");
        closeButton.click();

        Thread.sleep(2000);
        System.out.println("voiceSearchTest Passed");
    }
    @Test (priority = 2)
    public void YTLogoTest() throws InterruptedException {

        WebElement logo = driver.findElement(By.id("logo-icon"));
        Thread.sleep(1000);
        logo.click();

        String expectedTitle = "https://www.youtube.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedTitle, "URL does not match HomePage expectation");

        Thread.sleep(3000);
        System.out.println("YTLogoTest passed");
    }



}
