package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstulearnPageMerve {

    public InstulearnPageMerve() {
        // locate'lerin calisabilmesi icin, WebDriver objesini page class'ina tanitmamiz gerekir
        // POM WebDriver tanitma islemini constructor icinde yapar
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    @FindBy(xpath = "(//a[@href='https://qa.instulearn.com/course/Java'])[1]")
//    public WebElement featuredCoursesLink;

    @FindBy(xpath="(//*[@class='section-title'])[1]")
    public WebElement featuredCoursesBaslik;

    //*[@id="app"]/section[2]/div[2]/div[1]/div/div/div/div/div/a[2]/h3
    @FindBy(xpath ="//*[@id=\"app\"]/section[2]/div[2]/div[1]/div/div/div/div/div/a[2]/h3")
    public WebElement featuredCoursesLink;

    @FindBy(xpath ="//*[@class='d-flex justify-content-between ']")
    public WebElement newestCourses;

    @FindBy(xpath ="//*[@class='mt-10 position-relative']")
    public WebElement kursKartlari;

    @FindBy(xpath ="//*[@class='btn btn-border-white']")
    public WebElement viewAllButonu;

    @FindBy(xpath ="//*[@id=\"app\"]/section[4]/div[1]/div")
    public WebElement latestBundlesBaslik;

    @FindBy(xpath ="//*[@id=\"app\"]/section[4]/div[2]/div[1]/div/div[1]/div/figure/div")
    public WebElement latestBundlesPaketler;

    @FindBy(xpath ="//*[@id=\"app\"]/section[4]/div[1]/a")
    public WebElement latestBundlesViewAllButonu;

    @FindBy(xpath ="(//*[@class='d-flex justify-content-between'])[1]")
    public WebElement upComingBaslik;

    @FindBy(xpath ="//*[@id=\"app\"]/section[5]/div[2]/div[1]/div/div[1]/div/figure/div/span")
    public WebElement upComingKursKart;

    @FindBy(xpath ="//*[@id=\"app\"]/section[7]")
    public WebElement trendingCategoriesBaslik;

    @FindBy(xpath ="(//*[@class='item-count px-10 px-lg-20 py-5 py-lg-10'])[1]")
    public WebElement trendingCategoriesFitness;

    @FindBy(xpath ="(//*[@class='trending-card d-flex flex-column align-items-center w-100'])[1]")
    public WebElement trendingCategoriesManagement;

    @FindBy(xpath ="(//*[@class='item-count px-10 px-lg-20 py-5 py-lg-10'])[1]")
    public WebElement trendingCategoriesBusiness;

    @FindBy(xpath ="(//*[@class='item-count px-10 px-lg-20 py-5 py-lg-10'])[1]")
    public WebElement trendingCategoriesTravel;

    @FindBy(xpath ="//*[@id=\"app\"]/section[8]/div[1]")
    public WebElement bestSellingBaslik;

    @FindBy(xpath ="//*[@id=\"app\"]/section[8]/div[2]/div[1]/div/div[1]/div/figure/figcaption/div[1]/a")
    public WebElement bestSellingTeacher;

    @FindBy(xpath ="//*[@id=\"app\"]/section[8]/div[2]/div[1]/div/div[1]/div/figure/figcaption/div[3]/div[1]")
    public WebElement bestSellingSaat;

    @FindBy(xpath ="//*[@id=\"app\"]/section[8]/div[2]/div[1]/div/div[2]/div/figure/figcaption/div[3]/div[3]")
    public WebElement bestSellingTarih;

    @FindBy(xpath ="//*[@id=\"app\"]/section[8]/div[2]/div[1]/div/div[4]/div/figure/figcaption/div[4]")
    public WebElement bestSellingFiyat;

    @FindBy(xpath ="//*[@id=\"app\"]/section[9]/div[1]")
    public WebElement freeCoursesBaslik;

    @FindBy(xpath ="(//*[@class='user-name ml-5 font-14'])[1]")
    public WebElement freeCoursesTeacher;

    @FindBy(xpath ="//div[@class='webinar-card-body']//div[@class='d-flex align-items-center']")
    public WebElement freeCoursesTarih;

    @FindBy(xpath ="//div[@class='d-flex justify-content-between mt-20']/div[@class='d-flex align-items-center']")
    public WebElement freeCoursesSaat;

    @FindBy(xpath ="(//*[@class='webinar-price-box mt-25'])[1]")
    public WebElement freeCoursesFree;

    @FindBy(xpath ="//*[@class='font-16 user-name ml-10 text-dark-blue font-14]")
    public WebElement AnasayfaStudent;

    @FindBy(xpath ="(//*[@class='d-flex align-items-center w-100 px-15 py-10 text-gray font-14 bg-transparent'])[1]")
    public WebElement DashboardButon;

    @FindBy(xpath ="//*[@id=\"panel-sidebar-scroll\"]/div[1]/div[2]/div/div/div/li[2]/a")
    public WebElement DashboardCoursesButonu;

    @FindBy(xpath ="//a[normalize-space()='My purchases']")
    public WebElement PurchasedCourses;

    @FindBy(xpath ="//*[@id=\"panel-sidebar-scroll\"]/div[1]/div[2]/div/div/div/li[5]/a/span[2]")
    public WebElement DashboardQuizzes;

    @FindBy(xpath ="//*[@id=\"quizzesCollapse\"]/ul/li[1]/a")
    public WebElement QuizzesMyResult;

    @FindBy(xpath ="//a[.='Login']")
    public WebElement loginButonu;

    @FindBy(xpath ="//input[@id='email']")
    public WebElement loginMailKutusu;

    @FindBy(xpath ="//button[.='Login']")
    public WebElement loginPageLoginButonu;

    //*[@class='d-flex align-items-center collapsed']
    @FindBy(xpath ="//li[@class='sidenav-item sidenav-item-active']//span[text()='Quizzes']")
    public WebElement InstructorDashboardQuizzes;

    @FindBy(xpath ="//*[@id=\"quizzesCollapse\"]/ul/li[1]/a")
    public WebElement InstructorDashboardNewQuizzes;

    @FindBy(xpath ="//*[@id=\"quizzesCollapse\"]/ul/li[2]/a")
    public WebElement InstructorDashboardList;

    @FindBy(xpath ="//*[@id=\"quizzesCollapse\"]/ul/li[3]/a")
    public WebElement InstructorDashboardResult;

    @FindBy(xpath ="//*[@id=\"quizzesCollapse\"]/ul/li[4]/a")
    public WebElement InstructorDashboardMyResult;

    @FindBy(xpath ="//*[@id=\"quizzesCollapse\"]/ul/li[5]/a")
    public WebElement InstructorDashboardNotParticipated;

    @FindBy(name ="ajax[new][title]")
    public WebElement QuizTitle;

    @FindBy(name ="ajax[new][pass_mark]")
    public WebElement QuizPassMark;

    @FindBy(xpath ="//*[@class='js-submit-quiz-form btn btn-sm btn-primary']")
    public WebElement CreateQuiz;

    @FindBy(xpath ="//*[@class='mt-15 font-weight-500 text-dark-blue d-inline-block']")
    public WebElement DashboardViewAllEvents;

    @FindBy(name ="//div[@class='stat-icon requests']")
    public WebElement onePuchasedCoursesText;










}
