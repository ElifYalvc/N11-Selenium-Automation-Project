package base;

import org.openqa.selenium.WebDriver;

public class GirisYapSayfasi extends Sayfa{

    public final String email = "//input[@id=\"email\"]";
    public final String sifre = "//input[@id=\"password\"]";
    public final String girisYapTusu = "//div[@id=\"loginButton\"]";


    public GirisYapSayfasi(WebDriver driver) {
        super(driver);
    }
}
