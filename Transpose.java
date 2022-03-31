package com.company;
import java.util.*;
public class Transpose {
    public static void main(String args[]){
        Scanner read=new Scanner(System.in);
        int mat1[][]=new int[100][100];
        int mat2[][]=new int[100][100];
        System.out.println("enter size of matrix --> row and column");
        int m=read.nextInt();
        int n=read.nextInt();
        System.out.println("enter matrix elements");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                mat1[i][j]=read.nextInt();
            }
        }
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                mat2[j][i]=mat1[i][j];
            }
        }
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }


    }
}
