package com.jambit.onboarding2020.task6;

public abstract class Human {

   public String furColor;
   public Gender gender;
   public String eyeColor;
   public int age = 0;

   public Human(){
      System.out.println("Constructor called from " + this.getClass());
   }

   public String sayHello(){
      return "Uggha Uggha";
   }

}
