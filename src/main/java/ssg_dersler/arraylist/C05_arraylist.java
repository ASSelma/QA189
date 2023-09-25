package ssg_dersler.arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class C05_arraylist {

    public static void main(String[] args) {

        /*
        İçinde 200 tane 1000'den küçük pozitif tam sayı olan bir list oluşturun.
        Kullanıcıdan bir sayı isteyip listede var olup olmadığını kullanıcıya yazın.
         */


        Random random = new Random();

        int sayı = 0;

        ArrayList<Integer> sayıListesi = new ArrayList<>();

        while (sayıListesi.size() < 200) {

            sayı = random.nextInt(1000);

            if (!sayıListesi.add(sayı)) {
                continue;

            }


            sayıListesi.add(sayı);
        }


        Scanner scan = new Scanner(System.in);

        int tahminHakkı = 5;
        int tahminSayısı = 0;
        do {
            System.out.println("lütfen tahminde bulunmak için bir tam sayı giriniz");
            sayı = scan.nextInt();
        tahminSayısı++;

           // System.out.println(sayıListesi);

            if (sayıListesi.contains(sayı)) {

                System.out.println("tebrikler "+ tahminSayısı +" . tahminde doğru sonuca vardınız");
                break;
            } else
                System.out.println("tekrar deneyiniz");
                tahminHakkı--;
            System.out.println("kalan tahmin hakkınız "+tahminHakkı);


        }  while (tahminHakkı > 0);

    if (tahminHakkı==0) {
        System.out.println("Malesef bulamadınız oyunu tekrar başlatın");
    }
    }




    }

