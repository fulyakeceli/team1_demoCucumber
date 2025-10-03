package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.InstulearnPageFulya;
import utilities.ConfigReader;
import utilities.Driver;

public class US18_TC6_stepdefinitions {

    InstulearnPageFulya page = new InstulearnPageFulya();

    @Given("TC6 kullanici anasayfaya gider")
    public void tc6_kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("TC6 footer bolumune iner")
    public void tc6_footer_bolumune_iner() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", page.footerLogo);
    }

    @When("instulearn logosuna tiklar")
    public void instulearn_logosuna_tiklar() {
        page.footerLogo.click();
    }

    @Then("anasayfanin basina doner")
    public void anasayfanin_basina_doner() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Long scrollY = (Long) js.executeScript("return window.pageYOffset;"); // sayfanın scroll değerini al
        Assert.assertTrue("Sayfa en üste dönmedi!", scrollY == 0);
    }
}