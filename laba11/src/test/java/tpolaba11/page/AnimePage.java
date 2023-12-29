package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class AnimePage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div[2]/div[8]/a")
    private WebElement buttonHunter;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div[1]/div/div[2]")
    private WebElement buttonChangeCategory;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div[1]/div/div[1]/div[3]/div/div/div[1]/span/a")
    private WebElement buttonOngoing;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div[1]/div/div[1]/div[5]/a")
    private WebElement buttonCloseFilter;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div[2]/div[1]/a")
    private WebElement buttonFirstAnime;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div[2]/div[8]/a/div/div[2]")
    private WebElement buttonHunterImg;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div[2]/div[8]/a/div/div[2]/div[1]")
    private WebElement buttonViewed;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div[2]/div[8]/a/div/div[2]/div[2]/ul/li[5]/span")
    private WebElement buttonRate;
    public AnimePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public HunterPage openHunter() {
        buttonHunter.click();
        log.info("Hunter page is opened");
        return new HunterPage(driver);
    }

    public AnimePage openOngoing() {
        buttonChangeCategory.click();
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        buttonOngoing.click();
        buttonCloseFilter.click();
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Ongoing Anime page is opened");
        return new AnimePage(driver);
    }

    public JujutsuPage openFirstAnime() {
        buttonFirstAnime.click();
        log.info("First Anime page is opened");
        return new JujutsuPage(driver);
    }

    public Boolean rateAnime() {
        Actions actions = new Actions(driver);
        actions.moveToElement(buttonHunterImg).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 700)");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        buttonViewed.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        buttonRate.click();
        log.info("Anime was rated");
        return true;
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
