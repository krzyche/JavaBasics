package org.kester.section_3;
//Exercises as comments


public class WorkingWithText {


    public static void main (String[] args) {

//        1. Model a Person with a first name and last name and ensure that even if the first name is
//        entered all lowercase, it will be stored all uppercase.

        String personFirstName = "jan".toUpperCase();
        String personLastName = "Kowalski";
        System.out.println(personFirstName + " " + personLastName);

//        2. Write code that replaces the word “cat” with the word “dog” wherever it shows up in a
//        sentence.

        String code = "A cat appeared at Master and Margarita novel.";
        System.out.println(code.replace("cat","dog"));

//        3. How can you make sure when people enter text into a program, there are no unintended
//        spaces at the beginning or end of the text?

        String inputFromUser = "   Hello, what time is it?  ";
        System.out.println(inputFromUser.strip());

//        4. If someone enters “ alphabet “ (notice the spaces) as input into a method, make that
//        method output “alphabeT” instead.

        System.out.println(changeLetter("alphabet"));

//        5. Given the String “12345 Big St., Alphabet City, CA 90210” or any other address with the
//        same format, can you write code that can parse and print out:
//          1. The building number: 12345
//          2. The Street: “Big St.”
//          3. City: “Alphabet City”
//          4. State: “CA”
//          5. Postal Code: 90210

        parseAddress("123 Very Big St., Alphabet City 123, CA 90210");

    }

    private static String changeLetter(String input) {
        String inputStripped = input.strip();
        String lastLetter = inputStripped.substring(input.length()-1).toUpperCase();
        return inputStripped.substring(0,inputStripped.length()-1) + lastLetter;
    }

    private static void parseAddress(String input) {
        String[] addressArray = input.split(",");
        String buildingNo = addressArray[0].substring(0, addressArray[0].indexOf(" "));
        String streetName = addressArray[0].substring(addressArray[0].indexOf(" ")+1);
        String cityName = addressArray[1].strip();
        String state = addressArray[2].strip().substring(0, addressArray[2].strip().indexOf(" "));
        String postalCode = addressArray[2].strip().substring(addressArray[2].strip().indexOf(" ")+1);
        System.out.println("1. The building number: " + buildingNo);
        System.out.println("2. The Street: " + "\"" + streetName + "\"" );
        System.out.println("3. City: " + "\"" + cityName + "\"" );
        System.out.println("4. State: " + "\"" + state + "\"" );
        System.out.println("5. Postal Code: " + postalCode);

    }


}
