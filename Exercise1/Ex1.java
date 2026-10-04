package Exercise1;

public class Ex1 {



    public static void printArray(int[] arr){
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println("Element "+ i + " contents "+ arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr){

        // Copying the old array into a new one , the one to be sorted
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }


        // Now for the sorting part , we will use selection sort

        int index1 = 0;

        while (index1 < arr.length) {
            for (int i = index1 ; i < arr.length ; i++){
                if (newArray[i] > newArray[index1]){
                    int temp = newArray[i];
                    newArray[i] = newArray[index1];
                    newArray[index1] = temp ;
                }
            }
            index1 += 1;
        }

        return newArray;


    }

    public static void main(String[] args) {

        int[] numbers = {106, 26, 81, 5, 15};
        int[] sorted = sortIntegers(numbers);
        printArray(sorted);
    }
}
