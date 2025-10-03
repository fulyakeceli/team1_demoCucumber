package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.InstulearnPageFulya;
import utilities.ConfigReader;
import utilities.Driver;

public class demo_US5_stepdefinitions {

    InstulearnPageFulya page = new InstulearnPageFulya();

    @Given("US5 kullanici instulearn sayfasina gider")
    public void us5_kullanici_instulearn_sayfasina_gider() throws InterruptedException {
        String url = ConfigReader.getProperty("url");
        Driver.getDriver().get(url);
        Thread.sleep(3000);
    }

    @When("US5 login linkine tiklar")
    public void us5_login_linkine_tiklar() throws InterruptedException {
        page.loginLink.click();
        Thread.sleep(1000);
    }

    @Then("US5 gecerli kullanici adi ve gecerli sifreyi girer")
    public void us5_gecerli_kullanici_adi_ve_sifreyi_girer() throws InterruptedException {
        String student_fulya_user = ConfigReader.getProperty("student_fulya_user"); // configuration.properties'te email tanımlı olmalı
        String password = ConfigReader.getProperty("password"); // configuration.properties'te password tanımlı olmalı

        page.emailArea.sendKeys(student_fulya_user);
        Thread.sleep(1000);
        page.passwordArea.sendKeys(password);
        Thread.sleep(1000);
    }

    @And("US5 log in butonuna basar")
    public void us5_log_in_butonuna_basar() {
        page.loginButton.click();
    }

}
