package ssg_dersler.methodCreation;

import java.util.Scanner;

public class C02_main {

    public static void main(String[] args) {
        C01_methodCreation.hosgeldinMesagi();


        Scanner scan = new Scanner(System.in);
        System.out.println("toplamak icin '+' cıkarmak icin '-' carpmak icin '*' bolemk icin '/' us almak icin '^' gir");
        char islem = scan.next().charAt(0);
        switch (islem) {
            case '+':
                HesapMakinesi.toplama();
                break;
            case '*':

                HesapMakinesi.carpma();
                break;
            case '/':
                HesapMakinesi.bolme();
                break;
            case '-':
                HesapMakinesi.cikartma();
                break;
            case '^':
                HesapMakinesi.usAlma();
                break;
            default:
                System.out.println("bu islem hesap makinemizde bulunmamakta!!");
                break;
        }
    }}


