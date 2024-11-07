package app.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();



    @Test
    void sum() {
        assertEquals(4, calculator.sum(2,2));
    }

    @Test
    void minus() {
        assertEquals(15, calculator.minus(30,15));
    }

    @Test
    void multiplication() {
        assertEquals(25, calculator.multiplication(5,5));
    }

    @Test
    void division() {
        assertEquals(4, calculator.division(16,4));
    }
}