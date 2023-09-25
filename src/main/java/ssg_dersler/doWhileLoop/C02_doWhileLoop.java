package ssg_dersler.doWhileLoop;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {

        //2. Örnek
        //Girilen tamsayının basamaklarının toplamını yazan program.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam syı giriniz");

        int sayı = scan.nextInt();

        int toplam = 0;

        do{
            Math.abs(sayı);
            toplam+=sayı%10;
            sayı=sayı/10;

        }while (sayı>0);

        System.out.println("basamakların toplamı : " + toplam);



    }
}
