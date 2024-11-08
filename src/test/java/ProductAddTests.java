import base.AcilisSayfasi;
import base.GirisYapSayfasi;
import base.SearchProducts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ProductAddTests {
    private WebDriver driver;
    private AcilisSayfasi acilisSayfasi;
    private GirisYapSayfasi girisYapSayfasi;

    private SearchProducts searchProducts;

    @BeforeMethod
    void setup(){
        WebDriver driver = new ChromeDriver();
        this.driver = driver;
        driver.manage().window().maximize();
        driver.get("https://www.n11.com");

        acilisSayfasi = new AcilisSayfasi(driver);
        girisYapSayfasi = new GirisYapSayfasi(driver);
        searchProducts = new SearchProducts(driver);


    }

    @Test(description = "Sepete ürün Ekleme")
    void ürünEkleme(){
        searchProducts.elementGörüneneKadarBekleId(searchProducts.idürünArama);
        searchProducts.idtusaBas(searchProducts.idürünArama);

        searchProducts.ürünAdıYaz(searchProducts.idürünArama, "sarı elbise");
        searchProducts.xtusaBas(searchProducts.xara);

        searchProducts.elementGörüneneKadarBekleXp(searchProducts.xsarıelbise);
        searchProducts.xtusaBas(searchProducts.xsarıelbise);


        searchProducts.xtusaBas(searchProducts.xbeden);
        searchProducts.cltusaBas(searchProducts.clsepeteEkle);






    }
    @AfterMethod

    void tearDown(){
        driver.close();
    }}


