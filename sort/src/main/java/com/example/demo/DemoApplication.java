package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    // Thuật toán bubbleSort
    public static void bubbleSort(int[] array) {
        int length = array.length;
        // Thuật toán này sẽ hoán đổi 2 ví trí liền kề ở mảng với nhau
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println("temp: " + temp);
                }
            }
        }
    }

    // Thuật toán Selection Sort(Sắp xếp chọn)
    public static void selectionSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int positionMin = i;
            // step 1: Tìm ra phần tử bé nhất trong mảng
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[positionMin]) {
                    positionMin = j;
                    System.out.println("min :" + array[positionMin]);
                }
            }
            // step 2:
            int temp = array[positionMin];
            System.out.println("tem: " + temp);
            array[positionMin] = array[i];
            System.out.println("array[positionMin]: " + array[positionMin]);
            array[i] = temp;
            System.out.println("array[i]: " + array[i]);
        }
    }

    public static void main(String[] args) {
        int[] arrayBubbleSort = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arrayBubbleSort);
        System.out.println("Output bubbleSort :");
        for (int num : arrayBubbleSort) {
            System.out.print(num + " " + "\n");
        }
        // =============================
        int[] arrSelectionSort = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(arrSelectionSort);
        System.out.println("Output selectionSort :");
        for (int num : arrSelectionSort) {
            System.out.print(num + " " + "\n");
        }
        SpringApplication.run(DemoApplication.class, args);
    }

}
