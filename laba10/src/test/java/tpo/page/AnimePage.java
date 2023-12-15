package tpo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnimePage {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/div[2]/div/p/span")
    private WebElement animeDescription;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/div[2]/div/div/b")
    private WebElement animeName;
    public AnimePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean checkAnimeInfo(String searchedAnimeName) {
        return  animeName.isDisplayed() &&
                animeName.getText().equals(searchedAnimeName) &&
                animeDescription.isDisplayed();
    }
}
