package tpolaba11.test;

import org.junit.Assert;
import org.testng.annotations.Test;
import tpolaba11.page.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;
public class PlayVideoTest extends CommonConditions {
    private static final String animeName = "Hunter x Hunter";
    @Test
    public void isTestFound() throws InterruptedException {
        Boolean isPlaying = new MainPage(driver)
                .open()
                .openAnimePage()
                .openHunter()
                .openEpisode()
                .startVideo();
        Assert.assertTrue(isPlaying);
        assertThat("Test is found", isPlaying.equals(true));
    }
}
