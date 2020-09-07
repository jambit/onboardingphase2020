package com.jambit.onboarding2020.task3;

import java.util.Scanner;

public class Task3 {


   public static void main(String[] args) {
      // write your code here
      Scanner myScanner = new Scanner(System.in);
      System.out.print("Möchtest du \n 1. einen Double einem Integer zuweisen, oder " +
          "\n 2. einen Integer einem Double zuweisen? " +
          "\n 3. runde den Double auf Integer" +
          "\n wähle 1, 2 oder 3: ");
      int input = myScanner.nextInt();
      if (input == 1) {
         convertToInt(myScanner);
      } else if (input == 2) {
         convertToDouble(myScanner);
      } else if (input == 3) {
         convertToIntRounded(myScanner);
      } else {
         System.out.println("Die gewünschte Option existiert nicht");
      }

      /**
       * Task: Unterschied zwischen Deklaration, Initialisierung,
       * Instanziierung?
       */

      /**
       * Task: Was passiert, wenn man einer Variable des Typs "double" einen integer-Wert zuweist? Und umgekehrt?
       * Verwende dazu die Scanner-Klasse und frage den Nutzer, was er machen möchte. Bspw.
       *
       * "Möchtest du Integer nach Double konvertieren?"
       * "Möchtest du Double nach Integer konvertieren?"
       * Danach Ergebnis ausgeben: "Input: XY, konvertierer output: XYZ"
       */

   }

   private static void convertToIntRounded(Scanner myScanner) {
      System.out.print("Gib deinen Double ein (Zahlen mit Komma trennen!):");
      double wert = myScanner.nextDouble();
      System.out.println("Input: " + wert + " Gerundeter Output: " + Math.round(wert));
   }

   private static void convertToDouble(Scanner myScanner) {
      System.out.print("Gib deinen Integer ein:");
      int wert = myScanner.nextInt();
      System.out.println("Input: " + wert + " Konvertierter Output: " + (double) wert);
   }

   private static void convertToInt(Scanner myScanner) {
      System.out.print("Gib deinen Double ein (Zahlen mit Komma trennen!):");
      double wert = myScanner.nextDouble();
      System.out.println("Input: " + wert + " Konvertierter Output: " + (int) wert);
   }
}
