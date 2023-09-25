package ssg_dersler.doWhileLoop;

import java.util.Scanner;

public class C03_doWhileLoop {


    public static void main(String[] args) {
        //Bir tamsayının tam bölenlerini ve tam bölenlerinin toplamını bulun.

        int sayi=30;
        int toplam=0;
        int bolen=1;
        int counter=0;
        do {
            if (sayi%bolen==0){
                System.out.println(sayi+" sayisi "+bolen +" sayisina tam bolunur");
                toplam+=bolen;
                counter++;
            }
            bolen++;
        }while (bolen<=sayi);
        System.out.println("toplam bolen sayisi : "+counter);
        System.out.println("bolenleri toplami : "+toplam);
    }
}
