package com.company;
import java.util.*;
public class Grades {
    public static void main(String args[])
    {
        System.out.println("Enter percentage:");
        Scanner read=new Scanner(System.in);
        int per = read.nextInt();
        if (per>90)
        {
            System.out.println("A- Grade");
        }
        else if (per>80 && per<90)
        {
            System.out.println("B-Grade");
        }
        else if (per>70 && per<80)
        {
            System.out.println("C-Grade");
        }
        else if (per>60 && per<70)
        {
            System.out.println("D-Grade");
        }
        else if (per>50 && per<60)
        {
            System.out.println("E-Grade");
        }
        else if (per>40 && per<50)
        {
            System.out.println("F-Grade");
        }
        else
        {
            System.out.println("Fail");
        }

    }
}
