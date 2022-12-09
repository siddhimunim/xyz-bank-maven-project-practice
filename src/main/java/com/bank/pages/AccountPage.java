package com.bank.pages;

import com.bank.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
   // verify "Logout" Tab displayed.
    By verifyLogOut = By.xpath("//button[contains(text(),'Logout')]");
    public String verifyLogOutButton(){
        return getTextFromElement(verifyLogOut);

    }

  //  click on "Logout"
    By logOut = By.xpath("//button[contains(text(),'Logout')]");
    public void clickOnLogOut(){
        mouseHoverToElementAndClick(logOut);
    }


    //click on deposit
    By deposit = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]");
    public void clickOnDeposit(){
        mouseHoverToElementAndClick(deposit);
    }
    //enter amount 100
    By enterAmount = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
    public void enterAmountOnField(String text){
        sendTextToElement(enterAmount,text);

    }
    //click on deposit
    By clickDeposit = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
    public void clickOndepositField(){
        mouseHoverToElementAndClick(clickDeposit);
    }
    //verify massage
    By depositSucess = By.xpath("//span[contains(text(),'Deposit Successful')]");
    public String verifydeposit(){
        return getTextFromElement(depositSucess);
    }
    //click on withdraw
    By withdraw = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]");
    public void clickOnwithdraw(){
        mouseHoverToElementAndClick(withdraw);
    }
    //withdraw amount 50
    By withdrawAmount = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
    public void withdrawAmountOnField(String text){
        sendTextToElement(withdrawAmount,text);

    }
    By clickwithdraw = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
    public void clickOnWithdrawField(){
        mouseHoverToElementAndClick(clickwithdraw);
    }
    By withdrawSucess = By.xpath("//span[contains(text(),'Transaction successful')]");
    public String verifydwithdrawText(){
        return getTextFromElement(withdrawSucess);
    }



}
