package com.company;
class S
{
    int a;
    String name;
    void display(int a,String name){
        this.a=a;
        this.name=name;
        System.out.println(this.a);
        System.out.println(this.name);
    }
}
class T extends S{

}
public class SInheritance {
    public static void main(String args[]){
        S demo=new S();
        demo.display(6,"uday");
        T demo1=new T();
        demo1.display(8,"kiran");
    }
}
