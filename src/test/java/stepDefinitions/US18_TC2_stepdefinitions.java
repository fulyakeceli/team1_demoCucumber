package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.InstulearnPageFulya;
import utilities.Driver;

public class US18_TC2_stepdefinitions {

    InstulearnPageFulya page = new InstulearnPageFulya();

    @Given("user anasayfaya gider")
    public void user_anasayfaya_gider() {
        Driver.getDriver().get("https://qa.instulearn.com/");
    }

    @And("footer bolumunde telefonu goruntuler")
    public void footer_bolumunde_telefonu_goruntuler() {
        // FooterTelefon elementine scroll
        ((JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(true);", page.footerTelefon);

        Assert.assertTrue("Footer telefon gorunmuyor!", page.footerTelefon.isDisplayed());
        System.out.println("Footer Telefon: " + page.footerTelefon.getText());
    }

    @Then("footer bolumunde maili goruntuler")
    public void footer_bolumunde_maili_goruntuler() {
        // FooterMail elementine scroll
        ((JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(true);", page.footerMail);

        Assert.assertTrue("Footer mail gorunmuyor!", page.footerMail.isDisplayed());
        System.out.println("Footer Mail: " + page.footerMail.getText());
    }
}