import static java.lang.Double.sum;


public class Main {
    public static void main(String[] args) {
        // Примеры использования методов к первой задаче
        System.out.println("Сумма: " + sum(10, 5.5)); // Использование Integer и Double
        System.out.println("Умножение: " + Calculator.multiply(10, 5.5));
        System.out.println("Деление: " + Calculator.divide(10, 5.5));
        System.out.println("Вычитание: " + Calculator.subtract(10, 5.5));

        System.out.println("Сумма: " + sum(10.5, 5)); // Использование Double и Integer
        System.out.println("Умножение: " + Calculator.multiply(10.5, 5));
        System.out.println("Деление: " + Calculator.divide(10.5, 5));
        System.out.println("Вычитание: " + Calculator.subtract(10.5, 5));
        System.out.println();

        // Примеры использования метода для второй задачи
        Integer[] array1 = {1, 2, 3, 4};
        Integer[] array2 = {1, 2, 3, 4};
        Integer[] array3 = {1, 2, 3, 5};

        System.out.println(ArrayComparator.compareArrays(array1, array2)); // true
        System.out.println(ArrayComparator.compareArrays(array1, array3)); // false

        String[] stringArray1 = {"a", "b", "c"};
        String[] stringArray2 = {"a", "b", "c"};
        String[] stringArray3 = {"a", "b", "d"};

        System.out.println(ArrayComparator.compareArrays(stringArray1, stringArray2)); // true
        System.out.println(ArrayComparator.compareArrays(stringArray1, stringArray3)); // false
        System.out.println();

        // Пример использования класса Pair для третьей задачи
        Pair<String, Integer> pair = new Pair<>("John", 30);
        System.out.println("Первый элемент: " + pair.getFirst());
        System.out.println("Второй элемент: " + pair.getSecond());
        System.out.println("Строковое представление пары: " + pair.toString());

    }
}