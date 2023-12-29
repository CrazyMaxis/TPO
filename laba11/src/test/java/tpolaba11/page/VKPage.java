package tpolaba11.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class VKPage extends BasePage {
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/div/form/div[1]/section/div/div/div/input")
    private WebElement inputPhoneNumber;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/div[1]/div/div/div/form/div[1]/div[3]/div/div/input")
    private WebElement inputPassword;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/div/div/div/div/form/div[2]/button")
    private WebElement buttonContinue;
    public VKPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public MainPage logIn() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        inputPhoneNumber.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        inputPhoneNumber.sendKeys("+375299661446" + Keys.ENTER);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        inputPassword.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        inputPassword.sendKeys("$_1Naruto1_$" + Keys.ENTER);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        buttonContinue.click();
        log.info("Log in is successed");
        return new MainPage(driver);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}