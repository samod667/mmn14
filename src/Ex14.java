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
     * O(1) * O(log n) = O(log n);
     *
     * Space Complexity:
     * O(1)
     *
     * @param a ---> array of integers
     * @return the single digit in the array
     */
    public static int findSingle(int[] a) {
        ///Checking cases of single int being first, last, or the only int in the array

        ///If condition ---> O(1)
        if (a.length == 1) {
            return a[0];
        } else if (a[0] != a[1]) {
            return a[0];
        } else if (a[a.length - 1] != a[a.length - 2]) {
            return a[a.length - 1];
        }

        ///Declaring variables for binary search
        int low = 0, mid, high = a.length - 1;

        ///initiates binary search based on location on if mid is odd or even
        ///Binary search time complexity ---> O(log n)
        while (low <= high) {
            mid = (low + high) / 2;

            if (mid % 2 == 0) {
                if (a[mid] == a[mid - 1]) {
                    high = mid - 2;
                } else if (a[mid] != a[mid + 1]) {
                    return a[mid];
                } else {
                    low = mid + 2;
                }
            } else {
                if (a[mid] == a[mid - 1]) {
                    low = mid + 1;
                } else if (a[mid] != a[mid + 1]) {
                    return a[mid];
                } else {
                    high = mid - 1;
                }
            }
        }
        ///Return -1 if no match was found :)
        return -1;
    }

    /**
     * A Function that will return the smallest subarray with the sum that is greater then x
     * If there is no sub array which its sum is bigger then param x -1 will be returned
     *
     * Runtime Complexity:
     * O(1) * O(n) = O(n)
     *
     * Space Complexity:
     * O(1)
     *
     * @param arr = array of integer
     * @param x   the number indexing the sub array
     * @return The index of the sub array. -1 if array is empty, or sub array was not found
     */
    public static int smallestSubSum(int[] arr, int x) {
        ///Initializing variables
        ///Space Complexity ---> O(1)
        int start = 0, end = 0, sum = 0, min_length = arr.length, length = arr.length;

        ///Initialize while loop
        ///Time Complexity ---> O(n)
        while (end < length) {
            ///Add to sum if sum is smaller then x, increment end
            while (sum <= x && end < length) {
                sum += arr[end];
                end++;
            }
            ///If sum is greater the x, change min_value, subtract from sun and increment start variable
            while (sum > x && start < length) {
                if (Math.abs(end - start) < min_length) {
                    min_length = Math.abs(end - start);
                    sum -= arr[start];
                    start++;
                } else {
                    sum -= arr[start];
                    start++;
                }
            }
        }
        ///Return -1 if no array was found
        ///If statement time complexity ---> O(1)
        if (start == 0 && min_length == length) {
            return -1;
        } else {
            ///Return the min_length == the smallest sub array greater then x
            return min_length;
        }
    }

    /**
     * A recursive function that gets an integer as a parameter, and returns the number of solution to the equation.
     *
     * @param num integer to check the number of equations for
     * @return the number of possibilities // also prints them out to the console
     */
    public static int solutions(int num) {
        //if statement checking validity of num
        if (num < 3 || num > 30) {
            return 0;
        } else {
            //num is validated - use helper function to calculate the number of possibilities for the equation
            return solutions(num, 1, 1, 1);
        }
    }

    ///HELPER METHOD FOR SOLUTION THAT CALCULATES ALL POSSIBILITIES///
    private static int solutions(int num, int x1, int x2, int x3) {
        ///Declaring number of valid solutions variable
        boolean isSolved = x1 + x2 + x3 == num;

        ///If statement to check if equation is a match
        if (isSolved) {
            ///Print solution to the console
            System.out.println(x1 + " + " + x2 + " + " + x3);
        }

        ///If isSolved increment
        int solutionsAdded = isSolved ? 1 : 0;

        ///Recursion call for all other possibilities
        if (x3 < 10 && x1 + x2 + x3 < num) {
            return solutionsAdded + solutions(num, x1, x2, ++x3);
        } else if (x2 < 10 && x1 + x2 < num) {
            return solutionsAdded + solutions(num, x1, ++x2, 1);
        } else if (x1 < 10 && x1 < num) {
            return solutionsAdded + solutions(num, ++x1, 1, 1);
        } else {
            return solutionsAdded;
        }
    }

    /**
     * A function that will receive a squared matrix and will return the number of available true regions
     *
     * @param matt = The squared matrix
     * @return int - number of true regions available
     */
    public static int cntTrueReg(boolean[][] matt) {
        return cntTrueReg(matt, 0, 0);
    }

    ///HELPER METHOD
    private static int cntTrueReg(boolean[][] matt, int i, int j) {
        if (i == matt.length) {
            return 0;
        }

        if (j == matt.length) {
            return cntTrueReg(matt, ++i, 0);
        }

        if (!matt[i][j]) {
            return cntTrueReg(matt, i, ++j);
        } else {
            resetArea(matt, i, j);
            return 1 + cntTrueReg(matt, i, ++j);
        }
    }

    ///HELPER METHOD THAT WILL FIND THE AREA OF THE REGION
    private static void resetArea(boolean[][] matt, int i, int j) {
        if (i < 0 || j < 0 || i == matt.length || j == matt.length) {
            return;
        }

        if (!matt[i][j]) {
            return;
        }

        if (matt[i][j]) {
            matt[i][j] = false;
        }

        resetArea(matt, i, j - 1);
        resetArea(matt, i - 1, j);
        resetArea(matt, i, j + 1);
        resetArea(matt, i + 1, j);

    }
}
