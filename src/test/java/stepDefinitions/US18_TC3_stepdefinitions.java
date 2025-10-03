package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.InstulearnPageFulya;
import utilities.Driver;

import java.time.Duration;

public class US18_TC3_stepdefinitions {

    InstulearnPageFulya page = new InstulearnPageFulya();

    @Given("TC3 kullanici anasayfaya gider")
    public void tc3_kullanici_anasayfaya_gider() {
        Driver.getDriver().get("https://qa.instulearn.com/");
    }

    @And("footer bulten bolumune iner")
    public void footer_bulten_bolumune_iner() {
        ((JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(true);", page.bultenMailAramaCubugu);
    }

    @When("email adresini girer")
    public void email_adresini_girer() {
        page.bultenMailAramaCubugu.sendKeys("testemail@example.com");
    }

    @And("join butonuna basar")
    public void join_butonuna_basar() {
        page.bultenJoinButonu.click();
    }

  /*  @Then("abone olunduguna dair alerti goruntuler")
    public void abone_olunduguna_dair_alerti_goruntuler() {

        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = Driver.getDriver().switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert Mesaji: " + alertText);

            // Doğrulama
            Assert.assertTrue("Alert beklenen mesajı içermiyor!", alertText.contains("Abone olundu"));

            // Alert kapatma
            alert.accept();  // Tamam’a basar
            // alert.dismiss(); // Vazgeç’e basar
        } catch (NoAlertPresentException e) {
            Assert.fail("Alert goruntulenmedi!");
        }
    }

   */
}