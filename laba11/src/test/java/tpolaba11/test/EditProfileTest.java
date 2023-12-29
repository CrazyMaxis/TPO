package tpolaba11.test;

import org.junit.Assert;
import org.testng.annotations.Test;
import tpolaba11.page.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;
public class EditProfileTest extends CommonConditions {
    @Test
    public void isTestFound() throws InterruptedException {
        Boolean isChanged = new MainPage(driver)
                .open()
                .logIn()
                .logIn()
                .openProfilePage()
                .editProfile()
                .checkProfileInfo();
        Assert.assertTrue(isChanged);
        assertThat("Test is passed", isChanged.equals(true));
    }
}
