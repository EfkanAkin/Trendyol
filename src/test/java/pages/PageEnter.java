package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageEnter extends BaseMethod {

    WebDriver driver;

    public PageEnter(WebDriver driver){ super(driver);}


    By ccs=By.cssSelector("div.wrapper div.header div.col-lg-3.col-md-3.col-xs-3.no-padding:nth-child(3) div:nth-child(2) div.account-navigation-wrapper div.account-nav-item.user-login-container:nth-child(1) div.link.account-user > p.link-text");
    By reklam =By.cssSelector("svg[width='13px']");
    By control =By.cssSelector("div[class='forgot-password']");

    public void enter()throws InterruptedException {
        Thread.sleep(10000);
        //WebDriverWait wait=new WebDriverWait(driver,10);
        //wait.until(ExpectedConditions.presenceOfElementLocated(reklam));
        click(reklam);
        //wait.until(ExpectedConditions.presenceOfElementLocated(ccs));
        click(ccs);
    }
    public boolean control(){ return find(control).isDisplayed();}

}

