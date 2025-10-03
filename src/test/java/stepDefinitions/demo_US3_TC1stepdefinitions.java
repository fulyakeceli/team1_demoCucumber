package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.InstulearnPageFulya;
import utilities.ConfigReader;
import utilities.Driver;


public class demo_US3_TC1stepdefinitions {
     // classlevela yapistirip kullandim



    @Given("Kullanici Instulearn anasayfaya gider")
    public void kullanici_ınstulearn_anasayfaya_gider() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigReader.getProperty("url"));



    }
    @Then("Kullanici {string} basligini goruntuler")
    public void kullanici_basligini_goruntuler(String string) {

        InstulearnPageFulya instulearnPageFulya = new InstulearnPageFulya();
        String actualBaslik = instulearnPageFulya.bodyBasligi.getText();
        String expectedBaslik = "Transform Your Future with InstuLearn...";
        Assert.assertEquals(expectedBaslik, actualBaslik);
    }


}

