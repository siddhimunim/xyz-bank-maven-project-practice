package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addCustomer = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]");
    public void clickOnAddCustomer(){
        mouseHoverToElementAndClick(addCustomer);
    }
    //click on open account
    By clickOpenAccount = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]");
    public void clickOnOpenAccount(){
        mouseHoverToElementAndClick(clickOpenAccount);
    }

}
