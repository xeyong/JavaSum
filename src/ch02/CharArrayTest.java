package ch02;

public class CharArrayTest {

    public static void main(String[] args) {

        char[] charArr = new char[26];
        char ch = 'A';

        for(int i=0; i<charArr.length; i++){
            charArr[i] = ch++;
        }
        for (char alphabet:charArr){
            System.out.println(alphabet+","+(int)alphabet);
        }

        ArrayTest[] arrayTest = new ArrayTest[3];
        arrayTest[0] = new ArrayTest();
        arrayTest[1] = new ArrayTest();
        arrayTest[2] = new ArrayTest();

        for (int i =0; i<arrayTest.length; i++){
            System.out.println(arrayTest);
        }

    }
}
