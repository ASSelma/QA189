package ssg_dersler.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class C02_arraylist {

    public static void main(String[] args) {


        //Bir list oluşturun. Ve bu listteki elemanları alfabetik sıraya koyun.

        ArrayList<String> sehirler = new ArrayList<>();

        sehirler.add("Trabzon");
        sehirler.add("Bolu");
        sehirler.add("Muğla");
        sehirler.add("Istanbul");
        sehirler.add("Ordu");
        Collections.sort(sehirler);

        System.out.println(sehirler);;


    }
}
