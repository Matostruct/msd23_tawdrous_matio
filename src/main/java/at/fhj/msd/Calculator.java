package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * msd23_tawdrous_matio
 * This is a simple Calculator Class
 * Author: Matio
 * Last Change: 18.04.2024
 */
public class Calculator {
    private static final Logger logger = LogManager.getLogger();
    public double add (double number1, double number2) {
        logger.debug("Adding " + number1 + " and " + number2);
        return number1 + number2;
    }
    public double minus (double number1, double number2) {
        logger.debug("Subtracting " + number1 + " and " + number2);
        return number1 - number2;
    }
    public double multiply (double number1, double number2) {
        logger.debug("Multiplying " + number1 + " and " + number2);
        return number1 * number2;
    }
    public double divide (double number1, double number2) {
        if (number2 == 0) {
            logger.error("Division by zero is not allowed");
            throw new ArithmeticException("Division by zero is not allowed");
        }
        logger.debug("Dividing " + number1 + " by " + number2);
        return number1 / number2;
    }
    public int factorial (int number) {
        if (number < 0) {
            return 0;
        }
        logger.debug("Calculating the factorial of " + number);
        return number == 0 ? 1 : number * factorial(number - 1);
    }
}
