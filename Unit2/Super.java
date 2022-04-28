package com.company;

class Parent{
    Parent(int a,int b){
        System.out.println("this is parent class constructor");
        System.out.println("sum:"+(a+b));
    }
}
class Child extends Parent{
    Child(){
        super(10,20);
        System.out.println("child class constructor");
    }
}

public class Super {
    public static void main(String args[]){
        Child ob=new Child();
    }
}
