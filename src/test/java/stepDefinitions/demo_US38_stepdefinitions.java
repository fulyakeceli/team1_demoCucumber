package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.InstulearnPageGokhan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class demo_US38_stepdefinitions {

    InstulearnPageGokhan instuLearnPageGokhan = new InstulearnPageGokhan();
    Actions actions = new Actions(Driver.getDriver());

    @Given("US38 kullanici {string} anasayfasina gider")
    public void us38_kullanici_anasayfasina_gider(String string) {
        String url = ConfigReader.getProperty("url");
        Driver.getDriver().get(url);
    }
    @Then("US38 Login yazisini gorur ve tiklar")
    public void us38_login_yazisini_gorur_ve_tiklar() {
        instuLearnPageGokhan.loginElement
                .click();
    }


    @Then("US38 Email ve Password kutusunu doldurur")
    public void us38_emailVePasswordKutusunuDoldurur() {
        actions.click(instuLearnPageGokhan.emailBoxElement)
                .sendKeys("gokhan.teacher@instulearn.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Learn.1406")
                .perform();
    }

    @And("US38 Login butonunu gorur ve tiklar")
    public void us38_loginButonunuGorurVeTiklar() {
        instuLearnPageGokhan.loginButtonElement
                .click();
    }
    @Then("US38 Dashboard sayfasinin acildigini gorur")
    public void us38_dashboard_sayfasinin_acildigini_gorur() {
        instuLearnPageGokhan.dashboardElement.isDisplayed();

    }

    @Then("US38 Log out butonunu gorur ve tiklar")
    public void us38_log_out_butonunu_gorur_ve_tiklar() {
        instuLearnPageGokhan.instuLearnLogoElement
                .click();
        actions.moveToElement(instuLearnPageGokhan.ogrenciMailLinkElement).perform();
        ReusableMethods.bekle(2);
        instuLearnPageGokhan.logout2Element.click();
    }

    @Then("US38 cikis yapilabildigini gorur")
    public void us38_cikis_yapilabildigini_gorur() {
        String expectedUrl = "https://qa.instulearn.com/";
        String actualUrl = Driver.driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}

