package tpo.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JutsuChapterPage {
    private WebDriver driver;

    @FindBy(xpath = "  /html/body/div[5]/div[1]/div/div[1]/div[3]/a")
    private WebElement buttonNextPage;

    public JutsuChapterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String SwitchToNextPage(){
        buttonNextPage.sendKeys(Keys.ARROW_RIGHT);
        return driver.getCurrentUrl();
    }
}
