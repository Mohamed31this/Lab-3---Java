package Exercise3;

public class Ex3 {

    public static int[][] jaggedTwoD(){

        int[][] newArray= new int[5][];
        int myCounter = 1 ;

        for ( int i = 0 ; i < 5 ; i++){
            newArray[i] = new int[i + 1];
            for ( int j = 0 ; j < i+1 ; j++){
                newArray[i][j] = myCounter;
                myCounter += 1;
            }

        }

        return newArray;




    }
}
