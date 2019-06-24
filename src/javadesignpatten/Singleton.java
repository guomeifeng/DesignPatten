/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatten;

public class Singleton {   
    private static Singleton instance = new Singleton();// 在内部产生本类的实例化对象  
  
    public static Singleton getInstance() { // 通过静态方法返回instance对象  
        return instance;   
    }   
  
    private Singleton() { // 将构造方法封装为私有化  
    }   
  
    public void print(String s) {   
        System.out.println("Hello World!!!" + s);   
    }   

  

    public static void main(String args[]) {   
        Singleton s1 = null; // 声明对象  
        Singleton s2 = null; // 声明对象  
        Singleton s3 = null; // 声明对象  
        s1 = Singleton.getInstance(); // 取得实例化对象  
        s2 = Singleton.getInstance(); // 取得实例化对象  
        s3 = Singleton.getInstance(); // 取得实例化对象  
        s1.print("A"); // 调用方法   
        s2.print("B"); // 调用方法   
        s3.print("C"); // 调用方法   
    }   
}
/**  
 *   
 * 单例模式的实现：饿汉式,线程安全 但效率比较低  
 */  
class SingletonTest1 {   
  
    private SingletonTest1() {   
    }   
  
    private static final SingletonTest1 instance = new SingletonTest1();   
  
    public static SingletonTest1 getInstancei() {   
        return instance;   
    }   
  
}  
/**  
 * 单例模式的实现：饱汉式,非线程安全   
 *   
 */  
class SingletonTest2 {   
    private SingletonTest2() {   
    }   
  
    private static SingletonTest2 instance;   
  
    public static SingletonTest2 getInstance() {   
        if (instance == null)   
            instance = new SingletonTest2();   
        return instance;   
    }   
}  
/**  
 * 线程安全，但是效率非常低  
 * @author vanceinfo  
 *  
 */  
class SingletonTest3 {   
    private SingletonTest3() {   
    }   
  
    private static SingletonTest3 instance;   
  
    public static synchronized SingletonTest3 getInstance() {   
        if (instance == null)   
            instance = new SingletonTest3();   
        return instance;   
    }   
}  
/**  
 * 线程安全  并且效率高  
 *  
 */  
class SingletonTest4 {   
    private static SingletonTest4 instance;   
  
    private SingletonTest4() {   
    }   
  
    public static SingletonTest4 getIstance() {   
        if (instance == null) {   
            synchronized (SingletonTest4.class) {   
                if (instance == null) {   
                    instance = new SingletonTest4();   
                }   
            }   
        }   
        return instance;   
    }   
} 