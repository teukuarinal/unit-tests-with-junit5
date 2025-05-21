package com.appstest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Test")
class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void beforeEachTestMethod() {
        calculator = new Calculator();
        System.out.println("Before each test method");
    }

    @DisplayName("Test Integer Subtract")
    @Test
    void testIntegerSubtract_WhenEightIsSubtractedByFour_ShouldReturnFour() {
        System.out.println("Running 8-4 = 4");
        // Arrange
        int firstNumber = 8;
        int secondNumber = 4;
        int expectedResult = 4;

        // Act
        int result = calculator.integerSubtraction(firstNumber, secondNumber);

        // Assert
        assertEquals(expectedResult, result, "8-4 did not produce 4");
    }

    @DisplayName("Test Integer Add")
    @Test
    void testAdd_WhenTwoIsAddedByFive_ShouldReturnSeven() {
        System.out.println("Running 2+5 = 7");
        // Arrange
        int firstNumber = 2;
        int secondNumber = 5;
        int expectedResult = 7;

        // Act
        int result = calculator.integerAdd(firstNumber, secondNumber);

        // Assert
        assertEquals(expectedResult, result, "2+5 did not produce 7");
    }

    @DisplayName("Test Integer Divide")
    @Test
    void testIntegerDivide_WhenSixIsDividedByTwo_ShouldReturnThree() {
        System.out.println("Running 6/2 = 3");
        // Arrange
        int devidend = 6;
        int divisor = 2;
        int expectedResult = 3;

        // Act
        int result = calculator.integerDivide(devidend, divisor);

        // Assert
        assertEquals(expectedResult, result, "6/2 did not produce 3");
    }

    @DisplayName("Test Devide By Zero")
    @Test
    void testIntegerDevide_WhenDividingByZero_ShouldThrowArithmeticException() {
        System.out.println("Running 6/0 = ArithmeticException");
        // Arrange
        int devidend = 6;
        int divisor = 0;
        String expectedExceptionMessage = "/ by zero";

        // Act & Assert
        ArithmeticException actualException = assertThrows(ArithmeticException.class, () -> {
            calculator.integerDivide(devidend, divisor);
        }, "Division by zero should have thrown an Arithmetic exception.");

    // Assert
    assertEquals(expectedExceptionMessage, actualException.getMessage(),
        "Unexpected exception message");
    }

    @DisplayName("Test Integer Multiply")
    @Test
    void testIntegerMultiply_WhenSixIsMultipliedByTwo_ShouldReturnTwelve() {
        System.out.println("Running 6*2 = 12");
        // Arrange
        int firstNumber = 6;
        int secondNumber = 2;
        int expectedResult = 12;

        // Act
        int result = calculator.integerMultiply(firstNumber, secondNumber);

        // Assert
        assertEquals(expectedResult, result, "6*2 did not produce 12");
    }

    @Disabled("Not ready yet")
    @DisplayName("Test Integer Percentage")
    @Test
    void testPercentage_WhenOneHundredMultipliedByTenPercen_ShouldReturnTen() {
    }

    @DisplayName("Test integer substraction [minuend, subtrahend, expectedResult]")
    @ParameterizedTest
//    @MethodSource("integerSubstractionInputParameters")
    @CsvSource({
            "33, 1, 32",
            "57, 12, 45",
            "482, 82, 400"})
    void integerSubstraction(int minuend, int subtrahend, int expectedResult) {
        System.out.println("Running Test " + minuend + "-" + subtrahend + " = " + expectedResult );

        int actualResult = calculator.integerSubtraction(minuend, subtrahend);
        assertEquals(expectedResult, actualResult,
                ()->minuend + "-" + subtrahend + "did not produce " + expectedResult);
    }

//    public static Stream<Arguments> integerSubstractionInputParameters() {
//        return Stream.of(
//                Arguments.of(33, 1, 32),
//                Arguments.of(57, 12, 45),
//                Arguments.of(482, 82, 400)
//        );
//    }
}