package com.jambit.onboarding2020.task5;

import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args) throws Exception {

      List<WillibaldAccount> jambitBank = new ArrayList<>();

/*      Account accountCherry = new Account("Cherry", 12533362, 100);
      Account accountCarina = new Account("Carina", 98799876, 42);*/
      WillibaldAccount accountCherry = new WillibaldAccount("Cherry", Integer.toString(12533362), 100);
      WillibaldAccount accountCarina = new WillibaldAccount("Carina", Integer.toString(98799876), 42);

      jambitBank.add(accountCherry);
      jambitBank.add(accountCarina);

      accountCherry.setOverdraftFacility(true); // true/false
      accountCherry.deposit(100);
      accountCherry.withdraw(50); //caution: dispokredit
      accountCherry.getBalance();

      //Zusatz
      accountCherry.sendMoney(accountCarina, 250);

      printBankStatus(jambitBank);

      /**
       * Task: Implementiert ein Bankkonto mit folgenden Funktionen:
       * * Speichern des aktuellen Kontostands
       * * Abfragen des aktuellen Kontostands
       * * Einzahlung auf Bankkonto
       * * Auszahlung von Bankkonto (Achtung: nur wenn Dispokredit gewährt wurde, darf es weniger als 0 werden.
       * * Dispokredit gewährt (Ja/Nein)
       *
       * Zusatz:
       * * Überweisung an anderes Konto
       * * Try-Catch --> throw Exception bei Fehlern. Bspw. wenn Konto ins Minus geht und kein Dispo erlaubt ist.
       */

   }

   private static void printBankStatus(List<WillibaldAccount> jambitBank) {
      System.out.println("jambitBank has " + jambitBank.size() + " accounts with overall " +
          jambitBank.stream().mapToInt
              (a -> (int) a.getBalance()).sum() + " €.");

      for (WillibaldAccount account : jambitBank) {
         System.out.println("--------------Account details------------");
         System.out.println("Owner: " + account.getOwner());
         System.out.println("Number: " + account.getAccountNumber());
         System.out.println("Overdraft Facility: " + account.getOverdraftFacility());
         System.out.println("Balance: " + account.getBalance());
      }
   }

}
