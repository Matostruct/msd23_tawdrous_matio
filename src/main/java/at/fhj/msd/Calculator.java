package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * msd23_tawdrous_matio
 * This is a simple Calculator Class
 * Author: Matio
 * Last Change: 18.04.2024
 */

/**
 *  This class is a simple calculator class that can perform basic arithmetic operations
 */
public class Calculator {
    /**
     * This is the logger object that is used to log messages to the console
     */
    private static final Logger logger = LogManager.getLogger();
    /**
     * This method adds two numbers together
     * @param number1 the first number
     * @param number2 the second number
     * @return the sum of the two numbers
     */
    public double add (double number1, double number2) {
        logger.debug("Adding " + number1 + " and " + number2);
        return number1 + number2;
    }
    /**
     * This method subtracts the second number from the first number
     * @param number1 the first number
     * @param number2 the second number
     * @return the difference of the two numbers
     */
    public double minus (double number1, double number2) {
        logger.debug("Subtracting " + number1 + " and " + number2);
        return number1 - number2;
    }
    /**
     * This method multiplies two numbers together
     * @param number1 the first number
     * @param number2 the second number
     * @return the product of the two numbers
     */
    public double multiply (double number1, double number2) {
        logger.debug("Multiplying " + number1 + " and " + number2);
        return number1 * number2;
    }
    /**
     * This method divides the first number by the second number
     * @param number1 the first number
     * @param number2 the second number
     * @return the quotient of the two numbers
     * @throws ArithmeticException if the second number is zero
     */
    public double divide (double number1, double number2) {
        if (number2 == 0) {
            logger.error("Division by zero is not allowed");
            throw new ArithmeticException("Division by zero is not allowed");
        }
        logger.debug("Dividing " + number1 + " by " + number2);
        return number1 / number2;
    }
    /**
     * This method calculates the factorial of a number
     * @param number the number to calculate the factorial of
     * @return the factorial of the number
     */
    public int factorial (int number) {
        if (number < 0) {
            return 0;
        }
        logger.debug("Calculating the factorial of " + number);
        return number == 0 ? 1 : number * factorial(number - 1);
    }
}
