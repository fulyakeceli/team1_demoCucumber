package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.InstulearnPageGokhan;
import utilities.Driver;
import utilities.ReusableMethods;

public class demo_US19_stepdefinitions {




        InstulearnPageGokhan instuLearnPageGokhan = new InstulearnPageGokhan();
        Actions actions = new Actions(Driver.getDriver());

        @Then("Login yazisini gorur ve tiklar")
        public void login_yazisini_gorur_ve_tiklar() {
            instuLearnPageGokhan.loginElement
                    .click();
        }

        @Then("Email ve Password kutusunu doldurur")
        public void emailVePasswordKutusunuDoldurur() {
            actions.click(instuLearnPageGokhan.emailBoxElement)
                    .sendKeys("gokhan.teacher@instulearn.com")
                    .sendKeys(Keys.TAB)
                    .sendKeys("Learn.1406")
                    .perform();
        }

        @And("Login butonunu gorur ve tiklar")
        public void loginButonunuGorurVeTiklar() {
            instuLearnPageGokhan.loginButtonElement
                    .click();
        }

        @When("cevrimdisi butonu gorunur ve aktifleştirilir")
        public void cevrimdisiButonuGorunurVeAktifleştirilir() {
            actions.doubleClick(instuLearnPageGokhan.aktifPasifButtonElement)
                    .perform();
            ReusableMethods.bekle(2);
        }

        @Then("cevrimdisi butonu pasif duruma getirilir")
        public void cevrimdisiButonuPasifDurumaGetirilir() {
            actions.click(instuLearnPageGokhan.aktifPasifButtonElement)
                    .perform();
            ReusableMethods.bekle(2);
        }

        @When("sidebardaki sekmeler gorunur")
        public void sidebardakiSekmelerGorunur() {
            instuLearnPageGokhan.dashboardElement.isDisplayed();
            instuLearnPageGokhan.coursesElement.isDisplayed();
            instuLearnPageGokhan.courseBundlesElement.isDisplayed();
            instuLearnPageGokhan.meetingsElement.isDisplayed();
            instuLearnPageGokhan.quizzesElement.isDisplayed();
            instuLearnPageGokhan.certificatesElement.isDisplayed();
            instuLearnPageGokhan.viewAllEventsElement.isDisplayed();
        }

        @Then("sayfanin body bolumundeki bolumler gorunur")
        public void sayfaninBodyBolumundekiBolumlerGorunur() {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.bekle(2);
            instuLearnPageGokhan.accountBalanceElement.isDisplayed();
            instuLearnPageGokhan.pendingMeetingsElement.isDisplayed();
            instuLearnPageGokhan.supportMessagesElement.isDisplayed();
            instuLearnPageGokhan.monthlySalesElement.isDisplayed();
            instuLearnPageGokhan.commentsElement.isDisplayed();
            instuLearnPageGokhan.newYearElement.isDisplayed();
            instuLearnPageGokhan.newYearMoreInfoElement.isDisplayed();
            instuLearnPageGokhan.monthlySalesGraph.isDisplayed();
            ReusableMethods.bekle(2);
        }

        @And("sidebar alt kisimdaki sekmeler gorunur")
        public void sidebarAltKisimdakiSekmelerGorunur() {
            ((JavascriptExecutor) Driver.getDriver())
                    .executeScript("arguments[0].scrollIntoView(false);", instuLearnPageGokhan.logoutElement);

            instuLearnPageGokhan.logoutElement.isDisplayed();
            instuLearnPageGokhan.myProfileElement.isDisplayed();
            instuLearnPageGokhan.settingsElement.isDisplayed();
            instuLearnPageGokhan.notificationsElement.isDisplayed();
            instuLearnPageGokhan.noticeboardElement.isDisplayed();
            instuLearnPageGokhan.articlesElement.isDisplayed();
            instuLearnPageGokhan.marketingElement.isDisplayed();
            instuLearnPageGokhan.supportElement.isDisplayed();
            instuLearnPageGokhan.financialElement.isDisplayed();
        }
    }

