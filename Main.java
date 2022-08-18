package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Составьте ArrayList из набора чисел 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4 и произведите над ним следующие действия:
 * <p>
 * Отфильтруйте положительные числа.
 * Найдите среди этих положительных чисел четные.
 * Отсортируйте отфильтрованные числа в порядке возрастания.
 * Выведите результат на экран.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            arrList.add((int)(Math.random()*(200+1)-100));
        }

        System.out.println(arrList);

        arrList.stream().filter(e -> e > 0)
                .filter(e -> e % 2 == 0)
                .sorted(Integer::compareTo)
                .forEach(e -> System.out.print(" " + e));
    }
}
