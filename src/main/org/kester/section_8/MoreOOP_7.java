package org.kester.section_8;

//7. If you modeled a chess board in Java using a two-dimensional array, how could you
//        convert chess notation, or coordinate notation of chess, to an element in that two-
//        dimensional array? For example, in the chess board image below, square a8 might map to
//        array[0][0], and h1 might map to array[7][7]. Make a method that takes an input String of a
//        chess coordinate and returns array coordinates.

public class MoreOOP_7{

    private int getLetterOrdinal(String input) {
        String letter = input.strip().toLowerCase();
        int index = Alphabet.valueOf(letter).ordinal();
        return index;
    }
    private int changeNumber(int num) {
        return Math.abs(num-8);
    }

    public String convertNotation(String input){
        int result_1 = getLetterOrdinal(input.substring(0,1));
        int result_2 = changeNumber(Integer.parseInt(input.substring(1,2)));
        String response = result_1 + ", " + result_2;
        return response;
    }


}
