package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class JujutsuPage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/div[2]/div[3]/div/a[8]/b")
    private WebElement isOngoing;
    public JujutsuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public boolean checkAnimeDetails() {
        log.info("Anime details checked");
        return  isOngoing.isDisplayed() &&
                isOngoing.getText().equals("онгоинг");
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}