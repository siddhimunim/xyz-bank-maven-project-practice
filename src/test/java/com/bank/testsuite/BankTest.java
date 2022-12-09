package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage= new OpenAccountPage();
    CustomerPage customerPage = new CustomerPage();
    AccountPage accountPage = new AccountPage();


    @Test
    public void bankManagerShouldAddCustomerSuccessfully(){
        homePage.clickOnBankMangerLogin();
        bankManagerLoginPage.clickOnAddCustomer();
        addCustomerPage.clickOnFirstName("Hermoine");
        addCustomerPage.clickOnlastName("Granger");
        addCustomerPage.clickOnPostcode("CV4 5ER");
        addCustomerPage.clickOnAddCustomer();
        Assert.assertTrue(addCustomerPage.verifyPopUpText().contains("Customer added successfully"));
        addCustomerPage.acceptpopAlert();
    }
    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException{
        Thread.sleep(1000);
       homePage.clickOnBankMangerLogin();
       bankManagerLoginPage.clickOnOpenAccount();

       openAccountPage.searchCustomerName("Hermoine Granger");
       openAccountPage.selectCurrencyField("Pound");
       openAccountPage.clickOnProcessButton();
        Assert.assertTrue(openAccountPage.verifyPopUpText().contains("Account created successfully"));
        openAccountPage.acceptpopAlert();

    }
    @Test
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException{
        Thread.sleep(500);
       homePage.clickOnCustomerLogin();
       customerPage.searchCustomerName("Hermoine Granger");

        customerPage.clickOnLoginButton();
        Thread.sleep(500);
       Assert.assertEquals(accountPage.verifyLogOutButton(),"Logout","Not verify");
       accountPage.clickOnLogOut();
        Thread.sleep(500);
        Assert.assertTrue(customerPage.verifyYourNameText().contains("Your Name"),"Not verify");

    }
    @Test
    public void customerShouldDepositMoneySuccessfully(){
        homePage.clickOnCustomerLogin();
        customerPage.searchCustomerName("Hermoine Granger");
        customerPage.clickOnLoginButton();
        accountPage.clickOnDeposit();
        accountPage.enterAmountOnField("100");
        accountPage.clickOndepositField();
        Assert.assertEquals(accountPage.verifydeposit(),"Deposit Successful");
    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully(){
        homePage.clickOnCustomerLogin();
        customerPage.searchCustomerName("Hermoine Granger");
        customerPage.clickOnLoginButton();
        accountPage.clickOnwithdraw();
        accountPage.withdrawAmountOnField("50");
        accountPage.clickOnWithdrawField();
        Assert.assertEquals(accountPage.verifydwithdrawText(),"Transaction successful");

    }
}
