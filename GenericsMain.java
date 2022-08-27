package com.bridgelabz;

import java.util.Scanner;

public class GenericsMain {
    public int findMax(Integer n1,Integer n2,Integer n3){
        Integer max = n1;
        if(n2.compareTo(max)>0) max = n2;
        if(n3.compareTo(max)>0) max = n3;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();
        System.out.println("Enter Third Number :");
        int num3 = sc.nextInt();
        GenericsMain obj = new GenericsMain();
        int maximum = obj.findMax(num1,num2,num3);
        System.out.println("Maximum number " +maximum);
    }
}
