package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.InstulearnPageGokhan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_004_StepDefinitions {



        InstulearnPageGokhan instuLearnPageGokhan = new InstulearnPageGokhan();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        @Given("kullanici {string} anasayfasina gider")
        public void kullaniciAnasayfasinaGider(String urlLink) {
            Driver.getDriver().get(ConfigReader.getProperty(urlLink));
        }
        @Then("register yazisina tiklar")
        public void register_yazisina_tiklar() {
            instuLearnPageGokhan.registerElement
                    .click();
            ReusableMethods.bekle(2);
        }
        @When("sol bolumdeki resmi gorur")
        public void solBolumdekiResmiGorur() {
            Assertions.assertTrue(instuLearnPageGokhan.photoElement.isDisplayed());
        }
        @Then("kayit formunu doldurur")
        public void kayitFormunuDoldurur() {
            actions.click(instuLearnPageGokhan.registerEmailBoxElement)
                    .sendKeys(faker.internet().emailAddress())
                    .sendKeys(Keys.TAB)
                    .sendKeys(faker.name().fullName())
                    .sendKeys(Keys.TAB)
                    .sendKeys("Learn.1406")
                    .sendKeys(Keys.TAB)
                    .sendKeys("Learn.1406")
                    .perform();
            actions.click(instuLearnPageGokhan.iAgreeBoxElement)
                    .perform();
        }
        @And("Signup yazisina tiklar")
        public void signupYazisinaTiklar() {
            actions.click(instuLearnPageGokhan.signupElement)
                    .perform();
        }
        @And("kullanici Login adresine gider")
        public void kullaniciLoginAdresineGider() {
            String expectedLoginUrl = "https://qa.instulearn.com/";
            String actualLoginUrl = Driver.driver.getCurrentUrl();
            Assertions.assertEquals(expectedLoginUrl,actualLoginUrl);
        }
        @And("sayfayi kapatir")
        public void sayfayiKapatir() {
            Driver.quitDriver();
        }
    }

