package com.ghj.example01.test2;

import com.ghj.example01.test2.entity.Calculate;
import com.ghj.example01.test2.factory.AdditionImpl;
import com.ghj.example01.test2.factory.DivisionImpl;
import com.ghj.example01.test2.factory.MultiplicationImpl;
import com.ghj.example01.test2.factory.SubtractionImpl;
import com.ghj.example01.test2.factory.port.Factory;

import java.util.Scanner;

/**
 * @program: 05_FactoryMethodPattern
 * @description: 客户端
 * @author: 小江
 * @create: 2021-05-15 19:44
 **/

public class Main {
    public static void main(String[] args) {
        Factory operFactory1 = new AdditionImpl();
        Factory operFactory2 = new SubtractionImpl();
        Factory operFactory3 = new MultiplicationImpl();
        Factory operFactory4 = new DivisionImpl();
        Calculate cc1 = operFactory1.createCalculate();
        Calculate cc2 = operFactory2.createCalculate();
        Calculate cc3 = operFactory3.createCalculate();
        Calculate cc4 = operFactory4.createCalculate();
        boolean flag = true;
        do {
            Scanner scanner = new Scanner(System.in);
            //抛出NumberFormatException异常，判断输入的是否为数字
            try{
                //输入第一个数字
                System.out.print("请输入第一个数字:");
                double num1 = Double.parseDouble(scanner.next());
                cc1.setNumberA(num1);
                cc2.setNumberA(num1);
                cc3.setNumberA(num1);
                cc4.setNumberA(num1);
                //输入运算符
                System.out.print("请选择运算符(+ - * /):");
                String operator = scanner.next();
                if ("+".equals(operator) || "-".equals(operator) || "*".equals(operator) || "/".equals(operator)) {
                    //输入第二个数字
                    System.out.print("请输入第二个数字:");
                    double num2 = Double.parseDouble(scanner.next());
                    cc1.setNumberB(num2);
                    cc2.setNumberB(num2);
                    cc3.setNumberB(num2);
                    cc4.setNumberB(num2);
                    if ("+".equals(operator)){
                        //加法工厂
                        double result = cc1.getResult();
                        System.out.println("和为:"+result);
                        break;
                    }else if ("-".equals(operator)){
                        //减法工厂
                        double result = cc2.getResult();
                        System.out.println("差为:"+result);
                        break;
                    }else if ("*".equals(operator)){
                        //乘法工厂
                        double result = cc3.getResult();
                        System.out.println("积为:"+result);
                        break;
                    }else if ("/".equals(operator)){
                        //除法工厂
                        if (!"0".equals(num2)){
                            double result = cc4.getResult();
                            System.out.println("商为:"+result);
                            break;
                        }else{
                            System.out.println("除数不能为0");
                        }
                    }
                }else{
                    System.out.println("请输入合法运算符,如+ - * /符号");
                }
            }catch (NumberFormatException e) {
                System.out.println("格式不正确，请输入数字!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (flag);
    }
}
