package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstulearnPageFulya {

    public InstulearnPageFulya(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//h1[@class='text-secondary font-weight-bold']")
    public WebElement bodyBasligi;


    @FindBy (xpath = "(//input[@type='text'])[2]")
    public WebElement bodyAramaKutusu;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement bodySearchButonu;

    @FindBy (xpath = "//h1[@class='text-white font-30 white-space-pre-wrap']")
    public WebElement resultMessage;

    @FindBy (xpath = "//footer[@class='footer position-relative user-select-none']")
    public WebElement footerSection;

    @FindBy (xpath = "(//div[@class='mt-20'])[2]")
    public WebElement additionalLinks;

    //a[@href='https://qa.instulearn.com/pages/about']

    @FindBy (xpath = "//a[@href='https://qa.instulearn.com/pages/about']")
    public WebElement aboutUs;

    @FindBy (xpath = "//a[@href='/contact']")
    public WebElement contactUs;

    @FindBy (xpath = "(//a[@href='/certificate_validation'])[2]")
    public WebElement certificateValidation;

    @FindBy (xpath = "(//font[@color='#ffffff'])[6]")
    public WebElement termsandRules;

    @FindBy (xpath = "(//div[@class='d-flex align-items-center text-white font-14'])[1]")
    public WebElement footerTelefon;

    @FindBy (xpath = "(//div[@class='d-flex align-items-center text-white font-14'])[2]")
    public WebElement footerMail;

    @FindBy (xpath = "//input[@name='newsletter_email']")
    public WebElement bultenMailAramaCubugu;

    @FindBy (xpath = "(//button[@class='btn btn-primary rounded-pill'])[2]")
    public WebElement bultenJoinButonu;

    @FindBy (xpath = "//h2[text()='Request done successfully!']")
    public WebElement alertButonu;

    @FindBy (xpath = "//span[@class='close-jq-toast-single']")
    public WebElement closeaAlertButonu;

    @FindBy (xpath = "//img[@alt='Instagram']")
    public WebElement instagramIcon;

    @FindBy (xpath = "//a[@href='https://www.instagram.com/']")
    public WebElement instagramLink;

    @FindBy (xpath = "//img[@alt='Whatsapp']")
    public WebElement whatsappIcon;

    @FindBy (xpath = "//a[@href='https://web.whatsapp.com/']")
    public WebElement whatsappLink;

    @FindBy (xpath = "//img[@alt='Twitter']")
    public WebElement twitterIcon;

    @FindBy (xpath = "//a[@href='https://twitter.com/']")
    public WebElement twitterLink;

    @FindBy (xpath = "//img[@alt='Facebook']")
    public WebElement facebookIcon;

    @FindBy (xpath = "//a[@href='https://www.facebook.com/']")
    public WebElement facebookLink;

    @FindBy (xpath ="//div[@class='font-14 text-white']")
    public WebElement telifYazisi;

    @FindBy (xpath = "//img[@alt='footer logo']")
    public WebElement footerLogo;

    @FindBy (xpath = "//a[text()='Store']")
    public WebElement storeLink;

    @FindBy (xpath = "//h1[text()='Products']")
    public WebElement productsPage;

    @FindBy (xpath = "(//input[@type='text'])[2]")
    public WebElement productSearchBox;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement productSearchButton;

    @FindBy (xpath = "(//div[@class='custom-control custom-switch'])[1]")
    public WebElement freeFilterButton;

    @FindBy (xpath = "(//div[@class='custom-control custom-switch'])[2]")
    public WebElement freeShippingFilterButton;

    @FindBy (xpath = "(//div[@class='custom-control custom-switch'])[3]")
    public WebElement discountFilterButton;

    @FindBy (xpath = "//span[text()='0 Products']")
    public WebElement zeroProductsFoundText;

    @FindBy (xpath = "//span[text()='1 Products']")
    public WebElement oneProductFoundText;

    @FindBy (xpath = "//figure")
    public WebElement product;

    @FindBy (xpath = "//h3[@class='mt-15 product-title font-weight-bold font-16 text-dark-blue']")
    public WebElement productName;

    @FindBy (xpath = "//a[@class='user-name ml-5 font-14']")
    public WebElement sellerName;

    @FindBy (xpath = "//a[@class='text-decoration-underline']")
    public WebElement productDescription;

    @FindBy (xpath = "//div[@class='product-price-box mt-25']")
    public WebElement productPrice;

    @FindBy (xpath = "(//div[@class='d-flex align-items-center'])[9]")
    public WebElement productReview;

    @FindBy (xpath = "//button[@class='btn mt-20 btn-primary']")
    public WebElement addToCardButton;

    @FindBy (xpath = "//button[@class='btn btn-outline-danger mt-20 ml-0 ml-md-10 js-product-direct-payment']")
    public WebElement byNowButton;

    @FindBy (xpath = "//textarea[@name='comment']")
    public WebElement commentArea;

    @FindBy (xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement postCommentButton;


    @FindBy (xpath = "//input[@type='email']")
    public WebElement emailArea;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement passwordArea;

    @FindBy (xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/div[2]/div[2]/a[1]")
    public WebElement loginLink;


    @FindBy (xpath = " //h1[text()='Dashboard']")
    public WebElement dashBoardYazisi;

    @FindBy (xpath = "//label[@for='Stripe']")
    public WebElement stripeButton;

    @FindBy (xpath = "//button[text()='Checkout']")
    public WebElement checkoutButonu;

    @FindBy (xpath = "//button[text()='Start Payment']")
    public WebElement startPaymentButton;

    @FindBy (xpath = "//input[@autocomplete='email']")
    public WebElement emailOdeme;

    @FindBy (xpath = "//input[@autocomplete='cc-number']")
    public WebElement kartNo;

    @FindBy (xpath = "//input[@autocomplete='cc-exp']")
    public WebElement kartTarih;

    @FindBy (xpath = "//input[@autocomplete='cc-csc']")
    public WebElement kartCvc;

    @FindBy (xpath = "//input[@autocomplete='cc-name']")
    public WebElement kartName;

    @FindBy (xpath = "//div[@class='SubmitButton-IconContainer']")
    public WebElement odeButonu;

    @FindBy (xpath = "//span[@class='font-16 user-name ml-10 text-dark-blue font-14']")
    public WebElement kullaniciProifili;

    @FindBy (xpath = "//span[text()='My Courses']")
    public WebElement myCourses;

    @FindBy (xpath = "(//div[@class='image-box'])[1]")
    public WebElement ilkKurs;























}

