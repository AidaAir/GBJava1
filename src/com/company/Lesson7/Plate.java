package com.company.Lesson7;

import sun.security.mscapi.CPublicKey;

public class Plate {

    private int foodAmount;

    public int getFoodAmount() {
        return foodAmount;
    }

    public Plate(int foodAmount) {
        this.foodAmount = foodAmount;
    }
        public void info () {
            System.out.println("В тарелке сейчас еды:" + foodAmount);
        }

        public void minusFood(int foodAmount){
        this.foodAmount -= foodAmount;
        }

        public void plusFood (int foodAmount){
        this.foodAmount += foodAmount;
        }

        public boolean isFoodEnough(int foodCount){
            return this.foodAmount >= foodCount;
        }
    }

