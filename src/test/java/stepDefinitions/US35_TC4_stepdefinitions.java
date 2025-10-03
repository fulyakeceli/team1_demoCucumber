package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.InstulearnPageFulya;
import utilities.Driver;

public class US35_TC4_stepdefinitions {

    InstulearnPageFulya page = new InstulearnPageFulya();

    @Given("kullanici tekrar store linkine tiklar")
    public void kullanici_tekrar_store_linkine_tiklar() throws InterruptedException {
        page.storeLink.click();
        Thread.sleep(1000);
    }

    @When("free shipping butonuna basar")
    public void free_shipping_butonuna_basar() throws InterruptedException {
        page.freeShippingFilterButton.click();
        Thread.sleep(1000);
    }

    @And("urunu gormek icin sayfayi asagi kaydirir")
    public void urunu_gormek_icin_sayfayi_asagi_kaydirir() {
        ((org.openqa.selenium.JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(false);", page.product);
    }

    @Then("urunun adini, fiyatini, saticisini ve description bilgilerini goruntuler")
    public void urunun_adini_fiyatini_saticisini_ve_description_bilgilerini_goruntuler() throws InterruptedException {
        // Product name
        Assert.assertTrue(page.productName.isDisplayed());
        System.out.println("Product Name: " + page.productName.getText());
        Thread.sleep(2000);

        // Product price
        Assert.assertTrue(page.productPrice.isDisplayed());
        System.out.println("Product Price: " + page.productPrice.getText());
        Thread.sleep(2000);

        // Seller name
        Assert.assertTrue(page.sellerName.isDisplayed());
        System.out.println("Seller Name: " + page.sellerName.getText());
        Thread.sleep(2000);

        // Product description
        Assert.assertTrue(page.productDescription.isDisplayed());
        System.out.println("Product Description: " + page.productDescription.getText());
        Thread.sleep(2000);
    }
}

