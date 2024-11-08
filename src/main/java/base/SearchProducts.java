package base;

import org.openqa.selenium.WebDriver;

public class SearchProducts extends Sayfa {
    public SearchProducts(WebDriver driver) {
        super(driver);
    }

    public final String idürünArama = "searchData";
    public final String xara= "//span[@class='iconsSearch']";
    public final String xsarıelbise ="//img[@src='https://n11scdn.akamaized.net/a1/226_339/15/81/28/96/IMG-3301179833513786052.jpg']";
    public final String xbeden ="//label[.='38']";
    public final String clsepeteEkle = "addBasketUnify";



}
