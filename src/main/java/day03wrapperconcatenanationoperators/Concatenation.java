package day03wrapperconcatenanationoperators;

public class Concatenation {

    public static void main(String[] args) {

        // Ornek : Bir String ve iki integer variable olusturun. String degeri ile Integer larin toplamini console yazdirin.

        String s = "elma";

        int a = 10;
        int b = 11;

        System.out.println(s+a+b); //elma1011

        System.out.println(s+a*b); //elma110

        System.out.println(s+(a+b)); //elma21

        System.out.println(a+b+s);//21elma

        System.out.println(a+s+b); //10elma11

        // Java da "+" sembolu iki sayı arasında kullanılırsa "toplama islemi" olur.
        //java da "+" sembolu iki String veya bir String ve bir sayı arasında kullanılırsa "concetenation" işlemi olur.
        //"Concatenation" işlemi birleştirme yapar.
        // Note : Contanetion işlemlerinde java matematikse işlem önceliğine dikkat eder.

    }/*Matematikte islem onceligi
        1)Once uslu sayilar
        2)Parantez ici islemler yapilir
        3)Carpma ve Bolmeler yapilir
        4)Toplama ve Cikarmalar yapilir
        5)Ayni oncelikli olanlarda soldan saga baslanir
         */

}
