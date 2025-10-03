package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import utilities.ConfigReader;
import utilities.Driver;
import pages.InstulearnPageFulya;

public class US18_TC5_stepdefinitions {

    InstulearnPageFulya page = new InstulearnPageFulya();

    @Given("TC5 kullanici anasayfaya gider")
    public void tc5_kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("TC5 footer bolumune iner")
    public void tc5_footer_bolumune_iner() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", page.telifYazisi);
    }

    @Then("telif yazisini goruntuler")
    public void telif_yazisini_goruntuler() {
        Assert.assertTrue(page.telifYazisi.isDisplayed());
    }
}
