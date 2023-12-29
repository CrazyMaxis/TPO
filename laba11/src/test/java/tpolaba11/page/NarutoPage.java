package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class NarutoPage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/div[2]/div[2]/a[1]")
    private WebElement buttonChapter;
    public NarutoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public ChapterPage openChapter() {
        buttonChapter.click();
        log.info("Chapter page is opened");
        return new ChapterPage(driver);
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
