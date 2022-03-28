package matrix;

import java.util.Vector;

public class p_1_spiralTransformation {
//    Given a matrix of size r*c. Traverse the matrix in spiral form.
    /*
        Input:
    r = 4, c = 4
    matrix[][] = {{1, 2, 3, 4},
            {5, 6, 7, 8},
               {9, 10, 11, 12},
               {13, 14, 15,16}}
    Output:
    1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

*/
    public static void main(String[] args) {
        int r = 4 , c=4;

        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}
        };

        int top = 0;
        int bottom = r-1;
        int left = 0;
        int right = c-1;

        Vector<Integer> ans = null;

        while(top <= bottom && left <= right){

            for(int i =left; i<= right ; i++){
                ans.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i<= bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            if(top<= bottom){
                for (int i =0; i >= left; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right ){
                for(int i = bottom; i>= top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }


        }

    }
}
