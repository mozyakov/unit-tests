package org.example;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {

    private Connection connection;

    @BeforeEach
    void setUp() {
        connection = new Connection("url", "login", "password");
        connection.open();
    }

    @AfterEach
    void tearDown() {
        connection.close();
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void getConnection() {
        Assertions.assertTrue(connection.getConnection());
    }
}