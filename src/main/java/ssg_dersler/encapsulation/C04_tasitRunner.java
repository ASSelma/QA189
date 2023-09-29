package ssg_dersler.encapsulation;

import java.util.Scanner;

public class C04_tasitRunner {


    public static void main(String[] args) {

        C03_tasit tasit = new C03_tasit();

       Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen taşıt türünü giriniz");

        tasit.setTasitTuru(scan.nextLine());

        System.out.println("Taşıtın muayenesi var mı?");

        tasit.setMuayenesiVarMi(scan.nextBoolean());

        scan.nextLine();

        System.out.println("vites turu");

        tasit.setVitesTuru(scan.nextLine());

        System.out.println("kac vites?");

        tasit.setKacVites(scan.nextInt());

         tasit.setCounter();
         System.out.println(tasit);





    }
}
