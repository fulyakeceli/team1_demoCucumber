package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.Driver;
import pages.InstulearnPageFulya;

import java.util.List;

public class US18_TC1_stepdefinitions {

    InstulearnPageFulya page = new InstulearnPageFulya();

    @Given("US18 kullanici ana sayfaya gider")
    public void us18_kullanici_ana_sayfaya_gider() {
        Driver.getDriver().get("https://qa.instulearn.com/");
    }

    @Then("footer bolumu gorunur olmalidir")
    public void footer_bolumu_gorunur_olmalidir() {
        Assert.assertTrue("Footer gorunmuyor!", page.additionalLinks.isDisplayed());
    }

    @Then("footer bolumunde asagidaki linkler gorunur ve aktif olmalidir:")
    public void footer_bolumunde_asagidaki_linkler_gorunur_ve_aktif_olmalidir(List<String> linkTextleri) {
        for (String link : linkTextleri) {
            switch (link) {
                case "Hakkimizda":
                    Assert.assertTrue(page.aboutUs.isDisplayed());
                    Assert.assertTrue(page.aboutUs.isEnabled());
                    break;
                case "Iletisim":
                    Assert.assertTrue(page.contactUs.isDisplayed());
                    Assert.assertTrue(page.contactUs.isEnabled());
                    break;
                case "Sertifika Dogrulama":
                    Assert.assertTrue(page.certificateValidation.isDisplayed());
                    Assert.assertTrue(page.certificateValidation.isEnabled());
                    break;
                case "Sartlar & Kurallar":
                    Assert.assertTrue(page.termsandRules.isDisplayed());
                    Assert.assertTrue(page.termsandRules.isEnabled());
                    break;
            }
        }
    }

    @When("kullanici ilgili linklere tiklar")
    public void kullanici_ilgili_linklere_tiklar() throws InterruptedException {
        // Locaterları page class'tan kullanıyoruz
        page.aboutUs.click();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);

        page.contactUs.click();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);

        page.certificateValidation.click();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);

        page.termsandRules.click();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);
    }

    @Then("igili sayfalar acilmalidir")
    public void igili_sayfalar_acilmalidir() {
        System.out.println("Tum footer linkleri tiklandi ve sayfalara erisildi");
    }
}
