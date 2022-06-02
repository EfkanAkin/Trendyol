package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HesabımEnter extends BaseMethod {
    WebDriver driver;
    public HesabımEnter(WebDriver driver) {
        super(driver);
    }
    By email =By.cssSelector("#login-email");
    By password =By.cssSelector("#login-password-input");
    By click =By.cssSelector("div.lr-container div.q-layout.login form:nth-child(1) button.q-primary.q-fluid.q-button-medium.q-button.submit:nth-child(5) > span:nth-child(1)");
    By control=By.cssSelector("div[class='col-lg-3 col-md-3 col-xs-3 no-padding'] a[id='logo']");
    public void Hesab() throws InterruptedException {
        sendkeys(email,"efkanakinn@gmail.com");
        sendkeys(password,"deneme25");
        click(click);

    }
    public boolean control(){ return find(control).isDisplayed();}

}
