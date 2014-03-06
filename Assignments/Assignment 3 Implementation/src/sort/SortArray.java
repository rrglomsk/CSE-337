package sort;

import java.util.Arrays;

/**
* Rachel Glomski
* CSE 337 - Assignment 3
*
* This class has the ability to sort a given array in ascending
* or descending order
*/

public class SortArray{
 

    public static void main(String[] args){
        SortArray sortArray = new SortArray();
    }


    public int[] ascendingSort(int[] arr){
        Arrays.sort(arr); //built-in ascending sorting
        return arr;
    }

    public int[] descendingSort(int[] arr){
        Arrays.sort(arr);
        //steps into array and swaps first and last element until
        //reaching the middle, reversing the array
        for(int i = 0; i < arr.length/2; i++){
            int tempSort = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = tempSort;
        }
        return arr;
    }
}           
