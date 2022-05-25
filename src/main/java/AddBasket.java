import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddBasket extends  BaseMethod {

    WebDriver driver;

    public AddBasket(WebDriver driver){super(driver);}

    By sepeteekle =By.cssSelector("div[class='add-to-basket-button-text']");
    By control=By.cssSelector("div[class='basket-item-count-container visible']");

    public void Sepeteekleme() throws InterruptedException{
        Thread.sleep(8000);
        click(sepeteekle);
        Thread.sleep(3000);
    }
    public boolean control(){ return find(control).isDisplayed();}

}
