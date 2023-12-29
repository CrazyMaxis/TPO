package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[5]/div[1]/div[2]/div[1]/center[1]/b/a")
    private WebElement buttonEditProfile;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div[2]/div[1]/div[4]/form/div[2]/table/tbody/tr[13]/td[2]/textarea")
    private WebElement areaAboutMyself;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div[2]/div[1]/div[4]/form/div[2]/div/input[1]")
    private WebElement buttonSave;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div[2]/div[1]/center[2]/b/a")
    private WebElement buttonCheckInfo;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div[1]/p[3]/b")
    private WebElement infoAboutMyself;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div/a[1]")
    private WebElement buttonFriends;
    public ProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public FriendsPage openFriends() {
        buttonFriends.click();
        log.info("Friends page was opened");
        return new FriendsPage(driver);
    }
    public ProfilePage editProfile() {
        buttonEditProfile.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 1000)");
        areaAboutMyself.click();
        areaAboutMyself.sendKeys("Бубджидубжизус");
        buttonSave.click();
        log.info("Profile was edited");
        return new ProfilePage(driver);
    }

    public Boolean checkProfileInfo() {
        buttonCheckInfo.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 1000)");
        log.info("Profile info checked");
        return infoAboutMyself.isDisplayed();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
