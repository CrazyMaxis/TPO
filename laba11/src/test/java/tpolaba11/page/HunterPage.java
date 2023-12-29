package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HunterPage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[6]/ul/li[1]/a")
    private WebElement buttonHome;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/div[2]/div/p/span")
    private WebElement animeDescription;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/div[2]/div/div/b")
    private WebElement animeName;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/div[2]/a[1]")
    private WebElement buttonEpisode;
    public HunterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public boolean checkAnimeDetails(String searchedAnimeName) {
        log.info("Anime details checked");
        return  animeName.isDisplayed() &&
                animeName.getText().equals(searchedAnimeName) &&
                animeDescription.isDisplayed();
    }
    public EpisodePage openEpisode() {
        buttonEpisode.click();
        log.info("Episode page is opened");
        return new EpisodePage(driver);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
