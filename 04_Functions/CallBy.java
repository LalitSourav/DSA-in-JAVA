//------------JAVA always calls by VALUE-------------
//SWAPING EXAMPLE
import java.util.*;
public class CallBy{
    public static void main(String args[]) {
        // Scanner sc=new Scanner(System.in);
        int a=5;
        int b=10;

        swap(a,b);
        System.out.println("a = "+a+" b = "+b);//Original value will come
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
         System.out.println("a = "+a+" b = "+b);//Swaped value will come

    }
}

//-------------REASON----------------

/*
    main pakhare je variables achi (a,b) jahara value 5 aau 10
    kintu swap function ra a aau b alga (Copied value of a and b)
    original value kebe pass hueni gute copy pass hue sabu bele 
    Call By Value re

    Call by Referance re Original Variable jai (used is C++)
*/
