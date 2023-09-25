package ssg_dersler.ternary;

import java.util.Scanner;

public class C05_ternary {

    public static void main(String[] args) {

        // bir kisinin kan bagisinda bulunup bulunamayacigini control ediniz .
        // yas:18 ve uzeri olmali
        // kilo : 50 dan ust olmali


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if( yas>=18) {
            System.out.println("Lütfen kilonuzu giriniz");

            double kilo = scan.nextDouble();

            if(kilo>=50){

                System.out.println("Kan verebilirsiniz");


        }else System.out.println("kilonuz tutmadigi icin kan veremezsiniz");

    }else System.out.println("yasiniz tutmadigi icin kan veremezsiniz buyuyup gelin");








    }
}
