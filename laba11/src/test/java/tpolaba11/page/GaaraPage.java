package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GaaraPage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/div/div[1]/h1")
    private WebElement novellaName;
    public GaaraPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public Boolean checkNovellaDetails() {
        log.info("Novella details checked");
        return novellaName.isDisplayed();
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
