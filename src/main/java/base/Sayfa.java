package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Random;

public class Sayfa {
    WebDriver driver;

    public Sayfa(WebDriver driver){
        this.driver =driver;
    }

    public void elementGörüneneKadarBekleXp(String elementxpaht){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementxpaht)));
    }

    public void elementGörüneneKadarBekleId(String elementId){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));}


    public void xtusaBas (String tusxpath){
        driver.findElement(By.xpath(tusxpath)).click();

    }
    public void cltusaBas (String tusclass){
        driver.findElement(By.className(tusclass)).click();

    }
    public void idtusaBas (String tusId){
        driver.findElement(By.id(tusId)).click();
    }

    public void mailYaz(String elementxpath, String emailAdresi){
        driver.findElement(By.xpath(elementxpath)).sendKeys(emailAdresi);
    }

    public void sifreYaz(String elementxpath, String sifre){
        driver.findElement(By.xpath(elementxpath)).sendKeys(sifre);
    }
    public void ürünAdıYaz(String elementId, String ürün ){
        driver.findElement(By.id("searchData")).sendKeys(ürün);


    }

}

