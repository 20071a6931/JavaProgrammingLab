package com.company;
interface AB{
    public void disp();
}
class Imp implements AB{
    public void disp(){
        System.out.println("this is implemented class method to an interface");
    }
}
public class Interfaces {
    public static void main(String args[]){
        Imp obj1=new Imp();
        obj1.disp();
    }

}
