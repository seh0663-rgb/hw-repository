public class HW {
    public static void main(String[] args) {
        
    }

    public int minimumn(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]){
                min = arr[i];
            }
        }
        return min;
    }

    public int maximum(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i + 1] > arr[i]){
                max = arr[i + 1];
            }
        }
        return max;
    }
    public int[] averageDiff(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            
        }
    }
}