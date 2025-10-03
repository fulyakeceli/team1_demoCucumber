package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.demoPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.time.Duration;
public class demo_StepDefinition {

    demoPages pages = new demoPages();

    @Given("instructor, anasayfaya gider")
    public void instructor_anasayfaya_gider() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(2500);

    }
    @When("basarili kullanici adi ve sifre ile login olur")
    public void basarili_kullanici_adi_ve_sifre_ile_login_olur() throws InterruptedException {
        pages.anasayfaLoginButton.click();
        Thread.sleep(3000);

        pages.email.sendKeys("dundar.teacher@instulearn.com");
        Thread.sleep(2000);

        pages.password.sendKeys("Learn.1406");
        ReusableMethods.bekle(2);

        pages.loginLoginButton.click();
    }



    demoPages demoPages = new demoPages();
    @When("sidebar da Courses e tiklar")
    public void sidebar_da_courses_e_tiklar() {
        demoPages.coursesDashboard.click();
    }
    @Then("New e tiklar")
    public void new_e_tiklar() {
        demoPages.coursesNewDashboard.click();
    }
    @Then("Information sayfasinda gerekli alanlari doldurur")
    public void informationSayfasindaGerekliAlanlariDoldurur() throws InterruptedException {
        Thread.sleep(1000);
        demoPages.titleYaziAlani.sendKeys("Cyber Security");
        Thread.sleep(7000);
    }
    @And("thumbnail Image icin yukleme modalini acar")
    public void thumbnailImageIcinYuklemeModaliniAcar() throws InterruptedException {
        demoPages.thumbnailIcon.click();
        Thread.sleep(100);
        demoPages.thumbnailIcon.click();
        Thread.sleep(3000);
    }
    @And("kullanici modal pencereden thumb.jpg secip tiklar")
    public void kullanici_modal_pencereden_thumbJpgSecipTiklar() throws InterruptedException {
        ReusableMethods.titleIleWindowGecisi(Driver.getDriver(), "File Manager");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(demoPages.thumbJpg));
        demoPages.thumbJpg.click();
        //demoPages.thumbNailChose.click();
        Thread.sleep(1000);
    }
    @Then("confirm e tiklar")
    public void confirmETiklar() {
        demoPages.confirmButton.click();
    }
    @And("cover Image icin yukleme modalini acar")
    public void coverImageIcinYuklemeModaliniAcar() throws InterruptedException {
        demoPages.coverImageIcon.click();
        Thread.sleep(100);
        demoPages.coverImageIcon.click();
        Thread.sleep(3000);
    }
    @And("kullanici modal pencereden cover.jpg secip tiklar")
    public void kullaniciModalPenceredenCoverJpgSecipTiklar() throws InterruptedException {
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
    @Then("geri kalan stepleri yapar")
    public void geriKalanStepleriYapar() throws InterruptedException {
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
    @Then("Publish butonuna tiklar")
    public void publish_butonuna_tiklar() {
        demoPages.publishButton.click();
    }
    @Then("My courses sayfasinda yeni kursun gorunup gorunmedigini test eder")
    public void my_courses_sayfasinda_yeni_kursun_gorunup_gorunmedigini_test_eder() throws InterruptedException {
        Thread.sleep(2000);
        demoPages.newCourseDisplay.isDisplayed();
    }
    @Then("Anasayfaya gider")
    public void anasayfaya_gider() throws InterruptedException {
        demoPages.homePage.click();
        Thread.sleep(1000);
    }
    @Then("Logout olur")
    public void logout_olur() {
        demoPages.userName.click();
        demoPages.logOut.click();
    }
}