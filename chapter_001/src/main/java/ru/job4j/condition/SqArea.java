package ru.job4j.condition;

/**
 * Класс для вычисления площади прямоугольника
 */
public class SqArea {
    /**
     * Метод вычисления площади прямоуг
     *
     * @param p (периметр)
     * @param k (отношение ширины к высоте)
     * @return (метод возвращает значение площади прямоугольника)
     */
    public static int square(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = h * k;
        int area = h * w;
        return area;
    }
    public static void main(String[] args) {
        int result1 = square(6, 2);
        System.out.println(" p = 6, k = 6, s = 2, real = " + result1);
    }
}
