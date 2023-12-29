package tpolaba11.test;

import org.junit.Assert;
import org.testng.annotations.Test;
import tpolaba11.page.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;
public class RateAnimeTest extends CommonConditions {
    @Test
    public void isTestFound() throws InterruptedException {
        Boolean isRated = new MainPage(driver)
                .open()
                .logIn()
                .logIn()
                .openAnimePage()
                .rateAnime();
        Assert.assertTrue(isRated);
        assertThat("Test is passed", isRated.equals(true));
    }
}
