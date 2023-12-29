package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[5]/div[2]/div[1]/ul/li[6]/a")
    private WebElement buttonManga;
    @FindBy(xpath = "/html/body/div[4]/div[3]/form/input[2]")
    private WebElement inputSearch;
    @FindBy(xpath = "/html/body/div[5]/div[2]/div[1]/ul/li[7]/a")
    private WebElement buttonNovella;
    @FindBy(xpath = "/html/body/div[5]/div[2]/div[1]/ul/li[1]/a")
    private WebElement buttonAnime;
    @FindBy(xpath = "/html/body/div[5]/div[2]/div[1]/ul/li[11]/a")
    private WebElement buttonTechnique;
    @FindBy(xpath = "/html/body/div[4]/a")
    private WebElement buttonLogIn;
    @FindBy(xpath = "/html/body/div[9]/div/div/div/div/div/div")
    private WebElement buttonLogInByVK;
    @FindBy(xpath = "/html/body/div[4]/div[2]/a[1]")
    private WebElement buttonProfile;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MainPage open() {
        driver.navigate().to("https://jut.su/");
        log.info("Main page is opened");
        return this;
    }
    public MangaPage openMangaPage() {
        buttonManga.click();
        log.info("Manga page is opened");
        return new MangaPage(driver);
    }

    public HunterPage searchAnime(String searchText) {
        inputSearch.click();
        inputSearch.sendKeys(searchText + Keys.ENTER);
        log.info("Anime was found");
        return new HunterPage(driver);
    }

    public AnimePage openAnimePage() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        buttonAnime.click();
        log.info("Anime page is opened");
        return new AnimePage(driver);
    }

    public NovellaPage openNovellaPage() {
        buttonNovella.click();
        log.info("Novella page is opened");
        return new NovellaPage(driver);
    }
    public ProfilePage openProfilePage() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        buttonProfile.click();
        log.info("Profile page is opened");
        return new ProfilePage(driver);
    }
    public TechniquePage openTechniquePage() {
        buttonTechnique.click();
        log.info("Technique page is opened");
        return new TechniquePage(driver);
    }

    public VKPage logIn() {
        buttonLogIn.click();
        buttonLogInByVK.click();
        return new VKPage(driver);
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}