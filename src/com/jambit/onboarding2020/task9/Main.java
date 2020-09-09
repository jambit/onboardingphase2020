package com.jambit.onboarding2020.task9;

import java.util.ArrayList;

public class Main {

   public static void main(String[] args) {

      Azubi azubi = new Azubi();
      Student student = new Student();

      ArrayList<Talkable> jambiteeTalkerList = new ArrayList<>();

      for (Talkable talkable : jambiteeTalkerList) {
         talkable.sayHello();
      }

      jambiteeTalkerList.add(azubi);
      jambiteeTalkerList.add(student);


      ArrayList<Coffeeable> jambiteeDrinkerList = new ArrayList<>();
      jambiteeDrinkerList.add(student);

      for (Coffeeable coffeeable : jambiteeDrinkerList) {
         coffeeable.drinkCoffee();
      }

   }

}
