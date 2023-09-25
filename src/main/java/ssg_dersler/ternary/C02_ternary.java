package ssg_dersler.ternary;

import java.util.Scanner;

public class C02_ternary {

    public static void main(String[] args) {

        //Kullanicidan bir tam sayi isteyin tek mi cift mi kontrol edin

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz");

        int sayı = input.nextInt();

        String str = sayı % 2 ==0 ? "çift sayıdır" : "tek sayıdır";

        System.out.println(str.contains("çift")? "o zaman sayı gerçekten çift" : "o zaman sayı gerçekten tek olabilir");

        System.out.println(str);





    }
}
