public class Driver{
    public static void main(){
        //        int[] array1 = new int[]{6, 6, 18, 18, -4, -4, 12, 9, 9};
//        int[] array2 = new int[]{8, 8, -7, -7, 3, 3, 0, 0, 10, 10, 5, 5, 4};
//        int[] array3 = new int[]{4, 4, 6, 6, 1, 8, 8};
//        int[] array4 = new int[]{1, 1, 3, 4};
//        int[] array5 = new int[]{7, 7, 8, 8, 0, 0};
//        int[] array6 = new int[]{5};
//        int[] arr1 = new int[]{7, 7, 3,4, 4, 0,0,8,8};
//
//
//        int[] array7 = new int[]{1, 4, 45, 6, 0, 19};
//        int[] array8 = new int[]{1, 10, 5, 2, 7};
//        int[] array9 = new int[]{1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
//        int[] array10 = {3};
//
//        boolean[][] matt = {{false,false,false,false,true}, {false, true,true,true,false},{false,false,true,true,false}, {true,false,false,false,false}, {true,true,false,false,false}};
//
//        boolean[][] matt2 = {{true, false, true, true}, {true, false, false, false}, {true, false, true, true}, {true, false, false, false}};
//
//
//        System.out.println(cntTrueReg(matt));
//        System.out.println(cntTrueReg(matt2));


        System.out.println ("********** Question 1 **********\n");

        int[] array1 = {6,6,18,18,-4,-4,12,9,9};
        System.out.println("Checking method findSingle on array [6,6,18,18,-4,-4,12,9,9]\n");
        int studentResult;

        studentResult= Ex14.findSingle(array1);
        System.out.println("Result is: "+studentResult);
        System.out.println();

        System.out.println ("********** Question 2 **********\n");
        int[] array2 = {1,4,45,6,0,19};
        int x = 5;
        System.out.println("Checking method smallestSubSum on array [1,4,45,6,0,19]\n");
        studentResult= Ex14.smallestSubSum(array2,x);
        System.out.println("Result is: "+studentResult);
        System.out.println();
        System.out.println ("********** Question 3 **********\n");

        System.out.println("Checking method solutions with number 4\n");

        studentResult= Ex14.solutions(4);
        System.out.println();
        System.out.println("Result is: "+studentResult);
        System.out.println();

        System.out.println("********** Question 4**********\n");

        boolean[][] mat = {
                {false,false,false,false,true},
                {false,true,true,true,false},
                {false,false,true,true,false},
                {true,false,false,false,false},
                {true,true,false,false,false},
        };

        System.out.println ("Checking method cntTrueReg with the matrix:\n");
        printMat (mat);

        int studentCntRegResult=Ex14.cntTrueReg(mat);
        System.out.println();
        System.out.println("Result is: "+studentCntRegResult);

    }

    public static void printMat(boolean [][]mat){
        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++)
                if(mat[i][j]== true)
                    System.out.print("1\t");
                else
                    System.out.print("0\t");
            System.out.println();
        }
    }
}