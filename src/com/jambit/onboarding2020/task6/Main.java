package com.jambit.onboarding2020.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      Azubi azubi = new Azubi();
      Student student = new Student();

      Human humazubi = new Azubi();

      Human fresherAzubi = new FresherAzubi();


      System.out.println(humazubi.getClass() + ": " + humazubi.sayHello());

      System.out.println(azubi.getClass() + ": " + azubi.sayHello());
      System.out.println(student.getClass() + ": " + student.sayHello());


   }
}
