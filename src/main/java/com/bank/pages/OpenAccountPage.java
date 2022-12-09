package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    //search customer name that enter
    By custName = By.xpath("//select[@id='userSelect']");

    public void searchCustomerName(String text) {
        clickOnElement(custName);
        selectByVisibleTextFromDropDown(custName, text);
    }

    //   Select currency "Pound"
    By currency = By.xpath("//select[@id='currency']");

    public void selectCurrencyField(String text) {
        clickOnElement(currency);
        selectByVisibleTextFromDropDown(currency, text);

    }

    //   click on "process" button
    By process = By.xpath("//button[contains(text(),'Process')]");

    public void clickOnProcessButton() {
        mouseHoverToElementAndClick(process);
    }

    //get text from popup
    public String verifyPopUpText() {
        return getTextFromAlert();
    }

    //accept ok ti pop up
    public void acceptpopAlert() {
        acceptAlert();
    }
}