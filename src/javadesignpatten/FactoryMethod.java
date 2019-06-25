//作为抽象工厂模式的孪生兄弟，工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个，也就是说工厂方法模式让实例化推迟到子类。
//
//工厂方法模式非常符合“开闭原则”，当需要增加一个新的产品时，我们只需要增加一个具体的产品类和与之对应的具体工厂即可，无须修改原有系统。
//同时在工厂方法模式中用户只需要知道生产产品的具体工厂即可，无须关系产品的创建过程，甚至连具体的产品类名称都不需要知道。虽然他很好的符合了“开闭原则”，
//但是由于每新增一个新产品时就需要增加两个类，这样势必会导致系统的复杂度增加。其UML结构图：
//

package javadesignpatten;

//工厂方法模式
public class FactoryMethod {
    public static void main(String args[]){
        IFactory bigfactory;
        bigfactory = new SmallFactory();
        bigfactory.produce().run();
        bigfactory = new BigFactory();
        bigfactory.produce().run();
    }
}
//抽象产品
interface MeizuPhone{
    void run();
}
//具体产品*2
class PRO5 implements MeizuPhone{
    @Override
    public void run() {
        System.out.println("我是一台PRO5");
    }
}
class MX5 implements MeizuPhone{
    @Override
    public void run() {
        System.out.println("我是一台MX5");
    }
}
interface IFactory{//抽象的工厂
    MeizuPhone produce();
}
//工厂*2
class BigFactory implements IFactory{
    @Override
    public MeizuPhone produce() {
        return new PRO5();
    }
}
class SmallFactory implements IFactory{
    @Override
    public MeizuPhone produce() {
        return new MX5();
    }
}
