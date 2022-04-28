package com.company;

class Demo1
{
    public void sum(int ...a){
        int s=0;
        for(int i:a){
            s+=i;
        }
        System.out.println(s);
    }
}
public class VLA {
    public static void main(String args[]){
        Demo1 d=new Demo1();
        d.sum(1,2,3);
    }
}
