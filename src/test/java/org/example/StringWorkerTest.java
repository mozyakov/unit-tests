package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Параметризированные тесты")
class StringWorkerTest {

    @DisplayName("Провериить количество вхождений буквы - в слово")
    @ParameterizedTest
    @MethodSource("getArguments")
    void getCountCharacter(String words, Character symbol, int expectedResult) {
        Assertions.assertEquals(expectedResult, StringWorker.getCountCharacter(words, symbol));
    }


    @ParameterizedTest
    @ValueSource(strings = {"mama", "papa", "banan"})
    void getCountCharacter(String input) {
        Assertions.assertEquals(2, StringWorker.getCountCharacter(input, 'a'));
    }

    @Test
    void getCountCharacter() {
        Assertions.assertThrows(NullPointerException.class, () -> StringWorker.getCountCharacter(null, 'a'));
    }

    @Test
    void getCountCharacter_whenWordIsEmpty() {
        Assertions.assertEquals(0, StringWorker.getCountCharacter("", 'a'));
    }


    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("Mama", 'm', 2),
                Arguments.of("Mama", 'a', 2),
                Arguments.of("Banana", 'a', 3)
        );
    }
}