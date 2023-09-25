package day07stringmanipulations;

import java.util.Scanner;

public class GenelTekrar07 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        // i)En az 8 character olsun
        boolean lengthControl = pwd.length() > 7;

        System.out.println("lengthControl = " + lengthControl);
        
        boolean pwdControl =!pwd.contains(" ");
        System.out.println("pwdControl = " + pwdControl);
        
        
         
    }
}

