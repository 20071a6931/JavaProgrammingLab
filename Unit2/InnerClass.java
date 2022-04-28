package com.company;

public class InnerClass {
    static class Inner{
        int a=10;
        void dis(){
            System.out.println("Inner class method");
        }
    }
    public static void main(String args[]){
        Inner obj=new Inner();
        obj.dis();
        System.out.println(obj.a);
    }
}
