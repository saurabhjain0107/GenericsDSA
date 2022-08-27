package com.bridgelabz;

import java.util.Scanner;

public class GenericsMain {
    public String findMax(String n1,String n2,String n3){
        String max = n1;
        if(n2.compareTo(max)>0) max = n2;
        if(n3.compareTo(max)>0) max = n3;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number :");
        String num1 = sc.next();
        System.out.println("Enter Second Number :");
        String num2 = sc.next();;
        System.out.println("Enter Third Number :");
        String num3 = sc.next();
        GenericsMain obj = new GenericsMain();
        String maximum = obj.findMax(num1,num2,num3);
        System.out.println("Maximum number " +maximum);
    }
}
