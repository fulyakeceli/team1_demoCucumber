package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstulearnPageMustafa {

    public InstulearnPageMustafa() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginLink;


    @FindBy (xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy (xpath = "//a[text()='Forgot your password?']")
    public WebElement forgetYourPassword;

    @FindBy (xpath = "//input[@type='email']")
    public WebElement emailTextbox;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement resetPasswordButton;

    @FindBy (xpath = "//h2[text()='Request done successfully!']")
    public WebElement requestDoneSuccesfully;


    @FindBy (xpath = "//a[@class='text-secondary font-weight-bold']")
    public WebElement ikinciLoginButton;

    @FindBy (xpath = "//span[@class='close-jq-toast-single']")
    public WebElement alertCloseButton;













}
