package org.kester.section_6;

public class ControlFlow_3 {
//    3. Do #2 again but use a ‘do-while-loop’. (No solutions provided for this one)

    public static void daysOfWeek() {
        String result = "";
        String[] daysArray = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int i = 0;
        do {
            if (i%2==1) {
                result = daysArray[i].toUpperCase();
            } else {
                result = daysArray[i];
            }
            System.out.println(result);
            i++;
        } while (i< daysArray.length);
    }

    public static void main(String[] args) {
        daysOfWeek();
    }

}
