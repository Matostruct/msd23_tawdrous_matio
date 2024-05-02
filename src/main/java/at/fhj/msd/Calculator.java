package at.fhj.msd;

/**
 * msd23_tawdrous_matio
 * This is a simple Calculator Class
 * Author: Matio
 * Last Change: 18.04.2024
 */
public class Calculator {
    public double add (double number1, double number2) {
        return number1 + number2;
    }
    public double minus (double number1, double number2) {
        return number1 - number2;
    }
    public double multiply (double number1, double number2) {
        return number1 * number2;
    }
    public double divide (double number1, double number2) {
        return number2 != 0 ? number1 / number2 : -999999999;
    }
    public double factorial (double number) {
        return 0;
    }
}
