package tests;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class BaseTest {


    WebDriver driver ;

    @BeforeMethod
    public void setUp()throws InterruptedException {
        //Thread.sleep(3000);
        driver=new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.trendyol.com");
    }

}
