package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BaseMethod {

    WebDriver driver;

    public BaseMethod(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By Locator) {
        return driver.findElement(Locator);
    }

    public List<WebElement> findAll(By locator) {
        return driver.findElements(locator);
    }

    public void click(By locator) {
        find(locator).click();
        //bunlarda return olmaz
    }

    public void sendkeys(By locator, String text) {
        find(locator).sendKeys(text);
    }

    public Boolean isDisplayed(By locator) {
        return find(locator).isDisplayed();
        //displayın dönüm dönmediğini kontrol edecez
    }


}
