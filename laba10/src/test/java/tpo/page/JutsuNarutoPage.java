package tpo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JutsuNarutoPage {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/div[2]/div[2]/a[1]")
    private WebElement buttonChapter;

    public JutsuNarutoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String openChapter() {
        buttonChapter.click();
        return driver.getCurrentUrl();
    }
}
