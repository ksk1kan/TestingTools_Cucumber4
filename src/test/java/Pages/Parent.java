package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element); //elementler gözükene kadar bekle
        scrollToelement(element);  //elemente kadar scroll yap (JavaScriptExecuter)
        element.clear();  // elementi temizle
        element.sendKeys(value); // elemente değer gönder
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element); //elementler clickable olana kadar bekle
        scrollToelement(element);  //elemente kadar scroll yap (JavaScriptExecuter)
        element.click();
    }

    public void waitUntilVisible (WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToelement (WebElement element)
    {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilClickable (WebElement element)
    {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsTextFunction(WebElement element, String value)
    {
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"The text you searched could'nt be find");
    }




}
