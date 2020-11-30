/**
 * Solution for mmn 14
 *
 * @author Dor Samoha
 * ID: 312503287
 * @version Nov 22nd, 2020
 */

public class Ex14 {
    /**
     * A function that returns the integer that appears only once in the array.
     * If an integer was not found, -1 will be returned.
     *
     * Runtime:
     * O(n) * (O1) = O(n)
     * @return the single digit in the array
     * @param a = array of integers
     */
    public static int findSingle(int[] a) {
        //If statement checking extreme cases, first and last index of array
        //Runtime:
        //O(1)
        if(a.length == 1){
            return a[0];
        } else if(a[a.length - 1] != a[a.length - 2]){
            return a[a.length -1];
        }
        //For loop to check the other indexes in the array
        //Runtime:
        //O(n)
        for (int i = 2; i < a.length - 1; i += 2) {
            if(a[i] != a[i + 1]){
                return a[i];
            }
        }
        //Return -1 if no match was found
        return -1;
    }


    /**
     * A Function that will return the index of the sub array which its sum is bigger then param x
     * If the array is empty or there is no sub array which its sum is bigger then param x -1 will be returned
     *
     * Runtime:
     * O(1) * O(n) = O(n)
     *
     * @param arr = array of integers
     * @param x = a number which will
     * @return The index of the sub array. -1 if array is empty, or sub array was not found
     */
    public static int smallestSubSum(int arr[], int x) {
        //Declaring sum variable - O(1)
        int sum = 0;

        //For loop calculating count on the arr.length --> O(n)
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            //If condition --> O(1)
            if(sum >= x){
                return i;
            }
        }
        return -1;
    }

    /**
     * Solutions int.
     */
    public static int solutions(int num) {
        if(num < 3 || num > 30){
            return 0;
        }
        return 0;
    }

    /**
     * The entry point of application.
     */
    public static void main(String[] args) {

        int[] array1 = new int[]{6, 6, 18, 18, -4, -4, 12, 9, 9};
        int[] array2 = new int[]{8,8,-7,-7,3,3,0,0,10,10,5,5,4};
        int[] array3 = new int[]{4,4,6,6,1,8,8};
        int[] array4 = new int[]{1,1,3,4,4};
        int[] array5 = new int[]{7,7,8,8,0,0};
        int[] array6 = new int[]{5};


        int[] array7 = new int[]{1,4,45,6,0,19};
        int[] array8 = new int[]{1,10,5,2,7};
        int[] array9 = new int[]{1,11,100,1,0,200, 3, 2, 1, 250};
        int[] array10 = new int[3];



        System.out.println(smallestSubSum(array10, 20));



    }
}
