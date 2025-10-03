package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.InstulearnPageFulya;
import utilities.ConfigReader;
import utilities.Driver;

public class US18_TC4_stepdefinitions {

    InstulearnPageFulya instulearnPage = new InstulearnPageFulya();

    @Given("TC4 kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        String url = ConfigReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @And("TC4 footer bolumune iner")
    public void footer_bolumune_iner() {
        // Scroll
        ((org.openqa.selenium.JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(true);", instulearnPage.instagramIcon);
    }

    @Then("sosyal medya ikonlari twitter, whatsapp, instagram, facebook gorunur ve aktif olmalidir")
    public void sosyal_medya_ikonlari_gorunur_ve_aktif_olmalidir() {
        // Twitter
        Assert.assertTrue(instulearnPage.twitterIcon.isDisplayed());
        Assert.assertTrue(instulearnPage.twitterLink.isEnabled());

        // Whatsapp
        Assert.assertTrue(instulearnPage.whatsappIcon.isDisplayed());
        Assert.assertTrue(instulearnPage.whatsappLink.isEnabled());

        // Instagram
        Assert.assertTrue(instulearnPage.instagramIcon.isDisplayed());
        Assert.assertTrue(instulearnPage.instagramLink.isEnabled());

        // Facebook
        Assert.assertTrue(instulearnPage.facebookIcon.isDisplayed());
        Assert.assertTrue(instulearnPage.facebookLink.isEnabled());
    }


}

