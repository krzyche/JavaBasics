package org.kester.section_8;

public enum Meal {
    spaghetti,
    tacos,
    chicken,
    meatloaf,
    hamburgers,
    pizza,
    pot_roast;

    public String toString(){
        String result;
        if (super.toString().contains("_")) {
            result = super.toString().replace("_" , " ");
        } else {
            result = super.toString();
        }
        return result;
    }

    }
