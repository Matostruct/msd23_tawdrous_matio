package at.fhj.msd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * msd23_tawdrous_matio
 * This is a test class for the Calculator class
 * Author: Matio
 * Last Change: 02.05.2024
 */
public class CalculatorTest {

    Calculator calculator;

    // Setup and teardown
    @BeforeEach
    public void setUp() {
        System.out.println("Setting up the test");
        calculator = new Calculator();
    }
    @BeforeAll
    public static void setUpAll() {
        System.out.println("Setting up all tests");
    }
    @AfterEach
    public void tearDown() {
        System.out.println("Tearing down the test");
        calculator = null;
    }
    @AfterAll
    public static void tearDownAll() {
        System.out.println("Tearing down all tests");
    }

    // Test cases
    @Test
    public void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        System.out.println("Test Add");
        System.out.println("5 + 3 = 8");
    }
    @Test
    public void testAddNegative() {
        assertEquals(-1, calculator.add(2, -3));
        System.out.println("Test Add Negative");
        System.out.println("2 + (-3) = -1");
    }
    @Test
    public void testAddBothNegative() {
        assertEquals(-5, calculator.add(-3, -2));
        System.out.println("Test Add Both Negative");
        System.out.println("-3 + (-2) = -5");
    }
    @Test
    public void testAddZero() {
        assertEquals(0, calculator.add(0, 0));
        System.out.println("Test Add Zero");
        System.out.println("0 + 0 = 0");
    }
    @Test
    public void testMinus() {
        assertEquals(1, calculator.minus(3, 2));
        System.out.println("Test Subtract");
        System.out.println("3 - 2 = 1");
    }
    @Test
    public void testMinusNegative() {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.minus(-3, 2));
        System.out.println("Test Subtract Negative");
        System.out.println("-3 - 2 = -5");
    }
    @Test
    public void testMinusBothNegative() {
        assertEquals(-1, calculator.minus(-3, -2));
        System.out.println("Test Subtract Both Negative");
        System.out.println("-3 - (-2) = -1");
    }
    @Test
    public void testMinusZero() {
        assertEquals(0, calculator.minus(0, 0));
        System.out.println("Test Subtract Zero");
        System.out.println("0 - 0 = 0");
    }
    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        System.out.println("Test Multiply");
        System.out.println("2 * 3 = 6");
    }
    @Test
    public void testMultiplyOneNegative() {
        assertEquals(-6, calculator.multiply(2, -3));
        System.out.println("Test Multiply One Negative");
        System.out.println("2 * (-3) = -6");
    }
    @Test
    public void testMultiplyBothNegative() {
        assertEquals(6, calculator.multiply(-2, -3));
        System.out.println("Test Multiply Both Negative");
        System.out.println("(-2) * (-3) = 6");
    }
    @Test
    public void testMultiplyAnythingWithZero() {
        assertEquals(0, calculator.multiply(10, 0));
        System.out.println("Test Multiply Anything With Zero");
        System.out.println("10 * 0 = 0");
    }
    @Test
    public void testMultiplyZero() {
        assertEquals(0, calculator.multiply(0, 0));
        System.out.println("Test Multiply Zero");
        System.out.println("0 * 0 = 0");
    }
    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        System.out.println("Test Divide");
        System.out.println("6 / 3 = 2");
    }
    @Test
    public void testDivideOneAndOneNegative() {
        assertEquals(-2, calculator.divide(6, -3));
        System.out.println("Test Divide Negative");
        System.out.println("6 / (-3) = -2");
    }
    @Test
    public void testDivideOneNegativeAndOne() {
        assertEquals(-2, calculator.divide(-6, 3));
        System.out.println("Test Divide One Negative And One");
        System.out.println("(-6) / 3 = -2");
    }
    @Test
    public void testDivideNegative() {
        assertEquals(2, calculator.divide(-6, -3));
        System.out.println("Test Divide Negative By Negative");
        System.out.println("(-6) / (-3) = 2");
    }
    @Test
    public void testDivideZero() {
        assertEquals(0, calculator.divide(0, 6));
        System.out.println("Test Divide Zero");
        System.out.println("0 / 6 = 0");
    }
    @Test
    public void testDivideByZero() {
        assertEquals(-999999999, calculator.divide(6, 0));
        System.out.println("Test Divide By Zero");
        System.out.println("6 / 0 = -999999999 --> should be error");
    }
    @Test
    public void testDivideZeroByZero() {
        assertEquals(-999999999, calculator.divide(0, 0));
        System.out.println("Test Divide Zero By Zero");
        System.out.println("0 / 0 = -999999999 --> should be error");
    }
    @Test
    public void testDivideNegativeByZero() {
        assertEquals(-999999999, calculator.divide(-6, 0));
        System.out.println("Test Divide Negative By Zero");
        System.out.println("(-6) / 0 = -999999999 --> should be error");
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculator.factorial(5));
        System.out.println("Test Factorial");
        System.out.println("5! = 120");
    }
    @Test
    public void testFactorialZero() {
        assertEquals(1, calculator.factorial(0));
        System.out.println("Test Factorial Zero");
        System.out.println("0! = 1");
    }
    @Test
    public void testFactorialNegative() {
        assertEquals(0, calculator.factorial(-5));
        System.out.println("Test Factorial Negative");
        System.out.println("(-5)! = 0");
    }
}