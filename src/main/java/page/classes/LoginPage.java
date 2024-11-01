package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id="user-name")
    @CacheLookup
    WebElement userName;

    @FindBy(id="password")
    @CacheLookup
    WebElement password;

    @FindBy(id="login-button")
    @CacheLookup
    WebElement button;


    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUserName(String userNameString)
    {
        userName.sendKeys(userNameString);
    }

    public void enterPassword(String passwordString)
    {
        password.sendKeys(passwordString);
    }

    public void submitButton()
    {
        button.click();
    }

}
