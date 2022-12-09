package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    //fill form
    By firstName = By.xpath("//input[@placeholder='First Name']");
    public void clickOnFirstName (String text){
        sendTextToElement(firstName,text);

    }
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    public void clickOnlastName (String text){
        sendTextToElement(lastName,text);

    }
    By postcode= By.xpath("//input[@placeholder='Post Code']");
    public void clickOnPostcode (String text){
        sendTextToElement(postcode,text);

    }
    //click on add customer button
    By customerButton = By.xpath("//button[text()='Add Customer']");
     public void clickOnAddCustomer(){
         mouseHoverToElementAndClick(customerButton);
     }
     //get text from popup
    public String verifyPopUpText(){
         return getTextFromAlert();
    }
    //accept ok ti pop up
    public void acceptpopAlert(){
         acceptAlert();
    }
}
