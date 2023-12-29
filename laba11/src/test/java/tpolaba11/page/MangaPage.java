package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MangaPage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div[2]/div/div[1]/a")
    private WebElement buttonNaruto;
    public MangaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public NarutoPage openNaruto() {
        buttonNaruto.click();
        log.info("Naruto page is opened");
        return new NarutoPage(driver);
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
