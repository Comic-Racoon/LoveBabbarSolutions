package matrix;

public class p_2_SeaarcIn2DMatrix {
//    Write an efficient algorithm that searches for a value
//    target in an m x n integer matrix matrix. This matrix
//    has the following properties:
//
//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the
// last integer of the previous row.

    //Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]],
    // target = 3
    //Output: true

    public static void main(String[] args) {
        int r = 4 , c=4;

        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}
        };

        int num = 88;
        boolean flag = false;
        for(int i =0; i<= r-1; i++){
            for (int j = 0; j <= c-1; j++){
                if(matrix[i][j] == num){
                    flag = true;
                    break;
                }
            }
        }

        System.out.println(flag);

    }
}
