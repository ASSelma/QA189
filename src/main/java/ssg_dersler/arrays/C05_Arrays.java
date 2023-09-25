package ssg_dersler.arrays;

import java.util.Arrays;

public class C05_Arrays {

    public static void main(String[] args) {

      //  Verilen bir int arraydeki en büyük sayıyı yazdıran method oluşturun.


        int sayılar[]={1,2,3,4,5,34,6,7,8,19};

        Arrays.sort((sayılar));

        System.out.println(sayılar[sayılar.length-1]);

        maxSayıYazdır(sayılar);
        minSayıYazdır(sayılar);

    }


    public static void minSayıYazdır(int sayılar[]){


        int minSayı=sayılar[0];

        for (int i = 0; i < sayılar.length ; i++) {

            minSayı=Math.min(minSayı,sayılar[i]);

        }
        System.out.println("array içindeki en küçük sayı : "+minSayı);







    }





    public static void maxSayıYazdır(int sayılar[]){


        int maxSayı=sayılar[0];

        for (int i = 0; i < sayılar.length ; i++) {

            if(maxSayı<sayılar[i]){
                maxSayı=sayılar[i];
            }

        }
        System.out.println("array içindeki en büyük sayı : "+maxSayı);







    }
}
