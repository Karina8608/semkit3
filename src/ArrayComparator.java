import java.util.Arrays;

public class ArrayComparator {

    // Обобщенный метод для сравнения двух массивов
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        // Проверка на равную длину массивов
        if (array1.length != array2.length) {
            return false;
        }

        // Использование Arrays.equals() для сравнения массивов
        return Arrays.equals(array1, array2);
    }
}
