package ch02;

public class ThisTest {
    public static void main(String[] args) {
        This test = new This();
        This test2 = test.getThis();//return this = 자신의 주소값을 반환함

        System.out.println(test);
        System.out.println(test2);
        
        if(test == test2){
            System.out.println("같아염");
        }
        else{
            System.out.println("달라염");
        }
    }
}
