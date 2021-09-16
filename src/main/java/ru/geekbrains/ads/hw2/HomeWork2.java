package ru.geekbrains.ads.hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class HomeWork2 {

    public static void main(String[] args) {
        int n = 100_000;
        Random random = new Random();
        MyArrayList<Integer> malSS = new MyArrayList<>(n);
        MyArrayList<Integer> malIS = new MyArrayList<>(n);
        MyArrayList<Integer> malBS = new MyArrayList<>(n);
        int rand;
        for (int i = 0; i < n; i++) {
            rand=random.nextInt(n);
            malSS.add(rand);
            malIS.add(rand);
            malBS.add(rand);
        }
        long a = System.currentTimeMillis();
        malSS.selectionSort();
        System.out.println("Время работы сортировки методом выбора: "+(System.currentTimeMillis() - a)+"ms.");
        a = System.currentTimeMillis();
        malIS.insertionSort();
        System.out.println("Время работы сортировки вставками: "+(System.currentTimeMillis() - a)+"ms.");
        a = System.currentTimeMillis();
        malBS.bubbleSort();
        System.out.println("Время работы пузырьковой сортировки: "+(System.currentTimeMillis() - a)+"ms.");
    }

}
