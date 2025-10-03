package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.InstulearnPageFulya;
import utilities.ConfigReader;
import utilities.Driver;

public class demo_US3_TC2_stepdefinitions {

    InstulearnPageFulya instulearnPageFulya = new InstulearnPageFulya();

    @Given("TC2 Kullanici anasayfaya gider")
    public void tc2_kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }


    @Then("TC2 arama kutusu gorunur ve aktif olmali")
    public void tc2_arama_kutusu_gorunur_ve_aktif_olmali() {
        Assertions.assertTrue(instulearnPageFulya.bodyAramaKutusu.isDisplayed());
        Assertions.assertTrue(instulearnPageFulya.bodyAramaKutusu.isEnabled());
    }

    @Then("TC2 search butonu gorunur ve aktif olmali")
    public void tc2_search_butonu_gorunur_ve_aktif_olmali() {
        Assertions.assertTrue(instulearnPageFulya.bodySearchButonu.isDisplayed());
        Assertions.assertTrue(instulearnPageFulya.bodySearchButonu.isEnabled());
    }

    @When("TC2 kullanici arama kutusuna tiklar")
    public void tc2_kullanici_arama_kutusuna_tiklar() {
        instulearnPageFulya.bodyAramaKutusu.click();
    }

    @When("TC2 arama kutusuna {string} yazar")
    public void tc2_arama_kutusuna_yazar(String arananKelime) {
        instulearnPageFulya.bodyAramaKutusu.sendKeys(arananKelime);
    }

    @When("TC2 kullanici search butonuna tiklar")
    public void tc2_kullanici_search_butonuna_tiklar() {
        instulearnPageFulya.bodySearchButonu.click();
    }

    @Then("TC2 {string} sonuc mesajini goruntuler")
    public void tc2_sonuc_mesajini_goruntuler(String mesaj) {
        String actual = instulearnPageFulya.resultMessage.getText().replaceAll("\\s+", " ").trim();
        String expected = "1 Results found for \"Java\"";
        Assertions.assertEquals(expected, actual);
    }


    }

