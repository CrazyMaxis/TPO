package tpolaba11.test;

import org.junit.Assert;
import org.testng.annotations.Test;
import tpolaba11.page.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;
public class OpenNovellaTest extends CommonConditions {
    @Test
    public void isTestFound() throws InterruptedException {
        Boolean isMatchInfo = new MainPage(driver)
                .open()
                .openNovellaPage()
                .openGaaraPage().
                checkNovellaDetails();
        Assert.assertTrue(isMatchInfo);
        assertThat("Info is found", isMatchInfo.equals(true));
    }
}
