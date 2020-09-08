package com.jambit.onboarding2020.task7;

public class Main {

   public static void main(String[] args) {

      String myString = "CherryBerry";
      int[] myIntArray = new int[10];

      System.out.println("Erstes Arrayelement: " + myIntArray[0]);
      System.out.println("Letztes Arrayelement: " + myIntArray[9]);

      char[] charsArray = myString.toCharArray();

      for (int i = 0; i < myIntArray.length; i++) {
         System.out.println(charsArray[i]);
      }
   }

}
