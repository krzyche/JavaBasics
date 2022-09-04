import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class LetterUpperCaseTest {

    private LetterUpperCase word;

    @BeforeEach
    void setUp() {
        word = new LetterUpperCase();
    }

    @Test
    public void returnsNonEmptyString() {
        String testWord = "test";
        assertTrue(word.changeCases(testWord).strip().isEmpty()==false, "-String is empty!-");
    }

    @Test
    public void returnOneWordStringWithUpperCases() {
        String testWord = "testing";
        assertEquals("tEsTiNg", word.changeCases(testWord));
    }

    @Test
    public void returnMultipleWordStringWithUpperCases() {
        String testWord = "testing is very important";
        assertEquals("tEsTiNg iS VeRy iMpOrTaNt", word.changeCases(testWord));
    }

    @Test
    public void containsNumbers() {
        String testWord = "hello123";
        assertEquals("hElLo123", word.changeCases(testWord));
    }

    @Test
    public void containsLeadingSpaces() {
        String testWord = " apple";
        assertEquals("aPpLe", word.changeCases(testWord));
    }



}
