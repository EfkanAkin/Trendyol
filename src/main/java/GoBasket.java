import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoBasket extends BaseMethod {
    WebDriver driver;

    public GoBasket(WebDriver driver){
        super(driver);
    }

    By sepetetıkla =By.cssSelector("i[class='i-bagg-orange hover-icon']");
    By control=By.cssSelector("i[class='i-plus-bold']");
    public  void sepetegit() throws InterruptedException{
        Thread.sleep(4000);
        click(sepetetıkla);

    }
    public boolean control(){ return find(control).isDisplayed();}
}
