package quaDraticEquation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter A");
        System.out.println("enter B");
        System.out.println("enter C");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>0){
            System.out.println("x1="+quadraticEquation.getRoot1());
            System.out.println("x2="+quadraticEquation.getRoot2());
        }
        else
        {
            if(quadraticEquation.getDiscriminant()==0)
            {
                System.out.println("x1=x2="+quadraticEquation.getRoot1());
            }
            else{
                System.out.println("the equation has no root");
        }
    }
}}
