package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {
  //  search customer that you created.
    By searchCustomer = By.id("userSelect");
    public void searchCustomerName(String text){
        clickOnElement(searchCustomer);
        selectByVisibleTextFromDropDown(searchCustomer,text);


    }
  //  click on "Login" Button
    By loginButton = By.xpath("//button[contains(text(),'Login')]");
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    //  verify "Your Name" text displayed.
    By nameText = By.xpath("//label[contains(text(),'Your Name :')]");
    public String verifyYourNameText(){
        return getTextFromElement(nameText);
    }



}
