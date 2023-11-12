package hw3.task3;

/**
 * 3. Напишите обобщенный класс Pair,
 * который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond()
 * для получения значений каждого из составляющих пары,
 * а также переопределение метода toString(), возвращающее строковое представление пары.
 */

public class Pair<N, T> {
    public N first;
    public T second;

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "One");
        Pair<String, Integer> pair1 = new Pair<>("Two", 2);

        System.out.println(pair);
        System.out.println(pair1);

    }

    public Pair(N first, T second) {
        this.first = first;
        this.second = second;
    }

    public N getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair { " +
                "first = " + first +
                ", second = " + second +
                '}';
    }
}
