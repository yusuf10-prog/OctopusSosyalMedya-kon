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
    @Given("Linkedln ikonuna tiklanir.")
    public void linkedln_ikonuna_tiklanir() {
        ReusableMethods.bekle(10);

        // JavascriptExecutor nesnesini oluştur
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // Sayfayı aşağıya kaydır
        js.executeScript("window.scrollBy(0, 10000);");

        octopusPage.LinkedInIokun.click();
    }
    @Then("sayfa kapatilir.")
    public void sayfa_kapatilir() {

        Driver.quitDriver();
    }

}
