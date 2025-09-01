//break the loop whenever the user enters a multiple of 10

import java.util.*;

public class BreakQuestion{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
        }
    }
}