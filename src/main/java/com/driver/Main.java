package com.driver;

public class Main {
  public static void main(String[] args) {

    DeluxePizza dp = new DeluxePizza(true);
    dp.addExtraCheese();
    dp.addExtraToppings();
    dp.addExtraToppings();
    dp.addTakeaway();
//    System.out.println(dp.getBill());

    Pizza p = new Pizza(false);
    p.addExtraToppings();
    p.addTakeaway();
    p.addExtraCheese();
    p.addExtraToppings();
    p.addExtraCheese();
//    System.out.println(p.getBill());

  }
}