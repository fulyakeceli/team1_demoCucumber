package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.InstulearnPageMustafa;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class US17_TC1_stepdefinitions {

    InstulearnPageMustafa page = new InstulearnPageMustafa();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("US17 kullanici instulearn anasayfaya gider")
    public void us17_kullanici_instulearn_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("US17 log in linkine tiklar")
    public void us17_log_in_linkine_tiklar() {
        wait.until(ExpectedConditions.elementToBeClickable(page.loginLink)).click();
    }


    @Then("forget your password linkine tiklar")
    public void forget_your_password_linkine_tiklar() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(page.forgetYourPassword));
        page.forgetYourPassword.click();
    }

    @When("password recovery kismina emailini girer")
    public void password_recovery_kismina_emailini_girer() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page.emailTextbox));

        String student_mustafa_user = ConfigReader.getProperty("student_mustafa_user");
        page.emailTextbox.sendKeys(student_mustafa_user);
    }

    @And("reset password butonuna tiklar")
    public void reset_password_butonuna_tiklar() {
        Assert.assertTrue(page.resetPasswordButton.isDisplayed());
        Assert.assertTrue(page.resetPasswordButton.isEnabled());
        page.resetPasswordButton.click();
    }

    @When("request done successfully alertini goruntuler")
    public void request_done_successfully_alertini_goruntuler() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOf(page.requestDoneSuccesfully));
            // Alert varsa, kapatma butonuna tıkla
            page.alertCloseButton.click();
        } catch (Exception e) {
            // Alert yoksa geç
        }
    }

    @Then("log in sayfasina gecis yapar")
    public void log_in_sayfasina_gecis_yapar() {
        wait.until(driver -> page.ikinciLoginButton.isDisplayed() && page.ikinciLoginButton.isEnabled());
        page.ikinciLoginButton.click();

    }
}
