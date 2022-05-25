import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestCase extends BaseTest {



    @Test
    @Order(1)
    public void Test() throws InterruptedException {
        PageEnter pageEnter=new PageEnter(driver);
        pageEnter.enter();
        Assertions.assertTrue(pageEnter.control(),"Sayfada Değil");
    }

    @Test
    @Order(2)
    public void Test2() throws InterruptedException {
       HesabımEnter hesabımEnter=new HesabımEnter(driver);
       hesabımEnter.Hesab();
       Assertions.assertTrue(hesabımEnter.control(),"Sayfada Değil");
    }

    @Test
    @Order(3)
    public void  Test3()  throws InterruptedException{
        Search search=new Search(driver);
        search.SearchLaptop();
        Assertions.assertTrue(search.control(),"Sayfada Değil");
    }

    @Test
    @Order(4)
    public void Test4()  throws InterruptedException{
        LaptopSearch laptopSearch=new LaptopSearch(driver);
        laptopSearch.clickLaptop();
        Assertions.assertTrue(laptopSearch.control(),"Sayfada Değil");
    }

    @Test
    @Order(5)
    public void Test5()  throws InterruptedException{
        AddBasket addBasket=new AddBasket(driver);
        addBasket.Sepeteekleme();
        Assertions.assertTrue(addBasket.control(),"Sayfada Değil");

    }

    @Test
    @Order(6)
    public void Test6() throws InterruptedException{
        GoBasket goBasket=new GoBasket(driver);
        goBasket.sepetegit();
        Assertions.assertTrue(goBasket.control(),"Sayfada Değil");
    }

    @Test
    @Order(7)
    public void Test7() throws InterruptedException{
        Deleteitem deleteitem=new Deleteitem(driver);
        deleteitem.silme();
        Assertions.assertTrue(deleteitem.control(),"Sayfada Değil");
    }



}
