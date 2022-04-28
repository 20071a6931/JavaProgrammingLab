package com.company;
interface RAM{
     void disp();
}
interface ROM{
     void show();
}
class Mobile implements RAM,ROM{
    public void disp(){
        System.out.println("this is RAM of a mobile");
    }
    public void show(){
        System.out.println("this is ROM of a mobile");
    }
}
public class MultipleInheritance {
    public static void main(String args[]){
        Mobile obj1=new Mobile();
        obj1.disp();
        obj1.show();
    }
}
