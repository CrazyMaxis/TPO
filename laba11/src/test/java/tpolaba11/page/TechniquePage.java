package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechniquePage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/div[1]/div[1]/div[2]/ul/li")
    private WebElement buttonHarem;
    public TechniquePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public HaremPage openHarem() {
        buttonHarem.click();
        log.info("Harem page is opened");
        return new HaremPage(driver);
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
