package org.kester.section_7;
//
//        Use TDD to write a program that takes a String of two words and creates a “spoonerism” of
//        them. A spoonerism is when the ﬁrst letters or phonemes of two words are transposed. An
//        example would be “crushing blow” -> “blushing crow” or “my bad” -> “by mad”. Use
//        these examples for test use-cases.
//        I made a simple program - just swapping two first letters.

import org.junit.platform.engine.support.discovery.SelectorResolver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestingCode_3 {

    public String doSpoonerism(String word) {
        String word1="";
        String word2="";
        String regex = "(?<word1>\\w*)\\s*(?<word2>\\w*)\\s*.*";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(word);
        if (mat.matches()) {
            word1 = mat.group("word1").toLowerCase();
            word2 = mat.group("word2").toLowerCase();
            if (word2.isBlank()) {
            return "Error. Insufficient number of words!";
            }
        }
        StringBuilder word1Str = new StringBuilder(word1);
        word1Str.replace(0,2,word2.substring(0,2)).setCharAt(0,word2.toUpperCase().charAt(0));
        StringBuilder word2Str = new StringBuilder(word2);
        word2Str.replace(0,2, word1.substring(0,2)).setCharAt(0,word1.toLowerCase().charAt(0));
        return word1Str + " " + word2Str;

    }


}
