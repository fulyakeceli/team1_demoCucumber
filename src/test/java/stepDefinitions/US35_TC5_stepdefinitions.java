package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.InstulearnPageFulya;
import utilities.Driver;

public class US35_TC5_stepdefinitions {

    InstulearnPageFulya page = new InstulearnPageFulya();

    @Given("kullanici urun adina tiklar")
    public void kullanici_urun_adina_tiklar() {
        page.productName.click();
    }

    @When("urun sayfasina yonlendirilir")
    public void urun_sayfasina_yonlendirilir() {
        // Opsiyonel: URL veya başlık kontrolü ile yönlendirme doğrulaması yapılabilir
        String expectedUrlFragment = "product"; // URL'de ürün sayfası kısmı varsa
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedUrlFragment));
    }

    @Then("add to card, buy now butonlarinin gorunurlugunu ve aktifligini kontrol eder")
    public void butonlarin_gorunurlugunu_ve_aktifligini_kontrol_eder() {
        // Add to Cart
        Assert.assertTrue(page.addToCardButton.isDisplayed());
        Assert.assertTrue(page.addToCardButton.isEnabled());

        // Buy Now
        Assert.assertTrue(page.byNowButton.isDisplayed());
        Assert.assertTrue(page.byNowButton.isEnabled());
    }

    @And("urun puanlamasini goruntuler")
    public void urun_puanlamasini_goruntuler() {
        Assert.assertTrue(page.productReview.isDisplayed());
        System.out.println("Product Review: " + page.productReview.getText());
    }

    @Then("sayfayi asagi kaydirir ve yorum yapar")
    public void sayfayi_asagi_kaydirir_ve_yorum_yapar() throws InterruptedException {
        // Scroll to comment area
        ((org.openqa.selenium.JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(true);", page.commentArea);

        // Add a comment
        page.commentArea.sendKeys("Harika bir kurs!");
        page.postCommentButton.click();
        Thread.sleep(3000);
    }
}

