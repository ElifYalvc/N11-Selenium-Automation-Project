import base.AcilisSayfasi;
import base.GirisYapSayfasi;
import base.Sayfa;
import base.SearchProducts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class n11Tests {
    private WebDriver driver;
    private AcilisSayfasi acilisSayfasi;
    private GirisYapSayfasi girisYapSayfasi;
    private SearchProducts searchProducts;
    private Sayfa sayfa;

@BeforeMethod
    void setup(){
    WebDriver driver = new ChromeDriver();
    this.driver = driver;
    driver.manage().window().maximize();
    driver.get("https://www.n11.com");

    acilisSayfasi = new AcilisSayfasi(driver);
    girisYapSayfasi = new GirisYapSayfasi(driver);
    searchProducts = new SearchProducts(driver);
    sayfa = new Sayfa(driver);


}

@Test(description = "Yanlış mail ile giriş")
        void hatalıgiris(){

        acilisSayfasi.elementGörüneneKadarBekleXp(acilisSayfasi.girisYap);
        acilisSayfasi.xtusaBas(acilisSayfasi.girisYap);

        girisYapSayfasi.elementGörüneneKadarBekleXp(girisYapSayfasi.email);
        girisYapSayfasi.mailYaz(girisYapSayfasi.email, "deneme@gmail.com");

        girisYapSayfasi.elementGörüneneKadarBekleXp(girisYapSayfasi.sifre);
        girisYapSayfasi.sifreYaz(girisYapSayfasi.sifre, "deneme123");

        girisYapSayfasi.xtusaBas(girisYapSayfasi.girisYapTusu);


      }
    @AfterMethod

    void tearDown(){
        driver.close();
    }}


