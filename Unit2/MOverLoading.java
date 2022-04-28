package com.company;

public class MOverLoading {
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        int s=0;
        MOverLoading d=new MOverLoading();
        s=d.sum(2,3);
        System.out.println(s);
        s=d.sum(1,2,3);
        System.out.println(s);
    }
}
