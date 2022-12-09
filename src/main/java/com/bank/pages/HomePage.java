package com.bank.pages;

import com.bank.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;

public class HomePage extends Utility {
  //  click On "Bank Manager Login" Tab
    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    public void clickOnBankMangerLogin(){
        mouseHoverToElementAndClick(bankManagerLogin);
    }
    //click on customer login
    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");
    public void clickOnCustomerLogin(){
        mouseHoverToElementAndClick(customerLogin);
    }



}
