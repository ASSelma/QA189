package day05ifelseswitchternary;

import java.util.Locale;
import java.util.Scanner;

public class GenelTekrar05 {
    public static void main(String[] args) {
      /*  //Example 1: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

       Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = input.nextInt();


        if(num>0){
            System.out.println("Pozitif");
        }else if (num<0){
            System.out.println("Negatif");
        }else{
            System.out.println("Nötr");
        }



        //2.Örnek

        //Example 2: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir gün sayisi giriniz");

        byte num = input.nextByte();

        if(num==1){
            System.out.println("Monday");
        }else if(num==2){
            System.out.println("Tuesday");
        }else if(num==3){
            System.out.println("Wednesday");
        }else if(num==4){
            System.out.println("Thursday");
        }else if(num==5){
            System.out.println("Friday");
        }else if(num==6){
            System.out.println("Saturday");
        }else if(num==7){
            System.out.println("Sunday");
        }else {
            System.out.println("Hatalı Giriş Yaptınız. Lütfen 1 ile 7 arasında bir sayi giriniz.");
        }


  //3.Ornek



             Example 3:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir yas degeri  giriniz");

        int age = input.nextInt();

        if(age<0){
            System.out.println("Gecerli bir yas giriniz.");
        }else if(age<5){
            System.out.println("Bebek");
        }else if(age<13){
            System.out.println("Cocuk");
        }else if(age<21){
            System.out.println("Genc");
        }else if(age<31){
            System.out.println("Yetiskin");
        }else {
            System.out.println("Tanımlanmamış yas");
        }



        //4. Ornek
        //Kullanicinin vermis oldugu gün isimlerine bakarak HaftaSonu veya Hafta ici olduguna karar veren kodu yaziniz
        //Monday ==> Week Day       Saturday ==> Weekend Day

     Scanner input = new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz.");

        String dayName = input.next();

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        boolean isWeekDay = dayName.equalsIgnoreCase("Monday")||dayName.equalsIgnoreCase("Tuesday")||dayName.equalsIgnoreCase("Wednesday")||
                dayName.equalsIgnoreCase("Thursday")||dayName.equalsIgnoreCase("Sunday");

        if(isWeekendDay){
            System.out.println("Weekend Day");
        }else if(isWeekDay){
            System.out.println("Week Day");
        }else{
            System.out.println("Invalid Day Name");
        }


        //5.Ornek

      //  Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
        // Eger calisan kadin ise;
        //60 yasindan buyukse "Emekli Olabilir "yazdirin

        // Eger calisan erkek ise;
        //65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);


        System.out.println("Cinsiyetinizi giriniz");
        String gender = input.next();

        System.out.println("Yasinizi giriniz");
        int age = input.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("Lutfen yasi 0 ile 120 arasinda giriniz");

        } else if (gender.equalsIgnoreCase("Kadin")) {

                if (age > 60) {
                    System.out.println("Emekli olabilir");
                } else {
                    System.out.println("Calismali...");
                }

            } else if (gender.equalsIgnoreCase("Erkek")) {

                if (age > 65) {
                    System.out.println("Emekli olabilir");
                } else {
                    System.out.println("Kesinlikle Calismali...");
                }

            } else {
                System.out.println("Tanimli degil...");
            }

*/

//Example  Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7


       String dayName = "Tuesday";

       if (dayName.equalsIgnoreCase("Sunday")){

           System.out.println(1);

       }else if(dayName.equalsIgnoreCase("Monday")){
           System.out.println(2);
       }else if(dayName.equalsIgnoreCase("Tuesday")){
           System.out.println(3);
       }else if(dayName.equalsIgnoreCase("Wednesday")){
           System.out.println(4);
       }else if(dayName.equalsIgnoreCase("Thursday")){
           System.out.println(5);
       }else if(dayName.equalsIgnoreCase("Friday")){
           System.out.println(6);
       }else if(dayName.equalsIgnoreCase("Saturday")){
           System.out.println(7);
       }else {
           System.out.println("Lütfen gecerli bir gün ismi giriniz");
       }


//2.yol

        switch (dayName.toLowerCase()){                         //variable(dayName)koy

            case "Sunday" :
                System.out.println(1);
                break;


        case "Monday" :
                System.out.println(2);
                break;


        case "Tuesday" :
                System.out.println(3);
                break;


        case "Wednesday" :
                System.out.println(4);
                break;


        case "Thursday" :
                System.out.println(5);
                break;


        case "Friday" :
                System.out.println(6);
                break;

            case "Saturday" :
                System.out.println(1);
                break;

            default:
                System.out.println("Lutfen gecerli bir gun ismi giriniz.");


        }









        }
}
