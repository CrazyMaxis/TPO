package tpo.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class HelloWebDriver {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jut.su/");
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/ul/li[1]/a"));
        searchButton.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
