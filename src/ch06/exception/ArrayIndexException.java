package ch06.exception;

public class ArrayIndexException {

    public static void main(String[] args) {
        int[] iArr = {1,2,3,4,5};

        try{
            for(int i=0; i<6; i++){
                System.out.println(iArr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("정상");

    }
}
