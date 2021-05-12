# DesignMode
 设计模式
# 01_简单工厂模式
<h5>eg:加减乘除计算程序</h5>
1、定义：定义一个工厂类，他可以根据参数的不同返回不同类的实例，被创建的实例通常都具有共同的父类。<br/>
2、在简单工厂模式中用于被创建实例的方法通常为静态(static)方法,因此简单工厂模式又被成为静态工厂方法(Static Factory Method)。<br/>
3、需要什么，只需要传入一个正确的参数，就可以获取所需要的对象，而无需知道其实现过程。
![](https://img2018.cnblogs.com/blog/1539112/201904/1539112-20190403232328564-1329420274.png)
<h4>结构：</h4>
Factory：工厂类，简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象。<br/>
Calculate：抽象产品类，简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。<br/>
method：具体产品类，是简单工厂模式的创建目标。<br/>
# 02_策略模式
<h5>eg:外出旅游方案</h5>
![](https://pics0.baidu.com/feed/0824ab18972bd40701c5b76f3cf38b540eb309a4.jpeg?token=3d1bffcdcaac129a56bdb69569e25815&s=49A63C72AFF1588A4050D1DF000080B3)<br/>
1、定义：定义一组算法，将每个算法封装起来，并且使他们之间可以互换。策略模式是一个简单的模式也叫做政策模式。<br/>
![](https://pics6.baidu.com/feed/d043ad4bd11373f098fcc7b31c1634fdfaed04fe.jpeg?token=e59c1839b91ea4f0ebdb6e2ee769a741)
<h4>结构：</h4>
环境类(Context):用来操作策略的上下文环境，也就是我们游客。
抽象策略类(Strategy):策略的抽象，出行方式的抽象
具体策略类(ConcreteStrategy):具体的策略实现，每一种出行方式的具体实现。
<h4>编码分析</h4>
<h5>第一步：定义抽象策略接口</h5>
package com.ghj.abstractInterface;<br/>
public interface TravelStrategy {<br/>
    public void travelStrategy();<br/>
}<br/>
<h5>第二步：具体策略类</h5>
package com.ghj.method;<br/>
import com.ghj.abstractInterface.TravelStrategy;<br/>
public class TrainStrategy implements TravelStrategy {<br/>
    @Override<br/>
    public void travelStrategy() {<br/>
        System.out.println("乘坐火车......");<br/>
    }<br/>
}<br/>
其余策略类类似<br/>
<h5>第三步：环境类的实现</h5>
package com.ghj.abstractInterface;<br/>
public class Traveler {<br/>
    TravelStrategy travelStrategy;<br/>
    public void setTravelStrategy(TravelStrategy travelStrategy) {<br/>
        this.travelStrategy = travelStrategy;<br/>
    }<br/>
    public void travelStyle(){<br/>
        travelStrategy.travelStyle();<br/>
    }<br/>
}<br/>
<h5>策略模式的优点：</h5>
我们之前在选择出行方式的时候，往往会使用if-else语句，也就是用户不选择A那么就选择B这样的一种情况。这种情况耦合性太高了，而且代码臃肿，有了策略模式我们就可以避免这种现象，
策略模式遵循开闭原则，实现代码的解耦合。扩展新的方法时也比较方便，只需要继承策略接口就好了。<br/>
上面列出的这两点算是策略模式的优点了，但是不是说他就是完美的，有很多缺点仍然需要我们去掌握和理解，客户端必须知道所有的策略类，并自行决定使用哪一个策略类。<br/>
策略模式会出现很多的策略类。context在使用这些策略类的时候，这些策略类由于继承了策略接口，所以有些数据可能用不到，但是依然初始化了。<br/>
<h5>与其他模式的区别</h5>
（1）与状态模式的区别<br/>
策略模式只是条件选择方法，只执行一次方法，而状态模式是随着状态的改变不停地更改执行方法。举个例子，就好比我们旅游，对于策略模式我们只需要选择其中一种出行方法就好了，但是状态模式不一样，可能我们到了A地点选择的是火车，到了B地点又选择飞机，根据不同的状态选择不同的出行方式。<br/>
（2）与工厂模式的区别<br/>
工厂模式是创建型模式 ，它关注对象创建，提供创建对象的接口，让对象的创建与具体的使用客户无关。 策略模式是对象行为型模式 ，它关注行为和算法的封装 。再举个例子，还是我们出去旅游，对于策略模式我们只需要选择其中一种出行方法就好，但是工厂模式不同，工厂模式是你决定哪种旅行方案后，由工厂代替你去构建具体方案（工厂代替你去买火车票）。<br/>
