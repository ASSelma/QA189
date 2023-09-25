package day04scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GenelTekrar2 {
    public static void main(String[] args) {

        //1.ORNEK,

      /*  Scanner input  = new Scanner(System.in);
        System.out.println("Adinizi ve Soy Adinizi Giriniz");

        String  fullName =input.nextLine();


        System.out.println("Yasınızı Giriniz");

        byte age = input.nextByte();

        System.out.println("Boyunuzu Giriniz");

        float height = input.nextFloat();

        System.out.println("Kilonuzu Giriniz");

        short weight = input.nextShort();

        System.out.println("Medeni Durumunuzu Giriniz");

        String maritalStatus = input.next();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);



    //2.ORNEK

        Scanner input = new Scanner (System.in);

        System.out.println("Lütfen iki sayı giriniz");

         double firstNumber = input.nextDouble();
         double secondNumber = input.nextDouble();

        System.out.println("toplam = " + (firstNumber + secondNumber));
        System.out.println("cıkarma = " + (firstNumber - secondNumber));
        System.out.println("carpım = " + (firstNumber * secondNumber));
        System.out.println("bölme = " + (firstNumber / secondNumber));

    //3.ORNEK

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin kısa kenar uzubluğunu giriniz");
        float shortSide= input.nextFloat();


        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz");

        float longSide= input.nextFloat();

        System.out.println("Alan = " + shortSide*longSide);
        System.out.println("Cevre = " + (2*shortSide + 2*longSide));

      Scanner input = new Scanner(System.in);

        System.out.println("Lütfen beş basamaklı bir sayı giriniz");

        int num = input.nextInt();
        int firstNum =  num/1000;
        int lastNum = num%100;

        System.out.println(firstNum+lastNum);



        //4.ORNEK

        int f = 13;
        f = f+1;
        System.out.println(f);

        f += 1;
        System.out.println(f);

        f++;

        System.out.println(f);

        int m = 22;
        m = m-1;
        System.out.println(m);
        m -= 1;
        System.out.println(m);

        m--;

        System.out.println(m);

    //5.ORNEK
        int i = 10;

        int k = i++;
        System.out.println(k);
        System.out.println(i);



        int m = 15;
        int n = ++m;
        System.out.println(m);
        System.out.println(n);


        int p =17;
        int r = p--;

        System.out.println(r);
        System.out.println(p);


        int s = 20;
        int t =--s;

        System.out.println(t);
        System.out.println(s);


        //6.ORNEK

        // Sayi -1 ile 10 arasında ise ekrana "RAKAM" yazdırın.

        int number = 8;



        if ( number >-1 && number<10){

            System.out.println("Rakam");

        }



        //7.ORNEK

        // Sayı uc basamaklı ise ekrana  "Sayı üc basamaklıdır!" yazdırın.


        int n = 123;

        if (n>99 && n<1000){
            System.out.println("Sayı üc basamaklıdır!");

        }

*/

        //8.ORNEK
        // Kullanıcıdan alınan bir sayınin tek mi cift mi olduğunu yazdıran kodu olusturunuz.

      Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz..");

        int num = input.nextInt();

        if (num % 2 ==0){
            System.out.println("Çift sayı");
        }
        if (num % 2 !=0){
            System.out.println("Tek sayı");
        }





































































































































































    }
}
