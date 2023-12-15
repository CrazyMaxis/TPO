package tpo.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JutsuHomePage {
    private static final String HOMEPAGE_URL = "https://jut.su/";
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[1]/ul/li[6]/a")
    private WebElement buttonManga;
    @FindBy(xpath = "/html/body/div[4]/div[3]/form/input[2]")
    private WebElement inputSearch;
    public JutsuHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String openManga() {
        buttonManga.click();
        return driver.getCurrentUrl();
    }
    public JutsuHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }
    public String SearchAnime(String animeName) {
        inputSearch.click();
        inputSearch.sendKeys(animeName + Keys.ENTER);
        return driver.getCurrentUrl();
    }
}
