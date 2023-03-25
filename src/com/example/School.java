package com.example;

import java.util.Scanner;
public class School {
    public static void main(String[] args) {
Scanner input= new Scanner(System.in) ;
int a,b,c,d,e,f,g,h ;
System.out.println("input maths level");
a=input.nextInt();
System.out.println("input geography level obtained");
b=input.nextInt();
System.out.println("input home language level obtained");
c=input.nextInt();
System.out.println("input life science level obtained");
d=input.nextInt();
System.out.println("input first additional language obtained");
e=input.nextInt();
System.out.println("input physics level obtained");
f=input.nextInt();
g=a+b+c+d+e+f;
h=g/5;
System.out.println("average level obtained is" +h );
    }
}
