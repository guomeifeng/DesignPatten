/*
所谓抽象工厂模式就是提供一个接口，用于创建相关或者依赖对象的家族，而不需要明确指定具体类。他允许客户端使用抽象的接口来创建一组相关的产品，
而不需要关系实际产出的具体产品是什么。这样一来，客户就可以从具体的产品中被解耦。它的优点是隔离了具体类的生成，使得客户端不需要知道什么被创建了，
而缺点就在于新增新的行为会比较麻烦，因为当添加一个新的产品对象时，需要更加需要更改接口及其下所有子类。其UML结构图如下：
 */
package javadesignpatten;

//抽象工厂模式
public class AbstractFactory {

    public static void main(String args[]) {
        IFactory1 bigfactory = new BigFactory1();
        IFactory1 smallfactory = new BigFactory1();
        bigfactory.producePhone().run();
        bigfactory.produceHeadset().play();
        smallfactory.producePhone().run();
        smallfactory.produceHeadset().play();
    }
}
//抽象产品*2
    interface Headset {

        void play();
    }
//抽象产品

    interface MeizuPhone1 {

        void run();
    }
//具体产品*2*2

    class PRO51 implements MeizuPhone1 {

        @Override
        public void run() {
            System.out.println("我是一台PRO5");
        }
    }

    class MX51 implements MeizuPhone1 {

        @Override
        public void run() {
            System.out.println("我是一台MX5");
        }
    }

    class EP21 implements Headset {

        @Override
        public void play() {
            System.out.println("我是一副EP21");
        }
    }

    class EP30 implements Headset {

        @Override
        public void play() {
            System.out.println("我是一台EP30");
        }
    }
//抽象工厂

    interface IFactory1 {

        MeizuPhone1 producePhone();

        Headset produceHeadset();
    }
//具体工厂*2

    class BigFactory1 implements IFactory1 {

        @Override
        public MeizuPhone1 producePhone() {
            return new PRO51();
        }

        @Override
        public Headset produceHeadset() {
            return new EP30();
        }
    }
//具体工厂*2

    class SmallFactory1 implements IFactory1 {

        @Override
        public MeizuPhone1 producePhone() {
            return new MX51();
        }

        @Override
        public Headset produceHeadset() {
            return new EP21();
        }
    }

