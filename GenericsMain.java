package com.bridgelabz;

import java.util.Scanner;

public class GenericsMain {

    static  <K extends Comparable>K findMax(K n1,K n2, K n3){
        K max = n1;
        if(n2.compareTo(max)>0) max = n2;
        if(n3.compareTo(max)>0) max = n3;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose option 1=Integer/2=float/3=string:");
        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Enter first Number :");
                int num1 = sc.nextInt();
                System.out.println("Enter Second Number :");
                int num2 = sc.nextInt();;
                System.out.println("Enter Third Number :");
                int num3 = sc.nextInt();
                int maximum = findMax(num1,num2,num3);
                System.out.println("Maximum number " +maximum);
                break;
            case 2:
                System.out.println("Enter first Number :");
                String num4 = sc.next();
                System.out.println("Enter Second Number :");
                String num5 = sc.next();;
                System.out.println("Enter Third Number :");
                String num6 = sc.next();
                String maximum1 = findMax(num4,num5,num6);
                System.out.println("Maximum number " +maximum1);
                break;
            case 3:
                System.out.println("Enter first Number :");
                float num7 = sc.nextFloat();
                System.out.println("Enter Second Number :");
                float num8 = sc.nextFloat();
                System.out.println("Enter Third Number :");
                float num9 = sc.nextFloat();
                float maximum2 = findMax(num7,num8,num9);
                System.out.println("Maximum number " +maximum2);
                break;
        }

    }
}
