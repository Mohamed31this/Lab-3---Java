package Exercise6;

import Exercise1.Ex1;

import static Exercise1.Ex1.sortIntegers;
import static Exercise2.Ex2.reverse;

public class Ex6 {

    public static int median(int[] arr){

        int[] myNewSorted = sortIntegers(arr);

        return myNewSorted[(arr.length-1)/2];



    }
}
