package Section_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControlFlow_8 {

//    Use Regex with named parameters and a loop to parse the addresses below and print out
//    the  street  address,  city,  state  &  postal  code.  Transfer  this  list  of  addresses  into  your
//    program using a Java text block “”” String.
//
//            12345 First Street, First City, AA 90210
//            22222 Second Street, Second City, BB 22222
//            33333 Third Street, Third City, CC 33333
//            44444 Fourth Street, Fourth City, DD 44444
//            55555 Fifth Street, Fifth City, EE 55555
//            66666 Sixth Street, Sixth City, FF 66666
//            77777 Seventh Street, Seventh City, GG 77777
//            88888 Eighth Street, Eighth City, HH 88888
//            99999 Ninth Street, Ninth City, II 99999
//            00000 Tenth Street, Tenth City, JJ 00000

    public static void main(String[] args) {
        String addressArray = """
                12345 First Street, First City, AA 90210
                22222 Second Street, Second City, BB 22222
                33333 Third Street, Third City, CC 33333
                44444 Fourth Street, Fourth City, DD 44444
                55555 Fifth Street, Fifth City, EE 55555
                66666 Sixth Street, Sixth City, FF 66666
                77777 Seventh Street, Seventh City, GG 77777
                88888 Eighth Street, Eighth City, HH 88888
                99999 Ninth Street, Ninth City, II 99999
                00000 Tenth Street, Tenth City, JJ 00000
                """;
        String regex = "(?<street>\\d{0,5}\\s\\w*\\s\\w*),\\s?(?<city>\\w*\\s\\w*),\\s*(?<state>[A-Z]{1,2})\\s(?<postCode>\\d*)";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(addressArray);
        while (mat.find()) {
            System.out.printf("Street: %s, ", mat.group("street"));
            System.out.printf("City: %s, ", mat.group("city"));
            System.out.printf("State: %s, ", mat.group("state"));
            System.out.printf("Post Code: %s%n", mat.group("postCode"));

        }

    }

}
