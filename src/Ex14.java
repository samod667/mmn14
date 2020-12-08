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
     * Runtime Complexity:
     * O(n / 2) * O(1) * O(1) = O(n / 2)
     *
     * Space Complexity:
     * O(1)
     *
     * @param a = array of integers
     * @return the single digit in the array
     */
    public static int findSingle(int[] a) {
        //For loop to go over the array and look for the non repeating integer --> O(n /2)
        for (int i = 0; i < a.length; i = i + 2) {
            //checking first and last cases - if statement --> O(1)
            if (i == a.length - 1) {
                return a[i];
            }
            //Check for the only integer in the array -- if statement -->O(1)
            if (a[i] != a[i + 1]) {
                return a[i];
            }
        }
        //If all integer are repeating return -1
        return -1;
    }

    /**
     * A Function that will return the index of the sub array which its sum is bigger then param x
     * If the array is empty or there is no sub array which its sum is bigger then param x -1 will be returned
     *
     * Runtime Complexity:
     * O(1) * O(n) = O(n)
     *
     * Space Complexity:
     * O(1)
     *
     * @param arr = array of integers
     *            //     * @param x = a number which will
     * @param x the number indexing the sub array
     * @return The index of the sub array. -1 if array is empty, or sub array was not found
     */
    public static int smallestSubSum(int[] arr, int x) {
        //Declaring sum variable - O(1)
        int sum = 0;

        //For loop calculating sum on the arr.length --> O(n)
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            //If condition --> O(1)
            if (sum >= x) {
                return i;
            }
        }
        return -1;
    }

    /**
     * A recursive method that gets an integer as a parameter, and returns the number of  solution to the equation.
     *
     * @param num integer to check the number of equations for
     * @return the number of possibilities // also prints them out to the console
     *
     *
     * Space complexity = O(1)
     * Runtime complexity = O(1)
     */
    public static int solutions(int num) {
        //if statement checking validity of num --> O(1)
        if (num < 3 || num > 30) {
            return 0;
        } else {
            //num is validated - use helper function to calculate the number of possibilities for the equation
            return solutions(num, 1, 1, 1);
        }
    }

    ///HELPER METHOD FOR SOLUTION///
    private static int solutions(int num, int x1, int x2, int x3) {
        ///Declaring number of valid solutions variable --> O(1)
        int validSolutions = 0;

        ///If statement to check if equation is a match -- if it is increment validSolutions variable. --> O(1)
        if (x1 + x2 + x3 == num) {
            ///Print solution to the console
            System.out.println(x1 + " + " + x2 + " + " + x3 + " = " + num);
            validSolutions = 1;
        }

        ///If statement checking if each digit in the equation, increment it if needed. ---> O(1)
        if (x3 < 10 && x1 + x2 + x3 < num) {
            return validSolutions + solutions(num, x1, x2, ++x3);
        } else if (x2 < 10 && x1 + x2 < num) {
            return validSolutions + solutions(num, x1, ++x2, 1);
        } else if (x1 < 10 && x1 < num) {
            return  validSolutions + solutions(num, ++x1, 1, 1);
        } else {

            return validSolutions;
        }
    }

    /**
     *
     * @param matt
     * @return
     */
    public static int cntTrueReg(boolean[][] matt){
        return 0;
    }

    /**
     * The entry point of application.
     */
    public static void main(String[] args) {

        int[] array1 = new int[]{6, 6, 18, 18, -4, -4, 12, 9, 9};
        int[] array2 = new int[]{8, 8, -7, -7, 3, 3, 0, 0, 10, 10, 5, 5, 4};
        int[] array3 = new int[]{4, 4, 6, 6, 1, 8, 8};
        int[] array4 = new int[]{1, 1, 3, 4};
        int[] array5 = new int[]{7, 7, 8, 8, 0, 0};
        int[] array6 = new int[]{5};


        int[] array7 = new int[]{1, 4, 45, 6, 0, 19};
        int[] array8 = new int[]{1, 10, 5, 2, 7};
        int[] array9 = new int[]{1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int[] array10 = new int[3];


        System.out.println(solutions(14));


    }
}
