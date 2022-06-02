package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Deleteitem {

    WebDriver driver;

    public Deleteitem(WebDriver driver){this.driver=driver;}

    By silme=By.cssSelector("i[class='i-trash']");
    By silmeOnay=By.cssSelector("button[class='ty-font-w-semi-bold ty-button ty-bordered ty-transition ty-input-medium ty-notr']");
    List<WebElement> silmeList;

    By control=By.cssSelector("div[class='pb-empty-basket']");

    public void silme() throws InterruptedException{
        Thread.sleep(4000);
        driver.findElement(silme).click();
        silmeList=driver.findElements(silmeOnay);
        silmeList.get(1).click();
        Thread.sleep(3000);
    }
    public boolean control(){ return driver.findElement(control).isDisplayed();}

}
