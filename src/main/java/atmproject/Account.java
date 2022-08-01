package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int accountNumber;
    private int pinNumber;

    private double checkingBalance;
    private double savingBalance;

    Scanner scan = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");




    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

//calculate checking account balance after withdraw

    private double calculateCheckingBalanceAfterWithdraw(double amount){
        checkingBalance= checkingBalance - amount;
        return checkingBalance;
    }

    //calculate checking account balance after deposit

    private double calculateCheckingBalanceAfterDeposit(double amount){
        checkingBalance = checkingBalance+amount;
        return checkingBalance;
    }
//calculate saving balance after withdraw

    private double calculateSavingBalanceAfterWithdraw(double amount) {
        savingBalance = savingBalance - amount;
        return savingBalance;
    }
    //calculate saving account balance after deposit

    private double calculateSavingBalanceAfterDeposit(double amount){
        savingBalance = savingBalance+amount;
        return savingBalance;
    }

//intruct with customer to withdraw money from checking account

    public void getCheckingWithdraw(){
        System.out.println("your checking balance:"+moneyFormat.format(checkingBalance));
        System.out.println("enter the amount you would like to withdraw");
        double amount = scan.nextDouble();
        if(amount<=0){
            System.out.println("negative or zero amount is not acceptable!");
            getCheckingWithdraw();
        }else if (checkingBalance>=amount){
            calculateCheckingBalanceAfterWithdraw(amount);
            System.out.println("your checking balance:"+moneyFormat.format(checkingBalance));

        }else {
            System.out.println("you do not have enough money on your checking account");
        }
    }


    // interact customer to deposit money to theit checking account

    public void getCheckingDeposit(){
        System.out.println("your checking balance:"+moneyFormat.format(checkingBalance));
        System.out.println("enter the amount you would like to deposit: ");
        double amount = scan.nextDouble();
        if(amount<=0){
            System.out.println("negative or zero amount is not acceptable!");
            getCheckingDeposit();

        }else {
            calculateCheckingBalanceAfterDeposit(amount);
            System.out.println("your checking balance:"+moneyFormat.format(checkingBalance));

        }
    }

    //interuct with customer to withdraw money from saving account

    public void getSavingWithdraw(){
        System.out.println("your saving balance:"+moneyFormat.format(savingBalance));
        System.out.println("enter the amount you would like to withdraw");
        double amount = scan.nextDouble();
        if(amount<=0){
            System.out.println("negative or zero amount is not acceptable!");
            getSavingWithdraw();
        }else if (savingBalance>=amount){
            calculateSavingBalanceAfterWithdraw(amount);
            System.out.println("your saving balance:"+moneyFormat.format(savingBalance));

        }else {
            System.out.println("you do not have enough money on your saving account");
        }
    }


    // interact customer to deposit money to theit checking account

    public void getSavingDeposit() {
        System.out.println("your saving balance:" + moneyFormat.format(savingBalance));
        System.out.println("enter the amount you would like to deposit: ");
        double amount = scan.nextDouble();
        if (amount <= 0) {
            System.out.println("negative or zero amount is not acceptable!");
            getSavingDeposit();

        } else {
            calculateSavingBalanceAfterDeposit(amount);
            System.out.println("your saving balance:" + moneyFormat.format(savingBalance));

        }


    }

}




