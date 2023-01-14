package org.example.basicOfProgramming.loopControl;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        double hour = 0.5;
        double hourPerSec;
        double speedlimit = 45;

        Scanner scan = new Scanner(System.in);

        while(true){
            hourPerSec = scan.nextDouble();
            if(hourPerSec==0){
                System.out.println("Quit");
                break;
            }
            else if(hourPerSec/hour > speedlimit) {
                System.out.println("Штраф за привышение скорости");
            }
            else {
                System.out.println("Driver was fallowing the rules");
            }
        }
        
    }
}
