import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercises {

    public static void main(String[] args) {

// 1. Write a regex that would match the following words: Dark, bark, Lark
//        1. For extra challenge, could you additionally make it match: stark

        String words = "Dark, bark, Lark, stark";
        String regex = "\\w{1,2}ark";
        Pattern pat = Pattern.compile(regex);
        Matcher match = pat.matcher(words);
        match.find();
        System.out.println(match.group(0));
        match.find();
        System.out.println(match.group(0));
        match.find();
        System.out.println(match.group(0));
        match.find();
        System.out.println(match.group(0));

//        2. Use capture groups to write a regex that could match: Abracadabra or Agracadagra

        String words2 = "Abracadabra or Agracadagra";
        String regex2 = "(?<name>A[bg]racada[bg]ra)";
        Pattern pat2 = Pattern.compile(regex2);
        Matcher match2 = pat2.matcher(words2);

        match2.find();
        System.out.println(match2.group("name"));
        match2.find();
        System.out.println(match2.group("name"));

//        3. How can you use parentheses in a regex for grouping but without capturing?
        String regex3 = "(?:A[bg]racada[bg]ra)";

//        4. Write a regex that tests whether a String is an address and allows you to extract the parts
//        (your choice for address format).

        String address = "pl. Politechniki 1, 00-915 Warszawa";
        String regex4 = "(?<street>\\w{1,2}\\.\\s\\w*)\\s(?<buildingNo>\\d+),\\s(?<postalCode>\\d{2}-\\d{3})\\s(?<city>\\w+)";
        Pattern pat4 = Pattern.compile(regex4);
        Matcher match4 = pat4.matcher(address);
        match4.matches();
        System.out.println("Street: " + match4.group("street"));
        System.out.println("Building: " + match4.group("buildingNo"));
        System.out.println("Post Code: " + match4.group("postalCode"));
        System.out.println("City: " + match4.group("city"));

//        5. Write a regex that tests whether a String is an email address.
//        1. Note: Doing this in regex is actually notoriously difficult to comply with ALL the ways an
//        email address can be written. However, you can just do the simplest form of email
//        address you can think of, such as: first.last@domain.com

        String email = "first.last@domain.com";
        String regex5 = "\\w+\\.?\\w+@\\w+\\.[a-zA-Z]{3}";
        Pattern pat5 = Pattern.compile(regex5);
        Matcher match5 = pat5.matcher(email);
        System.out.println(match5.matches());

    }

}






