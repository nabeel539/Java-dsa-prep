package funstions;

import java.util.Scanner;

/**
 * ElegibleForVote
 */
public class ElegibleForVote {

    public static void checkElegibility(int age){
        if(age > 18){
            System.out.println("You are Elegible For Vote.");
        } else {
            System.out.println("You are not Elegible For Vote.");
        }
    }
 public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter your Age : ");
        int age = sc.nextInt();
        checkElegibility(age);
    }
 }
    
}