package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import pages.InstulearnPageFulya;
import utilities.ConfigReader;
import utilities.Driver;

public class US35_TC6_stepdefinitions {

    InstulearnPageFulya instulearnPage = new InstulearnPageFulya();

    @Given("kullanici buy now butonuna kadar sayfayi kaydirir")
    public void buy_now_butonuna_kadar_sayfayi_kaydirir() throws InterruptedException {
        ((JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(false);", instulearnPage.byNowButton);


        Thread.sleep(2000);
    }

    @When("buy now butonuna basar")
    public void buy_now_butonuna_basar() throws InterruptedException {
        instulearnPage.byNowButton.click();
        Thread.sleep(1000);
    }

    @Then("sayfayi kaydirip checkout butonuna basar")
    public void sayfayi_kaydirip_checkout_butonuna_basar() throws InterruptedException {
        ((JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(false);", instulearnPage.checkoutButonu);
        instulearnPage.checkoutButonu.click();
        Thread.sleep(1000);
    }

    @When("odeme yontemi olarak stripe secer")
    public void odeme_yontemi_olarak_stripe_secer() throws InterruptedException {
        instulearnPage.stripeButton.click();
        Thread.sleep(1000);
    }

    @Then("start payment butonuna basar")
    public void start_payment_butonuna_basar() throws InterruptedException {
        instulearnPage.startPaymentButton.click();
        Thread.sleep(1000);
    }

    @When("odeme bilgilerini girer")
    public void odeme_bilgilerini_girer() throws InterruptedException {
        instulearnPage.emailOdeme.sendKeys(ConfigReader.getProperty("testCardEmail"));
        Thread.sleep(1000);
        instulearnPage.kartNo.sendKeys(ConfigReader.getProperty("testCardNumara"));
        Thread.sleep(1000);
        instulearnPage.kartTarih.sendKeys(ConfigReader.getProperty("testCardDate"));
        Thread.sleep(1000);
        instulearnPage.kartCvc.sendKeys(ConfigReader.getProperty("testCardCvc"));
        Thread.sleep(1000);
        instulearnPage.kartName.sendKeys(ConfigReader.getProperty("testCardName"));
    }

    @Then("ode butonuna basar")
    public void ode_butonuna_basar() throws InterruptedException {
        instulearnPage.odeButonu.click();
        Thread.sleep(1000);
    }
}
