package ssg_dersler.arrays;

import java.util.Arrays;

public class C07_Arrays {


    public static void main(String[] args) {


        //Verilen bir array'e yeni bir element ekleyin.

        int arr []={1,2,3,4,5,6,7,8,9};//10

        int sayı =10;

        int yeniArr[] = new int[arr.length+1];

        System.out.println(Arrays.toString((yeniArr)));

        for (int i = 0; i <arr.length; i++) {

            yeniArr[i]=arr[i];

        }

        yeniArr[yeniArr.length-1]=sayı;

        System.out.println(Arrays.toString((yeniArr)));

    }
}
