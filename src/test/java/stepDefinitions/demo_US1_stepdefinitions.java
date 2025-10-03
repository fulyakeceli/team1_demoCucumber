package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class demo_US1_stepdefinitions {

    @Given("kullanici instulearn anasayfasina gider")
    public void kullanici_instulearn_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("url basliginin {string} oldugu test edilir")
    public void url_basliginin_oldugu_test_edilir(String string) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("nagihanTitle");
    }
}
