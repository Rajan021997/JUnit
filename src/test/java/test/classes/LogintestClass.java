package test.classes;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import page.classes.LoginPage;
import readWriteClasses.ReadWriteClasses;

import javax.xml.datatype.Duration;
import java.util.concurrent.TimeUnit;

public class LogintestClass {

    WebDriver driver;

    LoginPage loginPage;
    ReadWriteClasses readWriteClasses;

    @Before
    public void openLoginPage()
    {
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("/Applications/Firefox.app/Contents/MacOS/firefox");
        System.setProperty("webdriver.gecko.driver", "/Users/rajanbhardwaj/Desktop/SeleniumJars/geckodriver");
        driver=new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com");
        loginPage=new LoginPage(driver);
        readWriteClasses =new ReadWriteClasses();


    }

        @Test
        public void testMethod()
        {
            String loginPageUrl= driver.getCurrentUrl();
            loginPage.enterUserName(readWriteClasses.readUsername());
            loginPage.enterPassword(readWriteClasses.readPassword());
            loginPage.submitButton();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


           String currentUrl=  driver.getCurrentUrl();
           Assert.assertNotEquals(loginPageUrl, currentUrl);
        }

}
