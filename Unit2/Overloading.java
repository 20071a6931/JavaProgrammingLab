package com.company;

class Add
{
    public Add(int a,int b){
        System.out.println(a+b);
    }
    public Add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class Overloading {
   public static void main(String args[]){

       Add var1=new Add(2,3);
       Add var2=new Add(2,3,4);

   }
}
