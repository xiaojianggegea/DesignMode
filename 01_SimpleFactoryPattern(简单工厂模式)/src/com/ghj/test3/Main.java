package com.ghj.test3;

import com.ghj.test3.entity.Calculate;
import com.ghj.test3.factory.OperationType;

import java.util.Scanner;

/**
 * @program: 01_SimpleFactoryPattern
 * @description: 客户端
 * @author: 小江
 * @create: 2021-05-11 21:54
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数字:");
        double numberA = scanner.nextByte();
        System.out.print("请选择运算符(+ - * /):");
        String operator = scanner.next();
        Calculate calculate = OperationType.createOperation(operator);
        System.out.print("请输入第二个数字:");
        double numberB = scanner.nextByte();
        calculate.setNumberA(numberA);
        calculate.setNumberA(numberB);
        try {
            System.out.println("计算结果是:" + calculate.getResult());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
