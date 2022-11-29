package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = ".nav-link-title.ng-tns-c252-7.ng-star-inserted")
    private WebElement setupOne;

    @FindBy(css = ".nav-link-title.ng-tns-c252-8.ng-star-inserted")
    private WebElement parameters;

    @FindBy(xpath = "(//span[@class='nav-link-title ng-star-inserted'][normalize-space()='Countries'])[1]")
    private WebElement countries;

    @FindBy(xpath="(//span[text()='Citizenships'])[1]")
    private WebElement citizenShip;

    @FindBy(xpath="(//span[normalize-space()='Nationalities'])[1]")
    private WebElement nationalities;



    WebElement myElement;
    public void findAndClick(String strlement)
    {
        //ELEMENT GET !!
        switch (strlement)
        {
            case "setupOne" : myElement=setupOne;break;
            case "parameters" : myElement=parameters;break;
            case "countries" : myElement=countries;break;
            case "citizenShip" : myElement=citizenShip;break;
            case "nationalities" : myElement=nationalities;break;

        }
        clickFunction(myElement);
    }




}
