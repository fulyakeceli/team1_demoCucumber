package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class demoPages {
    public demoPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//*[@id=\"panel-sidebar-scroll\"]/div[1]/div[2]/div/div/div/li[2]/a/span[2]")
    public WebElement coursesDashboard;
    @FindBy (xpath = "//*[@id=\"webinarCollapse\"]/ul/li[1]/a")
    public WebElement coursesNewDashboard;
    @FindBy (xpath = "//*[@name='title']")
    public WebElement titleYaziAlani;
    @FindBy (xpath = "//*[@data-input='thumbnail']")
    public WebElement thumbnailIcon;
    @FindBy (xpath = "//*[@name='thumbnail']")
    public WebElement thumbnailYaziAlani;
    @FindBy(xpath = "//*[@id=\"content\"]/a[2]/div[2]/div")
    public WebElement thumbJpg;
    @FindBy (xpath = "//*[@data-id='1']")
    public WebElement thumbNailChose;
    @FindBy (xpath = "//*[@id=\"actions\"]/a[3]")
    public WebElement confirmButton;
    @FindBy (xpath = "//*[@data-input='cover_image']")
    public WebElement coverImageIcon;
    @FindBy (xpath = "//*[@id=\"content\"]/a[1]/div[2]/div")
    public WebElement coverJpg;
    @FindBy (xpath = "//*[@name='image_cover']")
    public WebElement coverYaziAlani;

    @FindBy(xpath = "//a[@data-action='use']")
    public WebElement coverConfirmButonu;
    @FindBy (xpath = "//*[@id=\"webinarForm\"]/div[3]/div/div/div/div[3]/div[3]")
    public WebElement descriptionYaziAlani;
    @FindBy (xpath = "//*[@id='getNextStep']")
    public WebElement nextButton;
    @FindBy (xpath = ("//*[@name='capacity']"))
    public WebElement capacity;
    @FindBy (xpath = "//*[@name='start_date']")
    public WebElement startDate;
    @FindBy (xpath = "/html/body/div[3]/div[2]/div[1]/table/tbody/tr[2]/td[1]")
    public WebElement fiveOctoberChose;
    @FindBy (xpath = "//*[@class='applyBtn btn btn-sm btn-primary']")
    public WebElement applyButton;
    @FindBy (xpath = "//*[@name='duration']")
    public WebElement durationYaziAlani;
    @FindBy (xpath = "(//*[@type='text'])[3]")
    public WebElement tagsYaziAlani;
    @FindBy (xpath = "//*[@id='categories']")
    public WebElement category;
    @FindBy (xpath = "//*[@id=\"categories\"]/optgroup[6]]")
    public WebElement cyberChose;
    @FindBy (xpath = "//*[@name='price']")
    public WebElement priceYaziAlani;
    @FindBy (xpath = "//*[@id='sendForReview']")
    public WebElement publishButton;
    @FindBy (xpath = "//*[@class='webinar-card webinar-list d-flex']")
    public WebElement newCourseDisplay;
    @FindBy (xpath = "(//*[@class='nav-link'])[1]")
    public WebElement homePage;
    @FindBy (xpath = "//*[@class='font-16 user-name ml-10 text-dark-blue font-14']")
    public WebElement userName;
    @FindBy (xpath = "(//*[@class='ml-5'])[9]")
    public WebElement logOut;

    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/div[2]/div[2]/a[1]")
    public WebElement anasayfaLoginButton;

    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement email;

    @FindBy (xpath = "//*[@id=\"password\"]")
    public WebElement password;

    @FindBy (xpath = "//*[@id=\"app\"]/div[3]/div/div[2]/div/form/button")
    public WebElement loginLoginButton;
}