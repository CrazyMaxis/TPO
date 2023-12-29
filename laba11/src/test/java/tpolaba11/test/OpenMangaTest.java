package tpolaba11.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tpolaba11.page.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;
public class OpenMangaTest extends CommonConditions {
    @Test
    public void CheckInfoAboutHeroes() {
        String url = new MainPage(driver)
                .open()
                .openMangaPage()
                .openNaruto()
                .openChapter()
                .getUrl();
        Assert.assertEquals("https://jut.su/manga/1/1.html", url);
        assertThat("Url matched", url.equals("https://jut.su/manga/1/1.html"));
    }
}
