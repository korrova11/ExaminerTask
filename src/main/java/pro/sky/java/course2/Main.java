package pro.sky.java.course2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.range;

public class Main {
    public static void main(String[] args) {
        int[] arrayInput = {1, 2, 4, 7, 3, 8, 5, 9, 10};
        System.out.println(task(arrayInput));
        System.out.println(task1(arrayInput));
    }

    public static List<Integer> task(int[] array) {
        return Arrays.stream(array)
                .skip(2)
                .limit(5)
                .map(num -> num % 2 == 0 ? num + 1 : num)
                .boxed()
                .collect(Collectors.toList());
    }

    public static List<Integer> task1(int[] array) {
        if (array.length < 7) {
            throw new RuntimeException("длина массива должна быть не менее 7");
        }
        ;
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < 7; i++) {
            if (array[i] % 2 == 0) {
                ++array[i];
            }
            ;
            list.add(array[i]);
        }
        return list;
    }


}