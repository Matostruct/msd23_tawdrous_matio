package at.fhj.msd;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * msd23_tawdrous_matio
 * This is the main class that will run the calculator
 * Author: Matio
 * Last Change: 18.04.2024
 */
public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Logger logger = LogManager.getLogger();
        logger.info("Starting the calculator");
        System.out.println("Add: " + c.add(1,1));
        System.out.println("Minus: " + c.minus(2,2));
        System.out.println("Multiply: " + c.multiply(3,3));
        System.out.println("Divide: " + c.divide(4,4));
        System.out.println("Factorial: " + c.factorial(5));
        logger.error("Stopping the calculator");
        System.out.println("-------------------------------------");
        System.out.println("Matio Tawdrous");
        System.out.println("-------------------------------------");
    }
}
