import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class LaptopSearch {

        WebDriver driver;
        /* Burda exttance basemethod yappınca hata veriyor nedenini anlamadım*/

        public LaptopSearch(WebDriver driver) { this.driver=driver;}

        By secme =By.className("p-card-wrppr");
        List<WebElement> Laptops;
        By control=By.cssSelector("div[class='col-lg-3 col-md-3 col-xs-3 no-padding'] a[id='logo']");

        public void clickLaptop () throws InterruptedException  {
            Thread.sleep(5000);
            Laptops=driver.findElements(secme);
            Laptops.get(2).click();
            Thread.sleep(2000);
            driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
            Thread.sleep(1500);
            // 2. sayfaya sivic olma

        }
    public boolean control(){ return driver.findElement(control).isDisplayed();}
    }


