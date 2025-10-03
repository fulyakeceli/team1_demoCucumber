package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.InstulearnPageFulya;
import utilities.ConfigReader;
import utilities.Driver;

public class US35_TC1_stepdefinitions {

    InstulearnPageFulya page = new InstulearnPageFulya();

    @Given("US35 kullanici instulearn sayfasina gider")
    public void us35_kullanici_instulearn_sayfasina_gider() throws InterruptedException {
        String url = ConfigReader.getProperty("url");
        Driver.getDriver().get(url);
        Thread.sleep(3000);
    }

    @When("login linkine tiklar")
    public void login_linkine_tiklar() throws InterruptedException {
        page.loginLink.click();
        Thread.sleep(1000);
    }

    @Then("gecerli kullanici adi ve gecerli sifreyi girer")
    public void gecerli_kullanici_adi_ve_sifreyi_girer() throws InterruptedException {
        String student_fulya_user = ConfigReader.getProperty("student_fulya_user"); // configuration.properties'te email tanımlı olmalı
        String password = ConfigReader.getProperty("password"); // configuration.properties'te password tanımlı olmalı

        page.emailArea.sendKeys(student_fulya_user);
        Thread.sleep(1000);
        page.passwordArea.sendKeys(password);
        Thread.sleep(1000);
    }

    @And("log in butonuna basar")
    public void log_in_butonuna_basar() {
        page.loginButton.click();
    }

    @Then("dashboard yazisini goruntuler")
    public void dashboard_yazisini_goruntuler() throws InterruptedException {
        Assert.assertTrue(page.dashBoardYazisi.isDisplayed());
        Thread.sleep(2000);
    }

    @When("store linkine tiklar")
    public void store_linkine_tiklar() throws InterruptedException {
        page.storeLink.click();
        Thread.sleep(1000);
    }

    @Then("'Products' yazisini goruntuler")
    public void products_yazisini_goruntuler() throws InterruptedException {
        Assert.assertTrue(page.productsPage.isDisplayed());
        Thread.sleep(2000);
    }
}
