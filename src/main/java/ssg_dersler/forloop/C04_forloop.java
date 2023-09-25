package ssg_dersler.forloop;

import java.util.Scanner;

public class C04_forloop {


    public static void main(String[] args) {

        //belirlenen sayının 1 den 10 kadar çarpım sonuçlarını yapan java programını yazınız..

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        for (int i = 1; i <=10 ; i++) {
            if (i<10){
                System.out.println(sayi+" X "+i+" =  "+i*sayi);
            }else System.out.println(sayi+" X "+i+" = "+i*sayi);
        }
    }
}
