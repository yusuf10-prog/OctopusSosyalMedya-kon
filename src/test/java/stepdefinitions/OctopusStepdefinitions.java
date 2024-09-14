package stepdefinitions;

import Pages.OctopusPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class OctopusStepdefinitions {

    OctopusPage octopusPage=new OctopusPage();
    @Given("Siteye {string} adresi ile giris yapilir.")
    public void siteye_adresi_ile_giris_yapilir(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Given("LinkedIn ikonuna tiklanir.")
    public void LinkedIn_ikonuna_tiklanir() {
        ReusableMethods.bekle(10);

        // JavascriptExecutor nesnesini oluştur
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // Sayfayı aşağıya kaydır
        js.executeScript("window.scrollBy(0, 10000);");

        octopusPage.LinkedIn.click();
    }
    @Given("X ikonuna tiklanir.")
    public void X_ikonuna_tiklanir() {
        ReusableMethods.bekle(10);

        // JavascriptExecutor nesnesini oluştur
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // Sayfayı aşağıya kaydır
        js.executeScript("window.scrollBy(0, 10000);");

        octopusPage.X.click();
    }
    @Given("Instagram ikonuna tiklanir.")
    public void Instagram_ikonuna_tiklanir() {
        ReusableMethods.bekle(10);

        // JavascriptExecutor nesnesini oluştur
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // Sayfayı aşağıya kaydır
        js.executeScript("window.scrollBy(0, 10000);");

        octopusPage.Instagram.click();
    }

    @Given("Facebook ikonuna tiklanir.")
    public void Facebook_ikonuna_tiklanir() {
        ReusableMethods.bekle(10);

        // JavascriptExecutor nesnesini oluştur
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // Sayfayı aşağıya kaydır
        js.executeScript("window.scrollBy(0, 10000);");

        octopusPage.Facebook.click();
    }

    @Given("YouTube ikonuna tiklanir.")
    public void Youtube_ikonuna_tiklanir() {
        ReusableMethods.bekle(10);

        // JavascriptExecutor nesnesini oluştur
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // Sayfayı aşağıya kaydır
        js.executeScript("window.scrollBy(0, 10000);");

        octopusPage.YouTube.click();
    }
    @Then("sayfa kapatilir.")
    public void sayfa_kapatilir() {
        //Driver.quitDriver();

    }

}
