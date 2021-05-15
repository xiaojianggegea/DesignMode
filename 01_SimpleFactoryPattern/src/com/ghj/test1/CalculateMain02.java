package com.ghj.test1;

import java.util.Scanner;
/**
 * @program: 01_SimpleFactoryPattern
 * @description: 运算基类
 * @author: 小江
 * @create: 2021-05-11 21:40
 **/
public class CalculateMain02 {
    public static void main(String[] args) {
        boolean flag = true;
        do {
            Scanner scanner = new Scanner(System.in);
            //输入数字A
            //抛出NumberFormatException异常，判断输入的是否为数字
            try{
                System.out.print("请输入数字A:");
                double A = Double.parseDouble(scanner.next());
                //输入运算符
                System.out.print("请选择运算符(+ - * /):");
                String B = scanner.next();
                String D = null;
                //判断是否输入正确的运算符
                if ("+".equals(B) || "-".equals(B) || "*".equals(B) || "/".equals(B)) {
                    //输入数字C
                    System.out.print("请输入数字C:");
                    double C = Double.parseDouble(scanner.next());
                    if ("+".equals(B)) {
                        //加法
                        D = String.valueOf(Double.parseDouble(String.valueOf((A) + C)));
                    } else if ("-".equals(B)) {
                        //减法
                        D = String.valueOf(Double.parseDouble(String.valueOf((A) - C)));
                    } else if ("*".equals(B)) {
                        //乘法
                        D = String.valueOf(Double.parseDouble(String.valueOf((A) * C)));
                    } else if ("/".equals(B)) {
                        //除法
                        //判断除法中除数不能为0
                        if (!"0".equals(C)){
                            D = String.valueOf(Double.parseDouble(String.valueOf((A) / C)));
                        }else{
                            System.out.println("除数不能为0");
                        }
                    }
                    System.out.println("计算结果是:" + D);
                    break;
                } else {
                    System.out.println("请输入合法运算符,如+ - * /符号");
                }
            }catch (NumberFormatException e){
                System.out.println("格式不正确，请输入数字!");
            }
        } while (flag);
    }
}
