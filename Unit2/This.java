package com.company;
class Var
{
    int a=10;
    void display(){
        int a=20;
        System.out.println("the value of a is "+this.a);
    }
}

public class This {
    public static void main(String args[]){
        Var some=new Var();
        some.display();
    }
}
