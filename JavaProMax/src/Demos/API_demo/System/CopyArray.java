package Demos.API_demo.System;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2=new int[6];
        System.arraycopy(arr1,3,arr2,2,3);
        System.out.println(Arrays.toString(arr2));
    }
}
