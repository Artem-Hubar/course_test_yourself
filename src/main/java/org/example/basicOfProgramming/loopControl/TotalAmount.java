package org.example.basicOfProgramming.loopControl;

import java.util.Scanner;

public class TotalAmount {
    public static void main(String[] args) {
        float purchase;
        Scanner scan = new Scanner(System.in);
        while (true){
            purchase = scan.nextFloat();
            if(purchase<=0){
                System.out.println("Quit");
                break;
            }
            else if(purchase<=100){
                System.out.println("Total amount: " + purchase*0.95);
            }
            else if(100 < purchase && purchase < 200){
                System.out.println("Total amount: " + purchase*0.9);
            } else if (purchase>=200) {
                System.out.println("Total amount: " + purchase*0.85);
            }
        }
    }
}
