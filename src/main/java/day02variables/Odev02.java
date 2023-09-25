package day02variables;

import java.util.Scanner;

public class Odev02 {
    public static void main(String[] args) {

        /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
    çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz

 */

        Scanner input = new Scanner(System.in);
        double bakiye = 10000; // Başlangıç bakiyesi

        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");

            System.out.println("1 - Bakiye Sorgula");
            System.out.println("2 - Para Yatırma");
            System.out.println("3 - Para Çekme");
            System.out.println("4 - Çıkış");
            System.out.print("İşlem seçiniz: ");


        int seç = input.nextInt();

        switch (seç) {
            case 1:
                System.out.println("Bakiyeniz: " + bakiye + " TL");
                break;
            case 2:
                System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                double depositAmount = input.nextDouble();
                bakiye += depositAmount;
                System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
                break;
            case 3:
                System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                double withdrawAmount = input.nextDouble();
                if (withdrawAmount <= bakiye) {
                    bakiye -= withdrawAmount;
                    System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
                } else {
                    System.out.println("Yetersiz bakiye!");


                }
                break;
            case 4:
                System.out.println("Çıkış yapılıyor...");
                System.exit(0);
                break;
            default:
                System.out.println("Geçersiz işlem!");

    }


    }

    }


