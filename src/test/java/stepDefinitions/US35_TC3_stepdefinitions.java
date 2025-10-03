package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.InstulearnPageFulya;
import utilities.Driver;

public class US35_TC3_stepdefinitions {

    InstulearnPageFulya instulearnPage = new InstulearnPageFulya();

    @Given("sayfayi asagi kaydirir")
    public void sayfayi_asagi_kaydirir() throws InterruptedException {
        // Sayfayı filtre butonlarının bulunduğu yere kaydırıyoruz
        ((JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(false);", instulearnPage.freeFilterButton);
        Thread.sleep(1000);
    }

    @When("TC3 free shipping butonuna basar")
    public void tc3_free_shipping_butonuna_basar() throws InterruptedException {
        instulearnPage.freeShippingFilterButton.click();
        Thread.sleep(2000);
    }

    @Then("'1 Product' yazisini goruntuler")
    public void product_yazisini_goruntuler() throws InterruptedException {
        Assert.assertTrue(instulearnPage.oneProductFoundText.isDisplayed());

        Thread.sleep(2000);
    }

    @When("free butonuna basar")
    public void free_butonuna_basar() throws InterruptedException {
        instulearnPage.freeFilterButton.click();
        Thread.sleep(1000);
    }

    @Then("'0 Products' yazisini goruntuler")
    public void products_yazisini_goruntuler() throws InterruptedException {
        Assert.assertTrue(instulearnPage.zeroProductsFoundText.isDisplayed());
        Thread.sleep(2000);
    }

    @When("discount butonuna basar")
    public void discount_butonuna_basar() throws InterruptedException {
        instulearnPage.discountFilterButton.click();
        Thread.sleep(1000);
    }

    @Then("tekrar '0 Products' yazisini goruntuler")
    public void tekrar_products_yazisini_goruntuler() {
        Assert.assertTrue(instulearnPage.zeroProductsFoundText.isDisplayed());

    }


}
