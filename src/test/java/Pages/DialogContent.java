package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css="input[formcontrolname='username']")
    private WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    private WebElement txtTechnoStudy;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    //dynamic-view[@class='ng-star-inserted']
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(css="button[class='consent-give']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "(//input[@id='ms-text-field-0'])[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "(//button[@color='warn'])[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "(//td[@role='cell'])[2]")
    private WebElement searchResultCell;


    WebElement myElement;
    public void findAndSend(String strlement, String value)
    {
        //ELEMENT GET !!
        switch (strlement)
        {
            case "username" : myElement=username;break;
            case "password" : myElement=password;break;
            case "nameInput" : myElement=nameInput;break;
            case "codeInput" : myElement=codeInput;break;
            case "shortName" : myElement=shortName;break;
            case "searchInput" : myElement=searchInput;break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strlement)
    {
        //ELEMENT GET !!
        switch (strlement)
        {
            case "loginButton" : myElement=loginButton;break;
            case "addButton" : myElement=addButton;break;
            case "saveButton" : myElement=saveButton;break;
            case "acceptCookies" : myElement=acceptCookies;break;
            case "searchButton" : myElement=searchButton;break;
            case "deleteButton" : myElement=deleteButton;break;
            case "deleteDialogBtn" : myElement=deleteDialogBtn;break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strlement, String text)
    {
        //ELEMENT GET !!
        switch (strlement)
        {
            case "txtTechnoStudy" : myElement=txtTechnoStudy;break;
            case "successMessage" : myElement=successMessage;break;
            case "alreadyExist" : myElement=alreadyExist;break;
            case "searchResultCell" : myElement=searchResultCell;break;
        }
        verifyContainsTextFunction(myElement, text);
    }

    public void findAndDelete(String searchText)
    {
        // kelimeyi ara ve sonra sil
        findAndSend("searchInput",searchText); // aranan kelime kutucuğa gönderildi.
        findAndClick("searchButton"); // search butonuna basıldı

        // wait.until(ExpectedConditions.stalenessOf(deleteButton)); --> STALE ZAMANI YAKALANAMADI.
        findAndContainsText("searchResultCell",searchText); // arama sonuç satırında o kelime geçiyor mu diye bekliyor, onaylıyor.


        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");

    }







}
