package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EpisodePage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[5]/div[1]/div[2]/div/div[4]/div/div[1]/div[2]/div[2]/button")
    private WebElement buttonPlay;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div[2]/div/div[4]/div/div[1]/div[2]/div[2]/div[4]")
    private WebElement buttonSkip;
    public EpisodePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public Boolean startVideo() throws InterruptedException {
        buttonPlay.click();
        Thread.sleep(2500);
        log.info("Video is playing");
        return buttonSkip.isDisplayed();
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
