/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatten;

public class LSPtest
{
    public static void main(String[] args)
    {
        Bird bird1=new Swallow();
        Bird bird2=new BrownKiwi();
        bird1.setSpeed(120);
        bird2.setRunSpeed(50);
        System.out.println("如果飞行/奔跑300公里：");
        try
        {
            System.out.println("燕子将飞行"+bird1.getFlyTime(300)+"小时.");
            System.out.println("几维鸟将奔跑"+bird2.getRunTime(300)+"小时。");
        }
        catch(Exception err)
        {
            System.out.println("发生错误了!");
        }
    }
}

class Animal1{
    double runSpeed;
    public void setRunSpeed(double speed)
    {
        runSpeed=speed;
    }
    public double getRunTime(double distance)
    {
        return(distance/runSpeed);
    }
}

//鸟类
class Bird extends Animal1
{
    double flySpeed;
    public void setSpeed(double speed)
    {
        flySpeed=speed;
    }
    public double getFlyTime(double distance)
    {
        return(distance/flySpeed);
    }
}
//燕子类
class Swallow extends Bird{}
//几维鸟类
class BrownKiwi extends Bird
{
    @Override
    public void setSpeed(double speed)
    {
           flySpeed=0;
    }
}