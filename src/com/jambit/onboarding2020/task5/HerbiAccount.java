package com.jambit.onboarding2020.task5;

public class HerbiAccount {

      private double balance;
      private String owner;
      private int accountNumber;
      private boolean overdraft = false;
      public HerbiAccount (String owner, int accountNumber, double balance) {
         this.owner = owner;
         this.balance = balance;
         this.accountNumber = accountNumber;
      }
      public double getBalance() {
         return balance;
      }
      /**
       * Einzahlen
       */
      public void deposit (double money) {
         this.balance += money;
      }
      /**
       * Abheben
       */
      public void withdraw (double money) throws Exception {
         if (money < this.balance || !this.overdraft) {
            this.balance -= money;
         } else {
            throw new Exception("Kontostand reicht nicht aus und Dispokredit nicht gewährt!");
         }
      }
      public void setOverdraftFacility (boolean value) {
         this.overdraft = value;
      }
      public boolean getOverdraftFacility() {
         return overdraft;
      }
      public String getOwner() {
         return owner;
      }
      public void setOwner(String owner) {
         this.owner = owner;
      }
      public int getAccountNumber() {
         return accountNumber;
      }
      public void setAccountNumber(int accountNumber) {
         this.accountNumber = accountNumber;
      }
      public void sendMoney (HerbiAccount account, double money) throws Exception {
         if (money < this.balance || !this.overdraft) {
            this.balance -= money;
            account.balance += money;
         } else {
            throw new Exception("Kontostand reicht nicht aus und Dispokredit nicht gewährt!");
         }
      }

}
