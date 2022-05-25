import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {

    //Bunu yapmadım Base Test  teste kulanılımıyor
    WebDriver driver ;

    @BeforeAll
    public void setUp()throws InterruptedException {
        Thread.sleep(3000);
        driver=new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.trendyol.com");
    }

}
