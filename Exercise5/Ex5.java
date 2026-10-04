package Exercise5;

public class Ex5 {

    public static int[][] matrixAdd(int[][] arr1 , int[][] arr2){
        int[][] myOutputMatrix = new int[arr1.length][arr1[0].length];

        for (int i =0 ; i < arr1.length ; i++){
            for (int j = 0 ; j < arr1[i].length ; j++){
                myOutputMatrix[i][j]=arr1[i][j] + arr2[i][j];
            }
        }

        return myOutputMatrix;
    }
}
