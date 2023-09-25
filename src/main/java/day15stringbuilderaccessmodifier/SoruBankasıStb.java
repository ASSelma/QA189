package day15stringbuilderaccessmodifier;

public class SoruBankasıStb {
    public static void main(String[] args) {

/*
        StringBuilder strBld = new StringBuilder(6);
        strBld.append("Learn");
        strBld.append("Java");
        System.out.println(strBld);



        StringBuilder strBld = new StringBuilder("John ");
        strBld.append("Woo ").append("Leo").deleteCharAt(6);
        System.out.println(strBld);



        StringBuilder str = new StringBuilder("LearnJava");
        str.deleteCharAt(3);
        System.out.println(str.substring(2, 6));



        StringBuilder str = new StringBuilder("LearnJava");
        str.setCharAt(5, 'L');
        System.out.println(str);




        StringBuilder str = new StringBuilder(7);
        str.append("Java");
        System.out.println(str.capacity() + "," + str.length());



        StringBuilder str = new StringBuilder("LearnJava");
        int index = str.indexOf("earn");
        System.out.println(index);



        StringBuilder str = new StringBuilder("LearnJava");
        int index = str.indexOf("a", 4);
        System.out.println(index);


        StringBuilder str = new StringBuilder("LearnJava");
        int index = str.indexOf("e", 4);
        System.out.println(index);





        String str2 = "LearnJava";
        String str3 = "";
        for(int i = str2.length()-1; i>=0; i--) {
            str3 = str3 + str2.charAt(i);
        }
        System.out.println(str3);



        StringBuilder stb = new StringBuilder("Learn ");
        char[] ch = new char[] { 'J', 'A', 'V', 'A' };
        stb.append(ch);
        System.out.println(stb);




*/
        StringBuilder sb5 = new StringBuilder("Learn");
        System.out.println("Before trim: " + sb5.capacity());
        sb5.trimToSize();
        System.out.println("After trim: " + sb5.capacity());


        StringBuilder sb = new StringBuilder(9);
        System.out.println(sb.length() + " - " + sb.capacity());


        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length() + " - " + sb1.capacity());


        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println(sb2.length() + " - " + sb2.capacity());

        StringBuilder sb3 = new StringBuilder("StringBuilder");
        System.out.println(sb3.delete(3, 6).toString() + " - " + sb3.length());




    }








    }
