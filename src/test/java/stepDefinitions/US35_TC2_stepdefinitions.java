package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.InstulearnPageFulya;

public class US35_TC2_stepdefinitions {

    InstulearnPageFulya page = new InstulearnPageFulya();

    @Given("kullanici search box'a tiklar")
    public void kullanici_search_box_a_tiklar() {
        Assert.assertTrue(page.productSearchBox.isDisplayed());
        Assert.assertTrue(page.productSearchBox.isEnabled());
        page.productSearchBox.click();
    }

    @When("kullanici search box'a {string} yazar")
    public void kullanici_search_box_a_yazar(String productName) {
        page.productSearchBox.sendKeys(productName);
    }

    @Then("search butonuna tiklar")
    public void search_butonuna_tiklar() {
        Assert.assertTrue(page.productSearchButton.isDisplayed());
        Assert.assertTrue(page.productSearchButton.isEnabled());
        page.productSearchButton.click();
    }
}
