package com.company;
class Demo{

    protected void finalize(){
        System.out.println("Finalize method invoked");
    }
}
public class Finalize {

    public static void main(String args[]){
        Demo dem=new Demo();
        dem=null;
        System.gc();
    }
}
