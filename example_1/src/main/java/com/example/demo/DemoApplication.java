package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {

    //===================== Đảo ngược chuỗi ========================//
    // cách 1: Dùng vòng for chạy từ cuối chuỗi lên đầu
    public static String convertString1(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result = result + input.charAt(i);
        }
        return result;
    }

    // cách 2: Sử dụng StringBuider
    public static String convertString2(String input) {
        StringBuilder builder = new StringBuilder(input);
        String result = builder.reverse().toString();
        return result;

    }

    // cách 3: sử dụng Stack
    public static String convertString3(String input) {
        Stack stack = new Stack();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        String result = "";
        while (!stack.isEmpty()) {
            result = result + stack.pop();
        }
        return result;

    }

    // =============== Kiểm tra chuỗi đối xứng hay không ====================//
    // cách 1: Sử dụng Stack
    public static boolean kiemTraChuoiDoiXung(String input) {
        Stack stack = new Stack();
        for (int x = 0; x < input.length(); x++) {
            stack.push(input.charAt(x));
        }
        String resultStack = "";
        while (!stack.isEmpty()) {
            resultStack = resultStack + stack.pop();
        }
        System.out.println("resultStack: " + resultStack);
        if (input.equals(resultStack)) {
            return true;
        }
        return false;
    }

    // cách 2: Sử dụng queue
    public static boolean kiemTraChuoiDoiXung1(String input) {
        Queue queue = new LinkedList();
        for (int x = input.length() - 1; x >= 0; x--) {
            queue.add(input.charAt(x));
        }
        String resultStack = "";
        while (!queue.isEmpty()) {
            resultStack = resultStack + queue.remove();
        }
        System.out.println("resultStack: " + resultStack);
        if (input.equals(resultStack)) {
            return true;
        }
        return false;

    }

    // cách 3:
    public static boolean kiemTraChuoiDoiXung2(String input) {
        StringBuilder builder = new StringBuilder(input);
        String result = builder.reverse().toString();
        if (result.equals(input)) {
            return true;
        }
        return false;
    }

    //======================== Tìm phần tử lớn thứ 2 trong mảng ====================//
    public static int numberMaxInArray(int array[]) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else {
                min = array[i];
            }
        }
        return min;
    }

    //======================= Đếm chữ cái trong chuỗi xuất hiện bao nhiều lần ==============//
    public static int countString(String input, char chuCaiCanDem) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (chuCaiCanDem == (input.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    //================= Đếm các chữ cái xuất hiện trong mảng =====================//
    public static String demCacPhanTuXuatHienTrongMang(String input) {
        String result = "";
        Map<Character, Integer> map = new HashMap<>();
        for (char x : input.toCharArray()) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result += (entry.getKey() + ":" + entry.getValue()) + "\n";
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("Output đảo ngược cách 1 : " + convertString1("duy"));
        System.out.println("Output đảo ngược cách 2 : " + convertString2("levanduy"));
        System.out.println("Output đảo ngược cách 3 : " + convertString3("1234"));
        System.out.println("Output chuỗi đối xứng hay không : " + kiemTraChuoiDoiXung("123321"));
        System.out.println("Output chuỗi đối xứng hay không 1 : " + kiemTraChuoiDoiXung1("abccbac"));
        System.out.println("Output chuỗi đối xứng hay không 2 : " + kiemTraChuoiDoiXung2("01103"));
        int array[] = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println("Output số lớn thứ 2 trong mảng : " + numberMaxInArray(array));
        System.out.println("Output đếm chữ cái cần tìm cần xuất hiện trong mảng : " + countString("addsdja111", 'a'));
        System.out.println("Output đếm tất cả chữ cái xuất hiện trong mảng : \n" + demCacPhanTuXuatHienTrongMang("adsndsadxx"));
        SpringApplication.run(DemoApplication.class, args);
    }

}
