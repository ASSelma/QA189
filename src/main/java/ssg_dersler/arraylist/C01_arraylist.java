package ssg_dersler.arraylist;

import java.util.ArrayList;

public class C01_arraylist {

    public static void main(String[] args) {

        //Bir list oluşturup eleman ekleyin ve yazdırın.


        ArrayList<Integer>mylist = new ArrayList<>();

        //***********Arraylistlerde metod oluşturmya gerek yok. Daha gelişmiş.

        mylist.add(5);
        mylist.add(15);
        mylist.add(25);
        mylist.add(51);
        mylist.add(67);

        System.out.println(mylist);


    }
}
