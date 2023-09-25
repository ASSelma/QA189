package ssg_dersler.arraylist;

import java.util.ArrayList;

public class C04_arraylist {

    public static void main(String[] args) {


        //Bir doğal sayı listesi oluşturun ve oluşturduğunuz listedeki çift ögeleri toplayın


        ArrayList<Integer> mylist = new ArrayList<>();

        mylist.add(3);
        mylist.add(26);
        mylist.add(51);
        mylist.add(18);
        mylist.add(12);
        mylist.add(25);
        mylist.add(51);
        mylist.add(11);
        mylist.add(12);


        int sum = 0;

        for (Integer a : mylist) {

            if(a%2==0){
                sum+=a;
            }
            System.out.print(sum+ " ");
        }

    }
}
