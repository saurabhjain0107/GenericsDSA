package com.bridgelabz;

import java.util.Scanner;

public class GenericsMain {
    public float findMax(Float n1,Float n2,Float n3){
        Float max = n1;
        if(n2.compareTo(max)>0) max = n2;
        if(n3.compareTo(max)>0) max = n3;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number :");
        float num1 = sc.nextFloat();
        System.out.println("Enter Second Number :");
        float num2 = sc.nextFloat();;
        System.out.println("Enter Third Number :");
        float num3 = sc.nextFloat();
        GenericsMain obj = new GenericsMain();
        float maximum = obj.findMax(num1,num2,num3);
        System.out.println("Maximum number " +maximum);
    }
}
