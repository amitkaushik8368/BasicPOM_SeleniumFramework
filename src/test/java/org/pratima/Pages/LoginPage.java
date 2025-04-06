package org.pratima.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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



}
