package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.InstulearnPageNagihan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class demo_US33_stepdefinitions {

    InstulearnPageNagihan instulearnPageNagihan = new InstulearnPageNagihan();
    Actions actions = new Actions(Driver.getDriver());

    @Given("US33 kullanici instulearn ana syfasina gider")
    public void us33_kullanici_instulearn_ana_syfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("US33 login butona tiklar")
    public void us33_login_butona_tiklar() {

        instulearnPageNagihan.loginanasayfa.click();

    }

    @Then("US33 sayfada email kutusuna mail ve password yazar ve login tiklar")
    public void us33_sayfada_email_kutusuna_mail_ve_password_yazar_ve_login_tiklar() {

        actions.click(instulearnPageNagihan.email)
                .sendKeys("nagihan.teacher@instulearn.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Learn.1406").perform();
        instulearnPageNagihan.loginbuton.click();
        ReusableMethods.bekle(3);

    }

    @Then("US33 Courses basligina tiklar")
    public void us33_courses_basligina_tiklar() {

        instulearnPageNagihan.courses.click();
        ReusableMethods.bekle(3);

    }

    @Then("US33 Filtrele bölümünden sekme secerek filtreleme yapar")
    public void us33_filtrele_bölümünden_sekme_secerek_filtreleme_yapar() {

        ((org.openqa.selenium.JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(false);"
                        , instulearnPageNagihan.filterbox);
        instulearnPageNagihan.filterbox.click();
        ReusableMethods.bekle(3);

    }

    @Then("US33 Filter items e tiklar")
    public void us33_filter_items_e_tiklar() {
        ((org.openqa.selenium.JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(false);"
                        , instulearnPageNagihan.filteritems);
        instulearnPageNagihan.filteritems.click();
        ReusableMethods.bekle(3);

    }

    @Then("US33 java icerikli bir kurs secilir")
    public void us33_java_icerikli_bir_kurs_secilir() {
        ((org.openqa.selenium.JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(false);"
                        , instulearnPageNagihan.secilenkurs);
        instulearnPageNagihan.secilenkurs.click();
        ReusableMethods.bekle(3);

    }

    @Then("US33 buy now a tıklanır")
    public void us33_buy_now_a_tıklanır() {
        ((org.openqa.selenium.JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(false);"
                        , instulearnPageNagihan.buynow);
        instulearnPageNagihan.buynow.click();
        ReusableMethods.bekle(3);

    }

    @Then("US33 pay with sprite tıklanır")
    public void us33_pay_with_sprite_tıklanır() {
        ((org.openqa.selenium.JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(false);"
                        , instulearnPageNagihan.paywithstripe);
        instulearnPageNagihan.paywithstripe.click();
        ReusableMethods.bekle(3);

    }

    @Then("US33 start payment butonuna tıklanır")
    public void us33_start_payment_butonuna_tıklanır() {
        Actions actions = new Actions(Driver.getDriver());
        InstulearnPageNagihan instulearnPageNagihan = new InstulearnPageNagihan();
        instulearnPageNagihan.startpayment.click();
        ReusableMethods.bekle(3);

    }

    @Then("US33 email kutusuna mail yazılıt")
    public void us33_email_kutusuna_mail_yazılıt() {
        instulearnPageNagihan.kartodememail.sendKeys("pisehi9288@dotxan.com" + Keys.ENTER);
        ReusableMethods.bekle(1);

    }

    @Then("US33 card information bilgileri girilir")
    public void us33_card_information_bilgileri_girilir() {
        instulearnPageNagihan.kartno.sendKeys(ConfigReader.getProperty("testCardNumara"));
        ReusableMethods.bekle(1);

    }

    @Then("US33 gun ve yil girilir")
    public void us33_gun_ve_yil_girilir() {
        actions.click(instulearnPageNagihan.karttarih)
                .sendKeys("0228")
                .sendKeys(Keys.TAB)
                .sendKeys("568").perform();
        ReusableMethods.bekle(1);

    }

    @Then("US33 Cardholder name girilir")
    public void us33_cardholder_name_girilir() {
        instulearnPageNagihan.kartname.sendKeys("Richart Cole" + Keys.ENTER);

    }

    @Then("US33 pay butonuna basılır")
    public void us33_pay_butonuna_basılır() {

            ((org.openqa.selenium.JavascriptExecutor) Driver.getDriver())
                    .executeScript("arguments[0].scrollIntoView(false);"
                            , instulearnPageNagihan.paybuton);
            instulearnPageNagihan.paybuton.click();
            ReusableMethods.bekle(1);

        }
    }

