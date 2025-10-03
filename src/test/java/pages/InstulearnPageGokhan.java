package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstulearnPageGokhan {

    public InstulearnPageGokhan() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@class='py-5 px-10 text-dark-blue font-14']")
    public WebElement registerElement;

    @FindBy (xpath = "(//img[@class='img-cover'])[2]")
    public WebElement photoElement;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement registerEmailBoxElement;

    @FindBy (xpath = "//input[@type='checkbox']")
    public WebElement iAgreeBoxElement;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement signupElement;

    /* ---------------------------------------------- */

    @FindBy (xpath = "//a[@class='py-5 px-10 mr-10 text-dark-blue font-14']")
    public WebElement loginElement;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement emailBoxElement;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement loginButtonElement;

    @FindBy (xpath = "//input[@type='checkbox']")
    public WebElement aktifPasifButtonElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[1]")
    public WebElement dashboardElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[2]")
    public WebElement coursesElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[3]")
    public WebElement courseBundlesElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[4]")
    public WebElement meetingsElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[5]")
    public WebElement quizzesElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[6]")
    public WebElement certificatesElement;


    @FindBy (xpath = "//a[@class='mt-15 font-weight-500 text-dark-blue d-inline-block']")
    public WebElement viewAllEventsElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[7]")
    public WebElement financialElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[8]")
    public WebElement supportElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[9]")
    public WebElement marketingElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[10]")
    public WebElement articlesElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[11]")
    public WebElement noticeboardElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[12]")
    public WebElement notificationsElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[13]")
    public WebElement settingsElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[14]")
    public WebElement myProfileElement;

    @FindBy (xpath = "(//span[@class='font-14 text-dark-blue font-weight-500'])[15]")
    public WebElement logoutElement;

    @FindBy (xpath = "//*[.='Account Balance']")
    public WebElement accountBalanceElement;

    @FindBy (xpath = "//*[.='Pending meetings']")
    public WebElement pendingMeetingsElement;

    @FindBy (xpath = "//*[.='Support Messages']")
    public WebElement supportMessagesElement;

    @FindBy (xpath = "(//*[.='Monthly Sales'])[1]")
    public WebElement monthlySalesElement;

    @FindBy (xpath = "(//*[.='Comments'])[2]")
    public WebElement commentsElement;

    @FindBy (xpath = "//*[.='New Year Sales Festival']")
    public WebElement newYearElement;

    @FindBy (xpath = "(//*[.='More info'])[1]")
    public WebElement newYearMoreInfoElement;

    @FindBy (xpath = "//canvas[@id='myChart']")
    public WebElement monthlySalesGraph;

    @FindBy (xpath = "(//img[@class='img-cover'])[1]")
    public WebElement instuLearnLogoElement;

    @FindBy (xpath = "//span[@class='font-16 user-name ml-10 text-dark-blue font-14']")
    public WebElement ogrenciMailLinkElement;

    @FindBy (xpath = "//*[.='Logout']")
    public WebElement logout2Element;
}