package view;

import java.util.Scanner;

public class ViewOrderOptions {


    public int options(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose a drink:
                      1 - Espresso
                      2 - Cappuccino
                      3 - Latte
                      
                """);

        return scanner.nextInt();
    }
}
