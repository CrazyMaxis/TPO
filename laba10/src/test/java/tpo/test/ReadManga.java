package tpo.test;

import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tpo.page.JutsuChapterPage;
import tpo.page.JutsuHomePage;
import tpo.page.JutsuMangaPage;
import tpo.page.JutsuNarutoPage;

public class ReadManga {
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
    public void TryReadNarutoManga() throws InterruptedException {
        String currentUrl = "";
        String mangaUrl = "https://jut.su/manga/";
        String narutoUrl = "https://jut.su/manga1/";
        String chapterUrl = "https://jut.su/manga/1/1.html";
        String nextPageUrl = "https://jut.su/manga/1/2.html";

        currentUrl = new JutsuHomePage(driver).openPage().openManga();
        Assert.assertEquals(mangaUrl, currentUrl);

        currentUrl = new JutsuMangaPage(driver).openNaruto();
        Assert.assertEquals(narutoUrl, currentUrl);

        currentUrl = new JutsuNarutoPage(driver).openChapter();
        Assert.assertEquals(chapterUrl, currentUrl);

        currentUrl = new JutsuChapterPage(driver).SwitchToNextPage();
        Assert.assertEquals(nextPageUrl, currentUrl);
    }
}
