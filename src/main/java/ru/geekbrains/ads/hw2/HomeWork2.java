package ru.geekbrains.ads.hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class HomeWork2 {

    public static void main(String[] args) {
        int n = 10;
        Random random = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>(n);
        for (int i = 0; i < n; i++) {
            mal.add(random.nextInt(10));
        }
        System.out.println(mal);
//        mal.selectionSort();
//        mal.insertionSort();
        mal.bubbleSort();
        System.out.println(mal);
    }

}
