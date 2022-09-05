package org.kester.section_6;


public class ControlFlow_2 {
//    2. Repeat all parts of exercise #1, but use ‘while-loop’ instead of ‘for-loop’ (where applicable).

    public static void daysOfWeek() {
        String[] daysArray = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        String result = "";
        int i = 0;
        while (i< daysArray.length) {
            if (i%2==1) {
                result = daysArray[i].toUpperCase();
            } else {
                result = daysArray[i];
            }
            System.out.println(result);
            i++;
        }
    }

    public static void main(String[] args) {
        daysOfWeek();
    }

}



