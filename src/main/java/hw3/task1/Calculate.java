package hw3.task1;

/**
 * 1. Написать класс Калькулятор (необобщенный),
 * который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract().
 * Параметры этих методов – два числа разного типа,
 * над которыми должна быть произведена операция.
 */
public class Calculate {

    public static <N extends Number> double sum(N num1, N num2) {

        return num1.doubleValue() + num2.doubleValue();
    }
    public static <N extends Number> double subtract(N num1, N num2) {

        return num1.doubleValue() - num2.doubleValue();
    }

    public static <N extends Number> double multi(N num1, N num2) {


        return num1.doubleValue() * num2.doubleValue();
    }

    public static <N extends Number> double div(N num1, N num2) {
        if(num2.doubleValue() == 0){
            throw new ArithmeticException("Делить на ноль нельзя.");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}
