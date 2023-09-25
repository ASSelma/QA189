package day10loopsarrays;

import java.util.Arrays;

public class GenelTekrar10 {

    public static void main(String[] args) {

    /*   int ages [] = new int[9];

        ages[0] = 20;
        ages[1] = 10;
        ages[2] = 24;
        ages[3] = 42;
        ages[4] = 54;
        ages[5] = 67;
        ages[6] = 98;
        ages[7] = 2;
        ages[8] = 4;

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        System.out.println( ages[0] + ages[ages.length-1]);





        int minimum = ages[0];
        int maximum = ages[0];

        for (  int w:ages) {

           minimum =  Math.min(minimum,w);
           maximum =  Math.max(maximum,w);

        }
        System.out.println(minimum);
        System.out.println(maximum);







    String s = "Java is easy. Learn Java earn money.";

        // Boşluk karakterine göre metni parçalayarak kelimeleri buluyoruz
        String[] words = s.split(" ");

        // Kelime sayısını hesaplıyoruz
        int wordsNumber = words.length;

        System.out.println("Words: " + wordsNumber);

*/

        String names [] = { "F", "M" ,"B" , "E"};

        Arrays.sort(names);
        int result = Arrays.binarySearch(names, "U");
        int result1 = Arrays.binarySearch(names, "A");
        int result2 = Arrays.binarySearch(names, "E");
        int result3 = Arrays.binarySearch(names, "F");
       int result4 = Arrays.binarySearch(names, "5");


        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);





    }
}
