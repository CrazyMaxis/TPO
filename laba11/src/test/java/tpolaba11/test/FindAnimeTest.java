package tpolaba11.test;

import org.junit.Assert;
import org.testng.annotations.Test;
import tpolaba11.page.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;
public class FindAnimeTest extends CommonConditions {
    private static final String animeName = "Hunter x Hunter";
    @Test
    public void isTestFound() {
        Boolean isMatchInfo = new MainPage(driver)
                .open()
                .searchAnime(animeName)
                .checkAnimeDetails(animeName);
        Assert.assertTrue(isMatchInfo);
        assertThat("Info is found", isMatchInfo.equals(true));
    }
}
