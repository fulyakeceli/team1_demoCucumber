package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstulearnPageNagihan {  //public InstulearnPageNagihan(){
   // PageFactory.initElements(Driver.getDriver(),this);}
   public InstulearnPageNagihan() {
       // locate'lerin calisabilmesi icin, WebDriver objesini page class'ina tanitmamiz gerekir
       // POM WebDriver tanitma islemini constructor icinde yapar
       PageFactory.initElements(Driver.getDriver(), this);
   }

 @FindBy(xpath ="//*[@*='col-6']")
 public WebElement ValidationCertificate ;

 //@FindBy(className ="img-cover rounded-sm")
 // public  WebElement LiveMeeting ;


 @FindBy(xpath ="//*[@*='font-20 font-weight-bold']")
 public WebElement Certificate ;

 @FindBy(xpath ="//a[.='Login']")
 public WebElement loginanasayfa;

 @FindBy(xpath ="//input[@id='email']")
 public  WebElement email ;

 @FindBy(xpath ="//input[@id='password']")
 public  WebElement password ;

 @FindBy(xpath ="//button[.='Login']")
 public WebElement loginbuton ;

 @FindBy(xpath ="//a[.='Courses']")
 public WebElement courses ;

 @FindBy(xpath  ="(//*[@*='search'])[2]")
 public WebElement aramakutusu ;

 @FindBy(xpath  ="(//*[@*='submit'])[2]")
 public WebElement searchbuton ;

 @FindBy(xpath ="//*[@*='text-white font-30 mb-15']")
 public WebElement coursesyazisi ;

 @FindBy(xpath ="(//*[@*='cursor-pointer'])[6]")
 public WebElement  filterbox;

 @FindBy(xpath ="//*[@*='btn btn-sm btn-primary btn-block mt-30']")
 public WebElement  filteritems;

 @FindBy(xpath = "//*[@*='Mastering Java Programming']")
 public WebElement secilenkurs;

 @FindBy(xpath ="//*[@*='font-30 course-title']")
 public WebElement kursdersadi ;

 @FindBy(id="realPrice")
 public WebElement kursfiyat ;

 @FindBy(xpath ="(//*[@*='ml-5 font-14 font-weight-500'])[9]")
 public WebElement kurstarih ;

 @FindBy(xpath ="(//*[@*='mt-10 font-16 font-weight-bold text-secondary'])[1]")
 public WebElement kurshocaadi ;

 @FindBy(xpath ="(//*[@*='mt-10 font-16 font-weight-bold text-secondary'])[2]")
 public WebElement kurshocaadi2 ;

 @FindBy(xpath ="//*[@*='btn btn-primary js-course-add-to-cart-btn']")
 public WebElement addtocard ;

 @FindBy(xpath ="//*[@*='btn btn-outline-danger mt-20 js-course-direct-payment']")
 public WebElement  buynow;

 @FindBy(xpath ="//*[@*='d-block text-secondary font-weight-bold']")
 public WebElement kursbilgi;

 @FindBy(xpath ="//*[@*='form-control ']")
 public WebElement yorumkutusu ;

 @FindBy(xpath ="(//*[@*='submit'])[2]")
 public WebElement yorumkutusubuton ;

 @FindBy(xpath ="(//*[@*='_blank'])[3]")
 public WebElement teacherprofilbuton ;

 @FindBy(xpath ="(//*[@*='Stripe'])[2]")
 public WebElement kartsecme ;

 @FindBy(xpath ="//*[@*='paymentSubmit']")
 public WebElement startpayment ;

 @FindBy(xpath ="(//*[@*='email'])[2]")
 public WebElement kartodememail  ;

 @FindBy(xpath ="(//*[@*='CheckoutInput CheckoutInput--tabularnums Input Input--empty'])[1]")
 public WebElement kartno  ;

 @FindBy(xpath ="/html/body/div[1]/div/div/div[2]/main/div/form/div/div/div/div[2]/div/div/div[1]/div/fieldset/div[1]/div[2]/div/div/span/input")
 public WebElement karttarih  ;

 @FindBy(xpath ="(//*[@*='cardCvc']")
 public WebElement kartcvc  ;

 @FindBy(xpath ="/html/body/div[1]/div/div/div[2]/main/div/form/div/div/div/div[2]/div/div/div[3]/div/div/div/div/div/div[1]/div/div[2]/div[1]/div[1]/div/div/span/input")
 public WebElement kartname  ;

 @FindBy(xpath ="/html/body/div[1]/div/div/div[2]/main/div/form/div/div/div/div[3]/div/div[2]/div/button/div[3]")
 public WebElement paybuton ;

 @FindBy(xpath ="(//*[@*='Stripe'])[2]")
 public WebElement paywithstripe ;



}