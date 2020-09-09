package com.jambit.onboarding2020.task8;

public class Jambitee {

   private String name;

   public Jambitee(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Jambitee{" +
          "name='" + name + '\'' +
          '}' + getClass().getName() + "@" + Integer.toHexString(hashCode());
   }
}
