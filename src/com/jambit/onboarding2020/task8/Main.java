package com.jambit.onboarding2020.task8;

public class Main {

   public static void main(String[] args) {

      int primitiveInteger = 42;
      int anotherPrimitiveInteger = 111;
      Jambitee cherry = new Jambitee("Cherry");
      Jambitee stefan = new Jambitee("Stefan");
      Jambitee abassin = new Jambitee("Abassin");

      cherry = stefan;
      abassin = stefan;

      System.out.println(cherry);
      System.out.println(stefan);
      System.out.println(abassin);

      primitiveInteger = 123456;
      anotherPrimitiveInteger = primitiveInteger;

      System.out.println(anotherPrimitiveInteger);
      primitiveInteger = 999;
      System.out.println(anotherPrimitiveInteger);

      Jambitee jambitee = null;

      if(jambitee == null){
         System.out.println("jambitee is null");
      }

      cherry.setName("Cherry");
      abassin.setName("Abassin");

      System.out.println(cherry);
      System.out.println(stefan);
      System.out.println(abassin);

   }

}
