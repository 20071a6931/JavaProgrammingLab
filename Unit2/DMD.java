package com.company;

class X{
    void display(){
        System.out.println("this is X's display method");
    }
}
class Y extends X{
    void display(){
        System.out.println("this is Y's own display method");
    }
}
public class DMD {
    public static void main(String args[]){
        Y obj=new Y();
        obj.display();
    }
}
