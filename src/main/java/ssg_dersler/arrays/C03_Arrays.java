package ssg_dersler.arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        //Bir ARRAY oluşturun ve oluşturduğunuz arraydaki sayıları küçükten büyüğe doğru yazdırın.


        int sayılar []={9,7,2,12,26,1,5,10,8,3};


        Arrays.sort(sayılar);
        System.out.println(Arrays.toString(sayılar));

;

    }
}
