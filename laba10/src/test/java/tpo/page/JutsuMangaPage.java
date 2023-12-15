package tpo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JutsuMangaPage {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div[2]/div/div[1]/a")
    private WebElement buttonNaruto;

    public JutsuMangaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String openNaruto() {
        buttonNaruto.click();
        return driver.getCurrentUrl();
    }
}
