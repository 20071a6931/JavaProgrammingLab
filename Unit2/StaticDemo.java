package com.company;
class A
{
    static int a=10;
    static void some(){
        System.out.println("this is a static method");
    }
}
public class StaticDemo {

    public static void main(String args[]){
        A obj = new A();
        System.out.println(A.a);
        A.some();
    }
}
