package ssg_dersler.doWhileLoop;

public class C05_doWhileLoop {
    public static void main(String[] args) {
        //4. uslu sayi bulabilen java kodu yazinin

        int taban=2;
        int us=8;
        int carpimsonucu=1;
        // for (int i = 1; i <=us; i++) {
        //     carpimsonucu*=taban;
        // }


        int i = 1;
        do {
            carpimsonucu*=taban;
            i++;}while (i <=us);
        System.out.println(carpimsonucu);


    }
}
