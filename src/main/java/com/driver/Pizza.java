package com.driver;

public class Pizza {

    private boolean isVeg;
    private String bill = "";
    private int price = 0;
    private boolean isCheeseAddedOnce = false;
    private boolean isToppingsAddedOnce = false;
    private boolean isTakeAwayAdded = false;

    private boolean isBillGeneratedOnce = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg == true){
            price += 300;
            bill = bill + "Base Price Of The Pizza: 300\n";
        }else{
            price += 400;
            bill = bill + "Base Price Of The Pizza: 400\n";
        }

    }
    public int getPrice(){
        return this.price;
    }
    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAddedOnce == false){
            price += 80;
            isCheeseAddedOnce = true;
        }
    }
    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAddedOnce == false){
            if(isVeg == true){
                this.price += 70;
            }else{
                this.price += 120;
            }
            isToppingsAddedOnce = true;
        }
    }
    public void addTakeaway(){
        // your code goes here
        this.price += 20;
        isTakeAwayAdded = true;
    }
    public String getBill(){
        // your code goes here
        if(isBillGeneratedOnce == false) {
            if(isCheeseAddedOnce){
                bill = bill + "Extra Cheese Added: 80\n";
            }
            if(isToppingsAddedOnce){
                if(isVeg == true){
                    this.bill = this.bill + "Extra Toppings Added: 70\n";
                }else{
                    this.bill = this.bill + "Extra Toppings Added: 120\n";
                }
            }
            if(isTakeAwayAdded){
                this.bill = this.bill + "Paperbag Added: 20\n";
            }
            this.bill = this.bill + "Total Price: " + this.price;

            isBillGeneratedOnce = true;
            return this.bill;
        }
        return this.bill;
    }
}
