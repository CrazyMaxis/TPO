package tpo.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tpo.page.*;

public class FindAnime {
    private WebDriver driver;
    @Before
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public void quitDriver() {
        driver.quit();
        driver = null;
    }
    @Test
    public void FindAnimeByName() throws InterruptedException {
        String currentUrl = "";
        String animeNameUrl = "hunter-hunter";
        String animeName = "Hunter x Hunter";
        String correctMatchUrl = "https://jut.su/" + animeNameUrl + "/";
        Boolean isMatchAnimeInfo;

        currentUrl = new JutsuHomePage(driver).openPage().SearchAnime(animeName);
        Assert.assertEquals(correctMatchUrl, currentUrl);

        isMatchAnimeInfo = new AnimePage(driver).checkAnimeInfo(animeName);
        Assert.assertTrue(isMatchAnimeInfo);
    }
}
