package ssg_dersler.arraylist;

import java.util.ArrayList;

public class C03_arraylist {

    public static void main(String[] args) {


        //Bir doğal sayı listesi oluşturun ve oluşturduğunuz listedeki tüm ögeleri toplayın.

        ArrayList<Integer> mylist = new ArrayList<>();

        mylist.add(5);
         mylist.add(25);
         mylist.add(51);
         mylist.add(11);
         mylist.add(12);

         int sum = 0;

        for (Integer a : mylist) {
            sum+=a;
        }

        System.out.println(sum);

    }
}
