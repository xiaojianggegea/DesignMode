package com.ghj.test2;
/**
 * @program: 01_SimpleFactoryPattern
 * @description: 运算基类
 * @author: 小江
 * @create: 2021-05-11 21:42
 **/
public class Calculate {
    public static double getResult(double numberA,double numberB,String operator){
        double result = 0;
        if ("+".equals(operator)) {
            //加法
            result = numberA + numberB;
        } else if ("-".equals(operator)) {
            //减法
            result = numberA - numberB;
        } else if ("*".equals(operator)) {
            //乘法
            result = numberA * numberB;
        } else if ("/".equals(operator)) {
            //除法
            //判断除法中除数不能为0
            if (!"0".equals(numberB)){
                result = numberA / numberB;
            }else{
                System.out.println("除数不能为0");
            }
        }
        return result;
    }
}
