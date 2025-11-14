package Practics;

import static Practics.BinarySearchClass.*;

public class BinarySearchImple {
    public static void main(String[] args){
        int[] arr={1,2,3,4,4,6,6,6,6,6,6,6,7,8};
        char[] arr2={'c','f','j'};
        int[] arr1={4,3,2,1};
        System.out.println( "For LastOccurence: "+  binaryS(arr,6,true));
        System.out.println("For First Occurence: "+binaryS(arr1,6,false));
        System.out.println("first Position of occurence: "+binarySearchFirst(arr,6));
        System.out.println("Last Position of occurence: "+bianrySearchLast(arr,6));
        System.out.println("No. of target element: "+countTarget(arr,888));
        System.out.println("Floor value is: "+floorBinarySearch(arr,5));
        System.out.println("ceil value is: "+ceilBinarysearch(arr,5));
        System.out.println("ceil value is: "+Smallest_Greater_Target_744(arr2,'a'));
    }
}
