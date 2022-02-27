package activity2;

import java.util.Scanner;

public class Candymachine {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Welcome to Shoreline's Computer Candy Machine!");
        System.out.println("(All candy provided is virtual.)");

        System.out.print("How much money do you have? >"); //prompts for a whole number
        double money = console.nextDouble();
        System.out.printf("%.2f, that's all?", money);

        System.out.println("Well, let me tell you what we got here.");
        System.out.println("A 100php Twix");
        System.out.println("B 50php Goya");
        System.out.println("C 200php Jelly beans");
        System.out.println("D 85php M&M");
        System.out.println("E 150php Snaps");
        
        Scanner input = new Scanner(System.in);
        System.out.print("So, What do you want? >"); //prompts for a whole number
        String a = input.next();
        if (a.equals("A"))
            if (money > 500)
        
        System.out.println("Thanks for purchasing candy through us."); 
    }
}