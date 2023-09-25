package ssg_dersler.ternary;

public class C01_ternary {


    public static void main(String[] args) {
        //   verilen sayi 100'den buyukse sayi'nin karesini  alip yazdiran
        //   100'den kucukse " sayi 100'den buyuk olmali" yazdiran
        //   bir ternary olusturalim

        int sayı = 110;
        if (sayı >= 100) {

            System.out.println(sayı*sayı);

        } else System.out.println("sayı 100'den büyük olmalı");


        //System.out.println(sayi >= 100 ? sayi * sayi : "sayi 100'den buyuk olmali");
        Object obje=sayı >= 100 ? sayı * sayı : "sayi 100'den buyuk olmali";

        System.out.println(obje);


    }


}

