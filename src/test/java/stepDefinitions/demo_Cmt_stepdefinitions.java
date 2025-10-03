package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.InstulearnPageGokhan;
import pages.demoPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class demo_Cmt_stepdefinitions {
    InstulearnPageGokhan instuLearnPageGokhan = new InstulearnPageGokhan();
    Actions actions = new Actions(Driver.getDriver());
    demoPages pages = new demoPages();

    @Given("D kullanici anasayfaya gider")
    public void d_kullanici_anasayfaya_gider() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(2500);
    }


    @Then("D Login yazisini gorur ve tiklar")
    public void d_login_yazisini_gorur_ve_tiklar() {
        instuLearnPageGokhan.loginElement
                .click();
    }

    @When("D basarili kullanici adi ve sifre ile login olur")
    public void d_basarili_kullanici_adi_ve_sifre_ile_login_olur() throws InterruptedException {
        pages.anasayfaLoginButton.click();
        Thread.sleep(3000);

        pages.email.sendKeys("dundar.teacher@instulearn.com");
        Thread.sleep(2000);

        pages.password.sendKeys("Learn.1406");
        ReusableMethods.bekle(2);

        pages.loginLoginButton.click();
    }

    demoPages demoPages = new demoPages();
    @When("D sidebar da Courses e tiklar")
    public void d_sidebar_da_courses_e_tiklar() {
        demoPages.coursesDashboard.click();
    }

    @Then("D New e tiklar")
    public void d_new_e_tiklar() {
        demoPages.coursesNewDashboard.click();
    }

    @Then("D Information sayfasinda gerekli alanlari doldurur")
    public void d_informationSayfasindaGerekliAlanlariDoldurur() throws InterruptedException {
        Thread.sleep(1000);
        demoPages.titleYaziAlani.sendKeys("Cyber Security");
        Thread.sleep(7000);
    }

    @And("D thumbnail Image icin yukleme modalini acar")
    public void d_thumbnailImageIcinYuklemeModaliniAcar() throws InterruptedException {
        demoPages.thumbnailIcon.click();
        Thread.sleep(100);
        demoPages.thumbnailIcon.click();
        Thread.sleep(3000);
    }

    @And("D kullanici modal pencereden thumb.jpg secip tiklar")
    public void d_kullanici_modal_pencereden_thumbJpgSecipTiklar() throws InterruptedException {
        ReusableMethods.titleIleWindowGecisi(Driver.getDriver(), "File Manager");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(demoPages.thumbJpg));
        demoPages.thumbJpg.click();
        //demoPages.thumbNailChose.click();
        Thread.sleep(1000);
    }

    @Then("D confirm e tiklar")
    public void d_confirmETiklar() {
        demoPages.confirmButton.click();
    }

    @And("D cover Image icin yukleme modalini acar")
    public void d_coverImageIcinYuklemeModaliniAcar() throws InterruptedException {
        demoPages.coverImageIcon.click();
        Thread.sleep(100);
        demoPages.coverImageIcon.click();
        Thread.sleep(3000);
    }

    @And("D kullanici modal pencereden cover.jpg secip tiklar")
    public void d_kullaniciModalPenceredenCoverJpgSecipTiklar() throws InterruptedException {
        ReusableMethods.titleIleWindowGecisi(Driver.getDriver(), "New course | InstuLearn");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(demoPages.coverJpg));
        demoPages.coverJpg.click();
        Thread.sleep(2000);
        demoPages.confirmButton.click();
        Thread.sleep(2000);
        //demoPages.coverImageIcon.click();
        //Thread.sleep(100);
        //demoPages.coverImageIcon.click();
        //Thread.sleep(7000);
    }
    /*
    demoPages.coverImageIcon.click();
    Thread.sleep(2000);
    demoPages.coverChose.click();
    Thread.sleep(1000);
    demoPages.confirmButton.click();
    Thread.sleep(1000);*/

    @Then("D geri kalan stepleri yapar")
    public void d_geriKalanStepleriYapar() throws InterruptedException {
        demoPages.descriptionYaziAlani.sendKeys("Cyber Security is so important for your future");
        Thread.sleep(1000);
        demoPages.nextButton.click();
        Thread.sleep(5000);
        demoPages.capacity.sendKeys("10");
        demoPages.startDate.click();
        demoPages.fiveOctoberChose.click();
        demoPages.applyButton.click();
        demoPages.durationYaziAlani.sendKeys("900");
        demoPages.tagsYaziAlani.sendKeys("Cyber,Security,Future");
        demoPages.category.click();
        Thread.sleep(2000);
        demoPages.cyberChose.click();
        demoPages.priceYaziAlani.sendKeys("25");
        demoPages.nextButton.click();
        Thread.sleep(2000);
        demoPages.nextButton.click();
        Thread.sleep(2000);
        demoPages.nextButton.click();
        Thread.sleep(2000);
        demoPages.nextButton.click();
    }

    @Then("D Publish butonuna tiklar")
    public void d_publish_butonuna_tiklar() {
        demoPages.publishButton.click();
    }
    @Then("D My courses sayfasinda yeni kursun gorunup gorunmedigini test eder")
    public void d_my_courses_sayfasinda_yeni_kursun_gorunup_gorunmedigini_test_eder() throws InterruptedException {
        Thread.sleep(2000);
        demoPages.newCourseDisplay.isDisplayed();
    }
    @Then("D Anasayfaya gider")
    public void d_anasayfaya_gider() throws InterruptedException {
        demoPages.homePage.click();
        Thread.sleep(1000);
    }
    @Then("D Logout olur")
    public void d_logout_olur() {
        demoPages.userName.click();
        demoPages.logOut.click();
    }


}


