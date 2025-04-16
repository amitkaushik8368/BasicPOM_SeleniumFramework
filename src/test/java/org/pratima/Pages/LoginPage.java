package org.pratima.Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class LoginPage
{
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locators

    @FindBy(id = "login-username")
    WebElement loginEmail;

    @FindBy(id = "login-password")
    WebElement loginPass;

    @FindBy(id = "js-login-btn")
    WebElement loginButton;

    @FindBy(className = "text-link")
    WebElement startFreeTrial;

    @FindBy(id = "page-v1-step1-email")
    WebElement email;

    @FindBy(name = "gdpr_consent_checkbox")
    WebElement checkboxTerms;

    @FindBy(xpath = "//button[@data-qa= \"page-su-submit\"]")
    List<WebElement> submitButton;  // Index 0;

    @FindBy(id = "page-v1-fname")
    WebElement firstName;

    @FindBy(id = "page-v1-lname")
    WebElement lastName;

    @FindBy(id = "page-v1-pnumber")
    WebElement contactNumber;

    @FindBy(id = "page-v1-pwd")
    WebElement passWord;

    @FindBy(xpath = "//button[text() = 'Create Account']")
    WebElement createAccount;

    //Actions

    public void enterLoginEmail(String email)
    {
        loginEmail.sendKeys(email);
    }

    public void enterLoginPass(String pass)
    {
        loginPass.sendKeys(pass);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }

    public void freeTrial()
    {
        startFreeTrial.click();
    }

    public void writeEmail(String emailID)
    {
        email.sendKeys(emailID);
    }

    public void checkBox()
    {
        checkboxTerms.click();
    }

    public void submitEmail()
    {
        submitButton.get(0).click();
    }

    public void giveFirstName(String fName)
    {
        firstName.sendKeys(fName);
    }

    public void giveLastName(String lName)
    {
        lastName.sendKeys(lName);
    }

    public void giveContactNumber(String pNumber)
    {
        contactNumber.sendKeys(pNumber);
    }

    public void givePassword(String password)
    {
        passWord.sendKeys(password);
    }

    public  void createAccountSubmit()
    {
        createAccount.click();
    }

    public static void takeFullScreenshot(WebDriver driver)
    {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("YYYYmmdd_HHmmss").format(new Date());
        String screenshotPath = System.getProperty("user.dir")  + "/src/test/java/org/pratima/Screenshots/screenshot_"+ timestamp+".png";
        File dest = new File(screenshotPath);

        try {
            FileUtils.copyFile(src,dest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
