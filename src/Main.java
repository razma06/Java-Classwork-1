import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputThree();
        System.out.println(SumOfDigits(554));
        MaxMin();
        SortArray();
    }

    public static void InputThree(){
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;

        try{
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            n3 = scanner.nextInt();
            System.out.println("Sum Of Numbers is: " +  (n1 + n2 + n3));
            System.out.println("Product Of Numbers is: " +  (n1 * n2 * n3));
        }catch (Exception error){
            System.out.println("you should enter numbers");
        }
    }

    public static int SumOfDigits(int number){
        int result = 0;
        while (number != 0){
            result+=number%10;
            number/=10;
        }

        return result;
    }

    public static void MaxMin(){
        double[] arr = new double[8];
        Random rand = new Random();
        for (byte i=0; i<arr.length; i++){
            arr[i] = rand.nextDouble(-100, 100);
        }

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (double v : arr) {
            System.out.print(v + ";");
            if (v < min) {
                min = v;
            } else if (v > max) {
                max = v;
            }
        }

        System.out.println("\n" + min);
        System.out.println(max);
    }

    public static void SortArray(){
        Integer[] arr = new Integer[8];
        Random rand = new Random();
        for (byte i=0; i<arr.length; i++){
            arr[i] = rand.nextInt(-128, 127);
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for(int number: arr){
            System.out.print(number + ";");
        }

    }


}