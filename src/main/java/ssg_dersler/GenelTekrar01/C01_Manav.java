package ssg_dersler.GenelTekrar01;

import java.util.ArrayList;
import java.util.Scanner;

public class C01_Manav {

    public static void main(String[] args) {

        /*
        Küçük bir manav uygulaması yapın kullanıcıdan hangi sebzeyi
         almak istediğinizi sorun aldığı sebzeye göre işlemlere devam edin.

         */
        Scanner scan = new Scanner(System.in);
        ArrayList<String> sebzeler = new ArrayList<>();
        sebzeler.add("muz : 1");
        sebzeler.add("enginar : 2");
        sebzeler.add("ananas : 3");
        sebzeler.add("patates : 4");
        sebzeler.add("soğan : 5");
        sebzeler.add("domates : 6");


        ArrayList<Double> fiyatListesi = new ArrayList<>();
        fiyatListesi.add(25.0);
        fiyatListesi.add(15.0);
        fiyatListesi.add(10.0);
        fiyatListesi.add(20.0);
        fiyatListesi.add(12.5);
        fiyatListesi.add(22.5);

        ArrayList<String>fis=new ArrayList<>();
       int sebze;
        double kilo;
        double toplam = 0;
        do {
            System.out.println("islem yapmak istediginiz urunun numarsini giriniz\n" + sebzeler + " siz 0'a basıncaya kadar alisveris devam edicek");
            sebze = scan.nextInt();
            switch (sebze) {
                case 1:
                    System.out.println("lutfen " + sebzeler.get(sebze - 1).split(" ")[0] + "den kac kilo almak istediginiz giriniz kilo fiyati :" + fiyatListesi.get(sebze - 1) + "TL");
                    kilo = scan.nextDouble();
                    toplam += kilo * fiyatListesi.get(sebze - 1);
                    fis.add(sebzeler.get(sebze - 1).split(" ")[0]+"dan"+kilo+" kilo aldin kilosu : "+fiyatListesi.get(sebze-1)+"TL toplam tutar : "+kilo * fiyatListesi.get(sebze - 1)+"TL");
                    break;
                case 2:
                    System.out.println("lutfen " + sebzeler.get(sebze - 1).split(" ")[0] + "den kac kilo almak istediginiz giriniz kilo fiyati :" + fiyatListesi.get(sebze - 1) + "TL");
                    kilo = scan.nextDouble();
                    toplam += kilo * fiyatListesi.get(sebze - 1);
                    fis.add(sebzeler.get(sebze - 1).split(" ")[0]+"dan"+kilo+" kilo aldin kilosu : "+fiyatListesi.get(sebze-1)+"TL toplam tutar : "+kilo * fiyatListesi.get(sebze - 1)+"TL");
                    break;
                case 3:
                    System.out.println("lutfen " + sebzeler.get(sebze - 1).split(" ")[0] + "den kac kilo almak istediginiz giriniz kilo fiyati :" + fiyatListesi.get(sebze - 1) + "TL");
                    kilo = scan.nextDouble();
                    toplam += kilo * fiyatListesi.get(sebze - 1);
                    fis.add(sebzeler.get(sebze - 1).split(" ")[0]+"dan"+kilo+" kilo aldin kilosu : "+fiyatListesi.get(sebze-1)+"TL toplam tutar : "+kilo * fiyatListesi.get(sebze - 1)+"TL");
                    break;
                case 4:
                    System.out.println("lutfen " + sebzeler.get(sebze - 1).split(" ")[0] + "den kac kilo almak istediginiz giriniz kilo fiyati :" + fiyatListesi.get(sebze - 1) + "TL");
                    kilo = scan.nextDouble();
                    toplam += kilo * fiyatListesi.get(sebze - 1);
                    fis.add(sebzeler.get(sebze - 1).split(" ")[0]+"dan"+kilo+" kilo aldin kilosu : "+fiyatListesi.get(sebze-1)+"TL toplam tutar : "+kilo * fiyatListesi.get(sebze - 1)+"TL");
                    break;
                case 5:
                    System.out.println("lutfen " + sebzeler.get(sebze - 1).split(" ")[0] + "den kac kilo almak istediginiz giriniz kilo fiyati :" + fiyatListesi.get(sebze - 1) + "TL");
                    kilo = scan.nextDouble();
                    toplam += kilo * fiyatListesi.get(sebze - 1);
                    fis.add(sebzeler.get(sebze - 1).split(" ")[0]+"dan"+kilo+" kilo aldin kilosu : "+fiyatListesi.get(sebze-1)+"TL toplam tutar : "+kilo * fiyatListesi.get(sebze - 1)+"TL");
                    break;
                case 6:
                    System.out.println("lutfen " + sebzeler.get(sebze - 1).split(" ")[0] + "den kac kilo almak istediginiz giriniz kilo fiyati :" + fiyatListesi.get(sebze - 1) + "TL");
                    kilo = scan.nextDouble();
                    toplam += kilo * fiyatListesi.get(sebze - 1);
                    fis.add(sebzeler.get(sebze - 1).split(" ")[0]+"dan"+kilo+" kilo aldin kilosu : "+fiyatListesi.get(sebze-1)+"TL toplam tutar : "+kilo * fiyatListesi.get(sebze - 1)+"TL");
                    break;
                case 0:
                    for (String a:fis
                    ) {
                        System.out.println(a);

                    }
                    System.out.println("işleminiz bitti ödeyeceğiniz toplam miktarı : "+toplam);
                    break;
                default:
                    System.out.println("yanlis ya da eksik bir sebze girdiniz");
                    break;
    }
        } while (sebze != 0);



    }
}
