package ssg_dersler.arraylist;

import java.util.ArrayList;

public class C06_arraylist {

    public static void main(String[] args) {

        /*
        Verilen bir listede tekrar eden sayıları sadece 1 tane yapan bir metod oluşturun.

        örn : [1,3,5,3,5,6,1,7] bu listi

         [1,3,5,6,7] hale döünüştürün.


         */

        ArrayList<Integer> mylist = new ArrayList<>();

        mylist.add(1);
        mylist.add(3);
        mylist.add(5);
        mylist.add(3);
        mylist.add(5);
        mylist.add(6);
        mylist.add(1);
        mylist.add(7);
        
        
        tekrarsızListOluştur(mylist);


    }

    private static void tekrarsızListOluştur(ArrayList<Integer> mylist) {


ArrayList<Integer>tekrarsızList = new ArrayList();

        for (Integer a: mylist) {

            if(!tekrarsızList.contains(a)){
                tekrarsızList.add(a);

            }

        }

        System.out.println(tekrarsızList);


    }
}