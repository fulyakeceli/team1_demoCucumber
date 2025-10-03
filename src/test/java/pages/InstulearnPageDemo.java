package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstulearnPageDemo {

    // Constructor
    public InstulearnPageDemo() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='/become-instructor'])[1]")
    public WebElement becomeInstructor;


    @FindBy(xpath = "//label[@for='checkbox618']")
    public WebElement sdet;

    @FindBy(xpath = "//select[@name='bank_id']")
    public WebElement payOutAccount;

    @FindBy(xpath = "//option[@value='5']")
    public WebElement stripe;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement accountHolder;


    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement accountId;

    @FindBy (xpath = "//textarea[@name='description']")
    public WebElement extraInfo;


    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement sendRequest;









}





