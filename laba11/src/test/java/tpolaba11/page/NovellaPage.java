package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NovellaPage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[5]/div/div[1]/div/div/div[5]/a/img")
    private WebElement buttonGaara;
    public NovellaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public GaaraPage openGaaraPage() {
        buttonGaara.click();
        log.info("Gaara page is opened");
        return new GaaraPage(driver);
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
