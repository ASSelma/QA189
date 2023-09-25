package day11multidimentionalarrays;

import java.util.Arrays;

public class GenelTekrar11 {
    public static void main(String[] args) {
      /*  //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        int  a [] = {0,2,3,0,12,0};

        int  b[] = new int[a.length];

        int idx = 0;

        for (int w : a) {

            if (w!=0){

                b[idx++] = w;
            }
        }
        System.out.println(Arrays.toString(b));


*/

        //Example : Bir integier multidimensional array'dek en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = {{15, 4}, {12, 43, 21}}; // ==> 4 + 43 = 47

        int small =  ages[0][0];

        for ( int [] w  : ages ) {

            for ( int k : w) {

                small = Math.min(small,k);


            }


        }

        System.out.println(small);

        int big =  ages[0][0];

        for ( int [] w  : ages ) {

            for ( int k : w) {

                big = Math.max(big,k);


            }


        }

        System.out.println(big);





    }
}
