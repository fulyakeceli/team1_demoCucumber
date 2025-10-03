package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstulearnPageHaydar {

    public InstulearnPageHaydar() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "(//img[@class='img-cover'])[2]")
    public WebElement solPicture;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//button[@type='submit']\n")
    public WebElement submitButonu;
}
