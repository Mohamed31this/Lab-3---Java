package Exercise7;

public class Ex7 {
    public static double stdev(int[] arr){

        // Calculating the average first
        double avg = 0;

        for (int i = 0 ; i < arr.length ; i++){
            avg += arr[i] / (double) arr.length;
        }

        double result = 0;

        for (int j =0 ; j < arr.length ; j++){

            result += Math.pow((double) arr[j]-avg , 2);

        }
        result = Math.sqrt(result / (arr.length -1)) ;

        return result;
    }
}
