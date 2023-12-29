package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ChapterPage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[6]/ul/li[1]/a")
    private WebElement buttonHome;
    public ChapterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public MainPage openHome() {
        buttonHome.click();
        log.info("Home page is opened");
        return new MainPage(driver);
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
