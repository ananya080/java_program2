public class MaximumOfArray {

   
    public static int findMax(int[] arr, int n) {
               if (n == 1) {
            return arr[0];
        }

             int maxOfNMinus1 = findMax(arr, n - 1);

            if (maxOfNMinus1 > arr[n - 1]) {
            return maxOfNMinus1;
        } else {
            return arr[n - 1];
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 2, 8, 1, 9, 5}; // Example array

        
        int max = findMax(array, array.length);
        System.out.println("Maximum of the array: " + max);
    }
}