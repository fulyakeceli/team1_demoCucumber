package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.InstulearnPageMerve;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class demo_US40_stepdefinitions {


    @Given("Sitenin anasayfasina gidilir")
    public void Sitenin_anasayfasina_gidilir(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("Student olarak giris yapilir ve Dashboard Sayfasina Gidilir")
    public void Student_olarak_giris_yapar(){
        InstulearnPageMerve InstulearnPageMerve = new InstulearnPageMerve();
        Actions actions = new Actions(Driver.getDriver());
        InstulearnPageMerve.loginButonu.click();
        actions.click(InstulearnPageMerve.loginMailKutusu)
                .sendKeys("merve.student@instulearn.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Learn.1406").perform();
        InstulearnPageMerve.loginPageLoginButonu.click();
        ReusableMethods.bekle(1);

    }
    @And("Sidebarda Courses baglantisi gorunur ve aktif olmali")
    public void Sidebarda_Courses_baglantisi_gorunur_ve_aktif_ve_tiklanabilir_olmali() throws InterruptedException {
        InstulearnPageMerve InstulearnPageMerve= new InstulearnPageMerve();
        Assertions.assertTrue(InstulearnPageMerve.DashboardCoursesButonu.isDisplayed());
        Assertions.assertTrue(InstulearnPageMerve.DashboardCoursesButonu.isEnabled());
        ReusableMethods.bekle(1);
    }
    @Then("Sidebarda Purchased Courses baglantisi gorunur olmali")
    public void Sidebarda_Purchased_Courses_baglantisi_gorunur_olmali(){
        InstulearnPageMerve InstulearnPageMerve= new InstulearnPageMerve();
        InstulearnPageMerve.DashboardCoursesButonu.click();
        ReusableMethods.bekle(1);
        Assertions.assertTrue(InstulearnPageMerve.PurchasedCourses.isDisplayed());
        Assertions.assertTrue(InstulearnPageMerve.PurchasedCourses.isEnabled());
        ReusableMethods.bekle(1);
    }
    @Then("Purchased Courses baglantisi tiklanabilir olmali")
    public void Purchased_Courses_baglantisi_tiklanabilir_olmali() throws InterruptedException {
        InstulearnPageMerve InstulearnPageMerve= new InstulearnPageMerve();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(InstulearnPageMerve.PurchasedCourses));
        InstulearnPageMerve.PurchasedCourses.click();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);
    }
}
