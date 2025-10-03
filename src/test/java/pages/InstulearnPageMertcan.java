package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstulearnPageMertcan {


    public InstulearnPageMertcan(){
        PageFactory.initElements(Driver.getDriver(), this);}

        @FindBy(xpath = "//h2[text()='Subscribe Now!']")
        public WebElement subscribeNowYaziElementi;

        @FindBy (xpath = "//h3[contains(text(),'Bronze')]/following::a[contains(text(),'Purchase')][1]")
        public WebElement bronzePurchaseButton;

        @FindBy (xpath = "//h3[contains(text(),'Gold')]/following::a[contains(text(),'Purchase')][1]")
        public WebElement goldPurchaseButton;

        @FindBy (xpath = "//h3[contains(text(),'Silver')]/following::a[contains(text(),'Purchase')][1]")
        public WebElement silverPurchaseButton;

        @FindBy (xpath = "(//button[@type='submit'])[2]")
        public WebElement mloginButton;

        @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/div[2]/div[2]/a[1]")
        public WebElement anasayfaLoginButton;

        @FindBy (xpath = "//*[@id=\"email\"]")
        public WebElement email;

        @FindBy (xpath = "//*[@id=\"password\"]")
        public WebElement password;

        @FindBy (xpath = "//*[@id=\"app\"]/div[3]/div/div[2]/div/form/button")
        public WebElement loginLoginButton;

        @FindBy (xpath = "//*[@id=\"panel-sidebar-scroll\"]/div[1]/div[2]/div/div/div/li[7]/a/span[2]")
        public WebElement financial;

        @FindBy (xpath = "//*[@id=\"financialCollapse\"]/ul/li[1]/a")
        public WebElement salesReport;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[1]/h2")
        public WebElement salesStatisticsYaziElementi;

        @FindBy (xpath = "//*[@id=\"financialCollapse\"]/ul/li[2]/a")
        public WebElement financialSummary;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section/h2")
        public WebElement financialDocumentsYaziElementi;

        @FindBy (xpath = "//*[@id=\"financialCollapse\"]/ul/li[3]/a")
        public WebElement payout;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section/h2")
        public WebElement payoutYaziElementi;

        @FindBy (xpath = "//*[@id=\"financialCollapse\"]/ul/li[4]/a")
        public WebElement chargeAccount;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section/h2")
        public WebElement chargeAccountYaziElementi;

        @FindBy (xpath = "//*[@id=\"financialCollapse\"]/ul/li[5]/a")
        public WebElement subscribe;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section/h2")
        public WebElement subscribeYaziElementiYaziElementi;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[2]/div/form/div[3]/button")
        public WebElement showResultsButton;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[3]/div[2]/div/div/div/table/tbody/tr")
        public WebElement salesHistoryYaziElementiYaziElementi;

        @FindBy (xpath = "(//*[@id=\"dateInputGroupPrepend\"])[1]")
        public WebElement fromIconElementi;

        @FindBy (xpath = "(//*[@id=\"dateInputGroupPrepend\"])[2]")
        public WebElement toIconElementi;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section/div[1]/a")
        public WebElement settingsButton;

        @FindBy (xpath = "//*[@id='saveData']")
        public WebElement saveButton;

        @FindBy (xpath = "/html/body/div[3]/div")
        public WebElement saveYaziElementi;

        @FindBy (xpath = "/html/body/div[3]/div/span[2]")
        public WebElement saveYaziElementiClose;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/div[2]/div[2]/a")
        public WebElement deleteButton;

        @FindBy (xpath = "//*[@id=\"swlDelete\"]")
        public WebElement yesIConfirmButton;

        @FindBy (xpath = "//*[@id=\"swal2-title\"]")
        public WebElement deleteYaziElementi;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[2]/form/div[1]/div/label/img")
        public WebElement stripeButton;

        @FindBy (xpath = "//*[@name='amount']")
        public WebElement amountYaziAlani;

        @FindBy (xpath = "//*[@id='submitChargeAccountForm']")
        public WebElement payButton;

        @FindBy (xpath = "//*[@autocomplete='email']")
        public WebElement odemeEmailYaziAlani;

        @FindBy (xpath = "//*[@autocomplete='cc-number']")
        public WebElement krediKartiNoYaziAlani;

        @FindBy (xpath = "//*[@autocomplete='cc-exp']")
        public WebElement ayYilYaziAlani;

        @FindBy (xpath = "//*[@autocomplete='cc-csc']")
        public WebElement ccvYaziAlani;

        @FindBy (xpath = "//*[@autocomplete='cc-name']")
        public WebElement isimSoyisimYaziAlani;

        @FindBy (xpath = "//*[@class='SubmitButton-IconContainer']")
        public WebElement odemeButton;

        @FindBy (xpath = "//*[@id=\"app\"]/div[3]/div[2]/h2")
        public WebElement congrYaziElementi;

        @FindBy(xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[2]/div/div[1]/div/form/div/button")
        public WebElement bronzePurchaseYaziElementi;

        @FindBy (xpath = "//*[@id=\"app\"]/section[2]/form/div[1]/div[1]/label")
        public WebElement stripe2Button;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[1]/div/div/div[1]")
        public WebElement myActivePlanElementi;

        @FindBy (xpath = "//*[@id='paymentSubmit']")
        public WebElement startPayment;

        @FindBy (xpath = "//*[@id=\"panel-sidebar-scroll\"]/div[1]/div[2]/div/div/div/li[4]/a/span[2]")
        public WebElement quizzes;

        @FindBy (xpath = "//*[@id=\"quizzesCollapse\"]/ul/li[1]/a")
        public WebElement myResults;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[1]")
        public WebElement resultStatistics;

        @FindBy (xpath = "//*[@id=\"quizzesCollapse\"]/ul/li[2]/a")
        public WebElement notParticipated;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[2]/div[1]/h2")
        public WebElement openQuizzesYaziElementi;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[2]/div/form/div[3]/button")
        public WebElement showResultsButton2;

        @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/section[3]/div[2]/div/div/div/table/tbody/tr[1]/td[7]/div/button")
        public WebElement myQuizzesUcNokta;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[3]/div[2]/div/div/div/table/tbody/tr[1]/td[7]/div/div/a[1]\n")
        public WebElement viewAnswers;

        @FindBy (xpath = "//*[@id=\"app\"]/div[3]/section[1]/div")
        public WebElement gerekliIslemler;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[1]/div/form/div[3]/button")
        public WebElement showResultsButton3;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[2]/div[2]/div/div/div/table/tbody/tr[1]/td[5]/div/button")
        public WebElement notParticipatedUcNokta;

        @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[2]/div[2]/div/div/div/table/tbody/tr[1]/td[5]/div/div/a[1]")
        public WebElement startLink;

        @FindBy (xpath = "//*[@class='font-weight-bold font-16 text-dark-blue']")
        public WebElement entranceQuiz;
    }

