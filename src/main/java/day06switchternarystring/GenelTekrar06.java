package day06switchternarystring;

import java.util.Scanner;

public class GenelTekrar06 {

    public static void main(String[] args) {


       /* //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           8 ==> August - September - October - November - December

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen baslangıc ayinin kacinci ay olduğunu giriniz.");

        int numOfMonth = input.nextInt();

        switch (numOfMonth) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Gecerli ay numarasii veriniz..");
        }




        //Example 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           -4 ==> -1*-4        4 ==> 4        0 ==> 0

        int c = 4;

      int result =   c<0   ?  -1*4   :  c;

        System.out.println(result);





        //Example 2: Iki sayinin isareti ayni ise bu sayilari carpan,
        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        // mesaji veren kodu yaziniz.


int a = 13;
int b = -7;

       Object  result2 =  (a>0 && b>0)  || (a<0 && b<0) ? a*b : "Farklı işaretli sayıları carpamıyorum";

        System.out.println(result2);



        //Example : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.

        int num = -245;

        num = Math.abs(num);


        String result3 = num>99 && num<1000 ?  "Üç basamaklıdır." : "Üç basamaklı değildir." ;

        System.out.println(result3);



    //    Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
    //    1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
        // 2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil



int year = 1600;

String result2 = year%100==0 ?  year %400==0 ? "Leap" : "Not Leap" : year%4==0 ? "Leap" : "Not Leap";

        System.out.println(result2);



        String s = "Java is easy";

       int sLength =  s.length();
        System.out.println(sLength);

       char firstChar =  s.charAt(0);

        System.out.println(firstChar);




        char lastChar =  s.charAt(11);

        System.out.println(lastChar);


        char lastChar2 =  s.charAt(s.length()-1);

        System.out.println(lastChar2);



        String s1 = s.substring(0,4);
        System.out.println(s1);


        String s2 = s.substring(5,7);
        System.out.println(s2);


        String s3 = s.substring(8,12);
        System.out.println(s3);


        String s4 = s.substring(8);
        System.out.println(s4);


        boolean isExist = s.contains("easy");
        System.out.println(isExist);



        boolean isExist2 = s.contains("Easy");
        System.out.println(isExist2);



        boolean isStart =   s.startsWith("Java");

        System.out.println(isStart); //True



        boolean isStart1 =   s.startsWith("java");

        System.out.println(isStart1); //False




        boolean isEnd =   s.endsWith("easy");

        System.out.println(isEnd);

*/


        String s = "Learn Java earn 123456 money";

        //Ornek 1: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.


        String s1 = s.replace("money", "dollar");
        System.out.println(s1);//Learn Java earn dollar


        //Ornek 2: "s" String'indeki tum "e" harflerini siliniz
        String s2 = s.replace("e", "");
        System.out.println(s2);

        String s3 = s.replaceAll("[0-9]","*");
        System.out.println(s3);


//Ornek 3: s Stringindeki rakam sayısını bulunuz.

       int s4 = s.replaceAll("[^0-9]","").length();
        System.out.println(s4);



    }


}
