package com.ghj.example02.implement;

import com.ghj.example02.IStrategy;

/**
 * @program: 02_StrategyMode
 * @description: 吴国太开绿灯
 * @author: 小江
 * @create: 2021-05-14 20:35
 **/

public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("锦囊中写道:求吴国太开绿灯，放行");
    }
}
