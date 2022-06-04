package day26_forEachLoop_constructor;

import day23_multiDimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practica {
    public static void main(String[] args) {
        int arr[]={};
        // ekleme yapalım

       arr= C06_Arrays.arrayeElemanEkle(arr,5);
        System.out.println(Arrays.toString(arr));

        List<Integer> sayılarlist= new ArrayList<>();
        System.out.println(sayılarlist);
        sayılarlist.add(5);//[5]
        sayılarlist.add(3);//[3]
        System.out.println(sayılarlist);//[5,3]
        sayılarlist.add(0,7);
        System.out.println(sayılarlist);//[7, 5, 3]





    }
}

