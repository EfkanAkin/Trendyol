import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search extends BaseMethod {
    WebDriver driver;
    public Search(WebDriver driver) {
        super(driver);
    }
    By tıklama = By.tagName("input");
    By yazma =By.cssSelector("input[class='search-box']");
    By searc =By.cssSelector("div.wrapper div.header div.col-lg-6.col-md-6.col-xs-6.no-padding:nth-child(2) div:nth-child(1) div:nth-child(3) div.autocomplete div.search-box-container > i.search-icon");
    String Iteam="Laptop";
    By control=By.cssSelector("div.search-app-container div.srch-rslt-cntnt div.srch-aggrgtn-cntnr div.aggrgtn-cntnr-wrppr div.fltrs-wrppr.hide-fltrs.ctgry:nth-child(1) div.fltrs.ctgry a.fltr-item-wrppr > div.fltr-item-text.chckd.ctgry");

    public void  SearchLaptop() throws InterruptedException{
        Thread.sleep(2000);
        click(tıklama);
        sendkeys(yazma,Iteam);
        Thread.sleep(2000);
        click(searc);
        Thread.sleep(3000);
    }
    public boolean control(){ return find(control).isDisplayed();}
}
