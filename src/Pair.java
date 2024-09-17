public class Pair<T1, T2> {

    private T1 first;
    private T2 second;

    // Конструктор для инициализации пары
    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    // Метод для получения первого элемента пары
    public T1 getFirst() {
        return first;
    }

    // Метод для получения второго элемента пары
    public T2 getSecond() {
        return second;
    }

    // Метод для установки первого элемента пары
    public void setFirst(T1 first) {
        this.first = first;
    }

    // Метод для установки второго элемента пары
    public void setSecond(T2 second) {
        this.second = second;
    }

    // Переопределение метода toString() для строкового представления пары
    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
