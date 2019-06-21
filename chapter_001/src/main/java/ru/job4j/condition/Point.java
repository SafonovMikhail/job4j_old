package ru.job4j.condition;

/**
 * /**
 * * Вычисление расстояния между точками
 *
 * @author Mikhail Safonov (ms33@inbox.ru)
 * @version 2019-06-21
 */
public class Point {
    /**
     * Метод подсчёта расстояния
     *
     * @param x1;
     * @param x2;
     * @param y1;
     * @param y2;
     * @return расстояние
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        double summation = second + first;
        return Math.sqrt(summation);
    }
}
