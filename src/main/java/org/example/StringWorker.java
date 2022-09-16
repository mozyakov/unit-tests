package org.example;

import java.util.Arrays;
import java.util.Locale;

public class StringWorker {

    public static int getCountCharacter(String words, Character symbol) {
        String symbolAsString = String.valueOf(symbol);
        Long count = Arrays.stream(words.toLowerCase(Locale.ROOT).split(""))
                .filter(symbolAsString::equals)
                .count();

        return count.intValue();
    }
}
