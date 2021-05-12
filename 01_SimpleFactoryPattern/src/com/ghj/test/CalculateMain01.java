package com.ghj.test;

import java.util.Scanner;
/**
 * @program: 01_SimpleFactoryPattern
 * @description: 加减乘除运算类
 * @author: 小江
 * @create: 2021-05-11 21:35
 **/
public class CalculateMain01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入数字A
        System.out.print("请输入数字A:");
        String A = scanner.next();
        //输入运算符
        System.out.print("请选择运算符(+ - * /):");
        String B = scanner.next();
        //输入数字C
        System.out.print("请输入数字C:");
        String C = scanner.next();
        String D = null;
        if ("+".equals(B)) {
            //加法
            D = String.valueOf(Integer.parseInt(A) + Integer.parseInt(C));
        } else if ("-".equals(B)) {
            //减法
            D = String.valueOf(Integer.parseInt(A) - Integer.parseInt(C));
        } else if ("*".equals(B)) {
            //乘法
            D = String.valueOf(Integer.parseInt(A) * Integer.parseInt(C));
        } else if ("/".equals(B)) {
            //除法
            D = String.valueOf(Integer.parseInt(A) / Integer.parseInt(C));
        }
        System.out.println("计算结果是:" + D);
    }
}
