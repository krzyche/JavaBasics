package org.kester.section_6;


public class ControlFlow_2 {
//    2. Repeat all parts of exercise #1, but use ‘while-loop’ instead of ‘for-loop’ (where applicable).

    public static void daysOfWeek() {
        String[] daysArray = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int i = 0;
        while (i<7) {
            if (i%2==1) {
                System.out.println(daysArray[i].toUpperCase());
            } else {
                System.out.println(daysArray[i]);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        daysOfWeek();
    }

}



