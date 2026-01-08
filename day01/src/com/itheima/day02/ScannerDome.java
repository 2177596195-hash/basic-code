package com.itheima.day02;

import java.util.Scanner;

public class ScannerDome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Scanner,接收键盘录入的整数
//        int num1 = sc.nextInt();
//        System.out.println(num1);
        //接收键盘录入的小数
//        double num2 = sc.nextDouble();
//        System.out.println(num2);
        //接收键盘录入的文本（字符串）
        String str = sc.next();
        System.out.println(str);
    }
}
