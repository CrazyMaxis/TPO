package tpolaba11.test;

import org.junit.Assert;
import org.testng.annotations.Test;
import tpolaba11.page.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;
public class SendMsgTest extends CommonConditions {
    @Test
    public void isTestFound() throws InterruptedException {
        Boolean isSent = new MainPage(driver)
                .open()
                .logIn()
                .logIn()
                .openProfilePage()
                .openFriends()
                .openMsg()
                .sendMsg();
        Assert.assertTrue(isSent);
        assertThat("Test is passed", isSent.equals(true));
    }
}
