public class LetterUpperCase {


    public String changeCases(String word) {
        StringBuilder textBuilder = new StringBuilder(word.strip());
        int wordLength = word.strip().length();
        for (int i=1; i<= wordLength; i++) {
            if (i%2 == 0) {
                Character letter = word.strip().charAt(i-1);
                Character letterCapital = Character.toUpperCase(letter);
                textBuilder.setCharAt(i-1, letterCapital.charValue());
            }
        }
        return textBuilder.toString();
    }
}
