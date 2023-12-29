package tpolaba11.test;

import org.junit.Assert;
import org.testng.annotations.Test;
import tpolaba11.page.AnimePage;
import tpolaba11.page.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;
public class ChangeCategoryTest extends CommonConditions {
    @Test
    public void isTestFound() throws InterruptedException {
        Boolean isMatchInfo = new MainPage(driver)
                .open()
                .openAnimePage()
                .openOngoing()
                .openFirstAnime()
                .checkAnimeDetails();
        Assert.assertTrue(isMatchInfo);
        assertThat("Info is found", isMatchInfo.equals(true));
    }
}
