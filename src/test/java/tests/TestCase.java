package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.testng.annotations.Test;
import pages.*;

public class TestCase extends BaseTest {

    //Test testng seç yoksa uyuşmazlık olabilir
    @Test
    public void Test() throws InterruptedException {
        PageEnter pageEnter = new PageEnter(driver);
        pageEnter.enter();
        Assertions.assertTrue(pageEnter.control(), "Sayfada Değil");

        HesabımEnter hesabımEnter = new HesabımEnter(driver);
        hesabımEnter.Hesab();
        Assertions.assertTrue(hesabımEnter.control(), "Sayfada Değil");

        Search search = new Search(driver);
        search.SearchLaptop();
        Assertions.assertTrue(search.control(), "Sayfada Değil");

        LaptopSearch laptopSearch = new LaptopSearch(driver);
        laptopSearch.clickLaptop();
        Assertions.assertTrue(laptopSearch.control(), "Sayfada Değil");

        AddBasket addBasket = new AddBasket(driver);
        addBasket.Sepeteekleme();
        Assertions.assertTrue(addBasket.control(), "Sayfada Değil");

        GoBasket goBasket = new GoBasket(driver);
        goBasket.sepetegit();
        Assertions.assertTrue(goBasket.control(), "Sayfada Değil");

        Deleteitem deleteitem = new Deleteitem(driver);
        deleteitem.silme();
        Assertions.assertTrue(deleteitem.control(), "Sayfada Değil");

    }


}
