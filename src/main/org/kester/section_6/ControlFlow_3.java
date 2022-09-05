package org.kester.section_6;

public class ControlFlow_3 {
//    3. Do #2 again but use a ‘do-while-loop’. (No solutions provided for this one)

    public static void daysOfWeek() {
        String[] daysArray = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int i = 0;
        do {
            if (i%2==1) {
                System.out.println(daysArray[i].toUpperCase());
            } else {
                System.out.println(daysArray[i]);
            }
            i++;
        } while (i<7);
    }

    public static void main(String[] args) {
        daysOfWeek();
    }

}
