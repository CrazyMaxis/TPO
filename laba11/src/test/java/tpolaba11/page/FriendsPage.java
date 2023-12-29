package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FriendsPage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/table/tbody/tr[2]/td[3]/a[1]")
    private WebElement buttonMsg;

    public FriendsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MsgPage openMsg() {
        buttonMsg.click();
        log.info("Msg page was opened");
        return new MsgPage(driver);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}