package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.InstulearnPageDemo;
import utilities.ConfigReader;
import utilities.Driver;




public class demo_US10_TC1_stepdefinitions {

    InstulearnPageDemo page = new InstulearnPageDemo();

    @Given("US10 kullanici urle gider")
    public void us10_kullanici_urle_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("become a instructor yazisina tiklar")
    public void become_a_instructor_yazisina_tiklar() {
        Assert.assertTrue(page.becomeInstructor.isDisplayed());
        page.becomeInstructor.click();
    }

    @Then("occupationsi sdet secer")
    public void occupationsi_sdet_secer() {
        Assert.assertTrue(page.sdet.isDisplayed());
        page.sdet.click();
        // buradan sonra sayfayı aşağı kaydırıyoruz
        ((org.openqa.selenium.JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(true);", page.payOutAccount);

    }

    @When("select account type acilir menusune tiklar")
    public void select_account_type_acilir_menusune_tiklar() {
        Assert.assertTrue(page.payOutAccount.isDisplayed());
        page.payOutAccount.click();
    }

    @Then("'Stripe' secer")
    public void stripe_secer() {
        Select select = new Select(page.payOutAccount);
        select.selectByVisibleText("Stripe");
        Assert.assertTrue(page.stripe.isSelected() || select.getFirstSelectedOption().getText().equals("Stripe"));
    }

    @When("account holder'a {string} yazar")
    public void account_holder_a_yazar(String isim) {
        page.accountHolder.clear();
        page.accountHolder.sendKeys(isim);
    }

    @Then("account id'ye {int} yazar")
    public void account_id_ye_yazar(Integer id) {
        page.accountId.clear();
        page.accountId.sendKeys(id.toString());
    }

    @When("extra information'a deneme yazar")
    public void extra_information_a_deneme_yazar() {
        page.extraInfo.clear();
        page.extraInfo.sendKeys("deneme");
    }

    @Then("send request'e tiklar")
    public void send_request_e_tiklar() {
        Assert.assertTrue(page.sendRequest.isEnabled());
        page.sendRequest.click();
    }
}
