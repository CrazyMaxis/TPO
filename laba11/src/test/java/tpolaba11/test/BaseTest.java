package tpolaba11.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tpolaba11.page.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;

public class BaseTest extends CommonConditions {
    @Test
    public void isMainPageOpened() {
        String url = new MainPage(driver)
                .open()
                .getUrl();
        Assert.assertEquals("https://jut.su/", url);
        assertThat("Url matched", url.equals("https://jut.su/"));
    }
}

