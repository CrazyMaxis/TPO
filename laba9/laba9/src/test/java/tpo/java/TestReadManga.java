package tpo.java;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class TestReadManga {
    @Test
    public void HeroInformation() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jut.su/");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://jut.su/", currentUrl);
        Thread.sleep(500);

        WebElement buttonManga = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/ul/li[6]/a"));
        buttonManga.click();
        WebElement mangaPageTitle = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[1]/h1"));
        Assert.assertTrue(mangaPageTitle.isDisplayed());
        Thread.sleep(500);

        WebElement buttonNaruto = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div/div[1]/a"));
        buttonNaruto.click();
        WebElement narutoPageTitle = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[1]/h1"));
        Assert.assertTrue(narutoPageTitle.isDisplayed());
        Thread.sleep(500);

        WebElement buttonChapter = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[2]/div[2]/a[114]"));
        buttonChapter.click();
        String expectedTitle = "Манга Наруто 114 в Школе техник Наруто";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        Thread.sleep(500);

        WebElement buttonPage1 = driver.findElement(By.xpath("  /html/body/div[5]/div[1]/div/div[1]/div[3]/a"));
        buttonPage1.sendKeys(Keys.ARROW_RIGHT);
        Thread.sleep(500);

        WebElement buttonPage2 = driver.findElement(By.xpath("  /html/body/div[5]/div[1]/div/div[1]/div[3]/a"));
        buttonPage2.sendKeys(Keys.ARROW_LEFT);
        Thread.sleep(500);

        driver.quit();
    }
}
