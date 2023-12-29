package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HaremPage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/div[2]/ul/li[1]/a/img")
    private WebElement howToDoImg;
    public HaremPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public Boolean checkHaremDetails() {
        log.info("Harem details checked");
        return howToDoImg.isDisplayed();
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
