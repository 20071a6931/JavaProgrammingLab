package com.company;
import java.util.*;
public class Sort {

    public static void main(String[] args) {
        List <String> list=new ArrayList<String>();
    Scanner read=new Scanner(System.in);
    int n = read.nextInt();
    for (int i=0;i<n;i++)
    {
        list.add(read.next());
    }
    Collections.sort(list);

    for (int i = 0; i <n; i++) {
            System.out.println(list.get(i));
    }

    }
}
