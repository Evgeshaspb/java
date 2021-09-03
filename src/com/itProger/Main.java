package com.itProger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Минимум и максимум
//        ортировка массива
//        Создайте программу, которая будет
//        просить пользователя ввести размер массива,
//                а также все значения элементов для массива.
//
//
//
//        После ввода данных массив будет сортироваться
//        в порядке возрастания элементов. В конце
//        программы выведите получившийся массив на экран.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int lenArr = in.nextInt();
        int[] arr = new int[lenArr];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Введите значение массива: ");
            arr[i] = in.nextInt();
        }
        int num;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    num = arr[j];
                    arr[j] = arr[i];
                    arr[i] = num;
                }
            }
        }

        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);





    }
}
