package com.company;

class S1
{
    void display(){

        System.out.println("This is parent class method");
    }
}
class T1 extends S{
    void display(){

        System.out.println("This is child class method");
    }
}
public class MoverRiding {
    public static void main(String args[]){
        S1 d=new S1();
        T1 u=new T1();
        d.display();
        u.display();
    }
}
