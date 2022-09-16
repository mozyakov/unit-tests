package org.example;

import org.junit.jupiter.api.*;

@DisplayName("Тестирование: MathExample")
class MathExampleTest {

    private MathExample mathExample;

    @BeforeEach
    void setUp() {
        mathExample = new MathExample(2, 2);
        System.out.println("Вызываюсь до выполнения теста");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Вызываюсь после вызова теста");
    }


    @BeforeAll
    static void setUpApp() {
        System.out.println("Запускаюсь до выполнения всех тестов...");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Запускаюсь после выполнения всех тестов...");
    }

    @Test
    @DisplayName("Тестирование суммы (a + b)")
    void sum() {
        Assertions.assertEquals(4, mathExample.sum());
    }

    @Test
    @DisplayName("Тестирование разности (a - b)")
    void diffAB() {
        Assertions.assertEquals(0, mathExample.diffAB());
    }

    @Test
    @DisplayName("Тестирование разности (b - a)")
    void diffBA() {
        Assertions.assertEquals(0, mathExample.diffBA());
    }

    @Test
    @DisplayName("Тестировавние умножения (a * b)")
    void multiplication() {
        Assertions.assertEquals(4, mathExample.multiplication());
    }

    @Test
    @DisplayName("Тестирование деления (a/b)")
    void division() {
        Assertions.assertEquals(1, mathExample.division());
    }

    @Test
    @DisplayName("Тестирование деления (a/0)")
    void division_whenSecondArgumentIsZero() {
        MathExample mathExample = new MathExample(3, 0);
        Assertions.assertThrows(ArithmeticException.class, mathExample::division);
    }
}