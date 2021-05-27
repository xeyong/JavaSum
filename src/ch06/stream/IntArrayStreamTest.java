package ch06.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for( int num:arr){
            System.out.println(num);
        }

        Arrays.stream(arr).forEach(x-> System.out.println(x));

        IntStream is = Arrays.stream(arr);
        is.forEach(k-> System.out.println(k+1));
        System.out.println(Arrays.stream(arr).sum());



    }
}
