package ssg_dersler.ternary;

public class C03_ternary {

    public static void main(String[] args) {

           /* 2 tam sayınız var;
        Her iki tamsayı da pozitifse çarpma işlemi yapın
        en az Biri negatifse ve en az biri 0 ise "çarpma nasıl yapılır bilmiyorum"
        */

        int sayı1 = 3;

        int sayı2 =35;

        Object obje = sayı1>0 && sayı2>0  ? sayı1*sayı2 : "çarpma nasıl yapılır bilmiyorum";

        System.out.println(obje);


    }
}
