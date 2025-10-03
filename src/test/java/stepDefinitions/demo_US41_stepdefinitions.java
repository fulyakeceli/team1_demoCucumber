package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.InstulearnPageFulya;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class demo_US41_stepdefinitions {

    InstulearnPageFulya page = new InstulearnPageFulya();


    @Given("US41 kullanici urle gider")
    public void us41_kullanici_urle_gider() {
        driver.get(ConfigReader.getProperty("url"));

    }

    @When("US41 ust menuden kullanici profiline tiklar")
    public void us41_ust_menuden_kullanici_profiline_tiklar() {
        page.kullaniciProifili.click();

    }
    @Then("US41 acilir menuden {string}a tiklar")
    public void us41_acilir_menuden_a_tiklar(String myCoursesText) {
        page.myCourses.click();
    }

    @When("US41 satin alinan kursu goruntuler")
    public void us41_satin_alinan_kursu_goruntuler() {
        Assert.assertTrue("İlk kurs görünmüyor!", page.ilkKurs.isDisplayed());

    }
    @Then("US41 sayfayi kapatir")
    public void us41_sayfayi_kapatir() {
        Driver.closeDriver();
    }

    }

