package com.jambit.onboarding2020.task5;

public class WillibaldAccount {

   int balance;
   boolean overdraftFacility;
   String owner;
   String accountNumber;

   public WillibaldAccount(int balance) {
      this.balance = balance;
      this.overdraftFacility = false;
   }

   public WillibaldAccount(String owner, String accountNumber, int balance) {
      this.owner = owner;
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.overdraftFacility = false;
   }

   public String getOwner() {
      return owner;
   }

   public String getAccountNumber() {
      return accountNumber;
   }

   public boolean getOverdraftFacility() {
      return overdraftFacility;
   }

   public void deposit(int i) {
      balance = balance + i;
   }

   public int getBalance() {
      return balance;
   }

   public void setOverdraftFacility(boolean overdraftFacility) {
      this.overdraftFacility = overdraftFacility;
   }

   public void withdraw(int i) {
      try {
         if ((balance - i) < 0 && overdraftFacility) {
            balance = balance - i;
         } else {
            throw new Exception("Withdraw failed because of insufficient balance!");
         }
      } catch (Exception e) {
         System.out.println("Withdraw failed because of insufficient balance!");
      }
   }

   public void sendMoney(WillibaldAccount accountReceiver, int i) {
      this.withdraw(i);
      accountReceiver.deposit(i);
   }
}
