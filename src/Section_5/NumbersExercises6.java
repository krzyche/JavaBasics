
package Section_5;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

//            6. Write a function that takes a String like “149.32” and formats it as money for wherever you
//            live. So, if you live in the United States, it would return “$149.32”, Korea = ₩149, France/
//            EU = 149,32 €, etc.

public class NumbersExercises6 {

    public static void main(String[] args) throws ParseException {
        Double money = 149.32;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println(formatter.format(money));
        divCurrency("$12,345.83");
        System.out.println(sumOfString("37", "13"));
    }

//    7. Write a function that takes a String input of “$12,345.83” and prints out that value divided
//    by 32.19. It should return $383.53.

    public static void divCurrency(String input) throws ParseException {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        Number myString = format.parse(input);
        double value = myString.doubleValue()/32.19d;
        System.out.println(format.format(value));
        printf();
        stringVariables();

    }

    // 8. Use printf() to format the following inputs to print out the following outputs
//            Input         Output
//            123456.783    $123,456.78
//            -9876.32532   (9,876.325)
//            23.19283928394829182 2.319284e+01f
//            123456        0000123456
//            -9876.35532   -9,876.4

    public static void printf() {

        System.out.printf(Locale.US, "$%,.2f%n", 123456.783);
        System.out.printf(Locale.US, "%(,.3f%n", -9876.32532);
        System.out.printf(Locale.US, "%.6ef%n", 23.19283928394829182);
        System.out.printf("%010d%n", 123456);
        System.out.printf(Locale.US, "%,.1f%n", -9876.35532);

    }

//    9. How could you format each of the inputs in the table above and store them in String
//    variables instead of just printing them out directly?
//    10. Use instances of DecimalFormat to perform the same conversions in the table above.
//            Input         Output
//            123456.783    $123,456.78
//            -9876.32532   (9,876.325)
//            23.19283928394829182 2.319284e+01f
//            123456        0000123456
//            -9876.35532   -9,876.4

    public static void stringVariables() {
        DecimalFormat df1 = new DecimalFormat("$#,###.##");
        String num1 = df1.format(123456.783);
        System.out.println("\n");
        System.out.println(num1);
        DecimalFormat df2 = new DecimalFormat("#,###.###;(#)");
        String num2 = df2.format(-9876.32532);
        System.out.println(num2);
        DecimalFormat df3 = new DecimalFormat("0.######E0f");
        String num3 = df3.format(23.19283928394829182);
        System.out.println(num3);
        DecimalFormat df4 = new DecimalFormat("0000000000");
        String num4 = df4.format(123456);
        System.out.println(num4);
        DecimalFormat df5 = new DecimalFormat("#,###.#;-#");
        String num5 = df5.format( -9876.35532);
        System.out.println(num5);
    }

//    11. Write a method that takes the String inputs, “37” & “13”, and returns an integer of their
//    sum, 50.

    public static int sumOfString (String str1, String str2) {
        Integer s1 = Integer.parseInt(str1);
        Integer s2 = Integer.parseInt(str2);
        return s1+s2;
    }


}
