package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class MsgPage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/form/div/div[3]/table/tbody/tr[2]/td[2]/input")
    private WebElement inputHeader;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/form/div/div[3]/table/tbody/tr[3]/td[2]/div[1]/textarea")
    private WebElement inputBody;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/form/div/div[3]/div/button")
    private WebElement buttonSend;

    public MsgPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public Boolean sendMsg() {
        inputHeader.click();
        inputHeader.sendKeys("HihiHaha");
        inputBody.click();
        inputBody.sendKeys("Бубджидубжизус");
        buttonSend.click();
        log.info("Msg was sent");
        return true;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}