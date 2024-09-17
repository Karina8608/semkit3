public class Calculator {

    // Обобщенный статический метод для сложения
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    // Обобщенный статический метод для умножения
    public static <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    // Обобщенный статический метод для деления
    public static <T extends Number> double divide(T num1, T num2) {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    // Обобщенный статический метод для вычитания
    public static <T extends Number> double subtract(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
}
