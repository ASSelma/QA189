package ssg_dersler.arrays;

import java.util.Arrays;

public class C04_Arrays {

    public static void main(String[] args)


    {

        /* Verilen arrayin tüm elemanlarını bir soldaki konuma taşıyacak bir program yazın.
         Ornek array ((123)) ise output (2,3,1) olacak

         */

        int sayılar []={1,2,3,4,5};
        int ilk=sayılar[0];
        for (int i = 0; i <sayılar.length-1 ; i++) {


            sayılar[i]=sayılar[i+1];

            System.out.println(Arrays.toString(sayılar));

        }

        sayılar[sayılar.length-1]=ilk;
        System.out.println(Arrays.toString(sayılar));


    }
}
