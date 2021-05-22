package ch02;

public class TwoDimenstionTest {
    public static void main(String[] args) {
        int[][] iArr = {
                {1,2,3},
                {5,6,7,8}
        };
        for (int i=0; i<iArr.length; i++){
            for(int j=0; j<iArr[i].length;j++){
                System.out.print(iArr[i][j]);
            }
        }

    }
}
