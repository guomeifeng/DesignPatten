/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

