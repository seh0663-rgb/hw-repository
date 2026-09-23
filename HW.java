import java.util.Random;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = createRandomArray(size);

        do {
            System.out.println("Array Operations Menu (0 to quit)");
            System.out.println("1. Find Minimum Element");
            System.out.println("2. Find Maximum Element");
            System.out.println("3. Elements' Distance to Average");
            System.out.println("4. Array Odd and Even Index Sum");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();
            if (option == 0) {
                System.out.println("Exiting the program.");
            } else if (option == 1) {
                System.out.println("The minimum element in the array is " + minimum(arr));
            } else if (option == 2) {
                System.out.println("The maximum element in the array is " + maximum(arr));
            } else if (option == 3) {
                System.out.println("The distance of each element from the average is: " + java.util.Arrays.toString(averageDiff(arr)));
            } else if (option == 4) {
                System.out.println("The sum of odd indexed elements is: " + sumOdd(arr) + " and the sum of even indexed elements is: " + sumEven(arr));
            }
        } while (option != 0);

        scanner.close();  
    }

    public static int minimum(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int maximum(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i + 1] > arr[i]){
                max = arr[i + 1];
            }
        }
        return max;
    }
    public static int[] averageDiff(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        int average = sum / arr.length;

        int[] arr2 = new int[arr.length];
        for(int i = 0; i< arr2.length; i++){
            arr2[i] = arr[i] - average;
        }
        return arr2;
    }

public static int[] createRandomArray(int size) {
    Random random = new Random();
    int[] array = new int[size];

    for (int i = 0; i < size; i++) {
        array[i] = random.nextInt(101); // 0–100 inclusive
    }

    return array;
}

public static int sumOdd(int[] arr) {
    int sum = 0;
    for(int i = 0 ; i < arr.length ; i++) {
        if(arr[i] % 2 != 0) {
         sum += arr[i];
        }
    }
    return sum;
}
 public static int sumEven(int[] arr) {
    int sum = 0;
    for(int i = 0 ; i < arr.length ; i++) {
        if(arr[i] % 2 == 0) {
         sum += arr[i];
        }
    }
    return sum;
}

}