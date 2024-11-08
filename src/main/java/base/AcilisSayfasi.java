package base;

import org.openqa.selenium.WebDriver;

public class AcilisSayfasi extends Sayfa{

    public final String girisYap = "//a[@class=\"btnSignIn\"]";

    public AcilisSayfasi(WebDriver driver) {
        super(driver);
    }
}
