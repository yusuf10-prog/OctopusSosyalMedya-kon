bupackage stepdefinitions;

import Pages.OctopusPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Set;

public class OctopusStepdefinitions {
    OctopusPage octopusPage=new OctopusPage();
    @Given("Siteye {string} adresi ile giris yapilir.")
    public void siteye_adresi_ile_giris_yapilir(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Given("LinkedIn ikonuna tiklanir.")
    public void linked_ın_ikonuna_tiklanir() {
        ReusableMethods.bekle(5);

        octopusPage.LinkedIn.click();
        String ilkSayfaWhd= Driver.getDriver().getWindowHandle();
        System.out.println(ilkSayfaWhd);

        String ikinciSayfaWhd="";
        Set<String> whdSeti=Driver.getDriver().getWindowHandles();

        for (String each: whdSeti
        ) {
            if (!each.equals(ilkSayfaWhd)){
                ikinciSayfaWhd=each;
            }
        }
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().window(ikinciSayfaWhd);
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().window(ilkSayfaWhd);

        ReusableMethods.bekle(5);

        // JavascriptExecutor nesnesini oluştur
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // Sayfayı aşağıya kaydır
        js.executeScript("window.scrollBy(0, 10000);");
    }
    @Given("X ikonuna tiklanir.")
    public void X_ikonuna_tiklanir() {
        ReusableMethods.bekle(5);

        octopusPage.X.click();
        String ilkSayfaWhd= Driver.getDriver().getWindowHandle();
        System.out.println(ilkSayfaWhd);

        String ikinciSayfaWhd="";
        Set<String> whdSeti=Driver.getDriver().getWindowHandles();

        for (String each: whdSeti
        ) {
            if (!each.equals(ilkSayfaWhd)){
                ikinciSayfaWhd=each;
            }
        }
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().window(ikinciSayfaWhd);
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().window(ilkSayfaWhd);

        ReusableMethods.bekle(5);

        // JavascriptExecutor nesnesini oluştur
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // Sayfayı aşağıya kaydır
        js.executeScript("window.scrollBy(0, 10000);");
    }
    @Given("Instagram ikonuna tiklanir.")
    public void Instagram_ikonuna_tiklanir() {
        octopusPage.Instagram.click();

        String ilkSayfaWhd= Driver.getDriver().getWindowHandle();
        System.out.println(ilkSayfaWhd);

        String ikinciSayfaWhd="";
        Set<String> whdSeti=Driver.getDriver().getWindowHandles();

        for (String each: whdSeti
        ) {
            if (!each.equals(ilkSayfaWhd)){
                ikinciSayfaWhd=each;
            }
        }
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().window(ikinciSayfaWhd);
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().window(ilkSayfaWhd);

        ReusableMethods.bekle(5);

        // JavascriptExecutor nesnesini oluştur
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // Sayfayı aşağıya kaydır
        js.executeScript("window.scrollBy(0, 10000);");
    }
    @Given("Facebook ikonuna tiklanir.")
    public void Facebook_ikonuna_tiklanir() {
        ReusableMethods.bekle(5);

        octopusPage.Facebook.click();
        String ilkSayfaWhd= Driver.getDriver().getWindowHandle();
        System.out.println(ilkSayfaWhd);

        String ikinciSayfaWhd="";
        Set<String> whdSeti=Driver.getDriver().getWindowHandles();

        for (String each: whdSeti
        ) {
            if (!each.equals(ilkSayfaWhd)){
                ikinciSayfaWhd=each;
            }
        }
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().window(ikinciSayfaWhd);
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().window(ilkSayfaWhd);

        ReusableMethods.bekle(5);

        // JavascriptExecutor nesnesini oluştur
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // Sayfayı aşağıya kaydır
        js.executeScript("window.scrollBy(0, 10000);");

    }
    @Given("YouTube ikonuna tiklanir.")
    public void Youtube_ikonuna_tiklanir() {

        // JavascriptExecutor nesnesini oluştur.
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // Sayfayı aşağıya kaydır.
        js.executeScript("window.scrollBy(0, 10000);");
        octopusPage.YouTube.click();

        String ilkSayfaWhd= Driver.getDriver().getWindowHandle();
        System.out.println(ilkSayfaWhd);

        String ikinciSayfaWhd="";
        Set<String> whdSeti=Driver.getDriver().getWindowHandles();

        for (String each: whdSeti
        ) {
            if (!each.equals(ilkSayfaWhd)){
                ikinciSayfaWhd=each;
            }
        }
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().window(ikinciSayfaWhd);
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().window(ilkSayfaWhd);
    }
    @Then("sayfa kapatilir.")
    public void sayfa_kapatilir() {
        Driver.quitDriver();

    }
}
