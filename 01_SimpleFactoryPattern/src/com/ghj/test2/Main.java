package com.ghj.test2;

import java.util.Scanner;
/**
 * @program: 01_SimpleFactoryPattern
 * @description: 客户端
 * @author: 小江
 * @create: 2021-05-11 21:43
 **/
public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        do {
            Scanner scanner = new Scanner(System.in);
            //抛出NumberFormatException异常，判断输入的是否为数字
            try {
                //输入第一个数字
                System.out.print("请输入第一个数字:");
                String numberA = scanner.next();
                //输入运算符
                System.out.print("请选择运算符(+ - * /):");
                String operator = scanner.next();
                if ("+".equals(operator) || "-".equals(operator) || "*".equals(operator) || "/".equals(operator)) {
                    //输入第二个数字
                    System.out.print("请输入第二个数字:");
                    String numberB = scanner.next();
                    double result = Calculate.getResult(Double.parseDouble(numberA), Double.parseDouble(numberB), operator);
                    System.out.println("计算结果是:" + result);
                    break;
                }else{
                    System.out.println("请输入合法运算符,如+ - * /符号");
                }
            } catch (NumberFormatException e) {
                System.out.println("格式不正确，请输入数字!");
            }
        } while (flag);
    }
}
