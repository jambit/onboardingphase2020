package com.jambit.onboarding2020.task6;

public class Student extends Human {

   public String university;
   public Student(){
      super();
      System.out.println("Constructor called from " + this.getClass());
      age = 20;
   }

   public String sayHello(){
      return "Guten Tag, wie geht es Ihnen?";
   }

}
