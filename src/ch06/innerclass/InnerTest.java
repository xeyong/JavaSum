package ch06.innerclass;

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }

    private class InClass{
        int iNum = 100;
        //static int sInNum = 500;이너클래스는 외부클래스가 생성된뒤 생성되기때문에
        
        void inTest(){
            System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");

        }
    }

    public void usingClass(){
        inClass.inTest();//내부클래스는 주로 외부클래스에서 사용한다.
    }

    static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;

        void inTest(){
            //System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");정적 클래스가 외부클래스의 생성과 상관없이 사용될수있으므로 인스턴스멤버 사용불가
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
        }
        static void inTest2(){
            //System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");정적 클래스가 외부클래스의 생성과 상관없이 사용될수있으므로 인스턴스멤버 사용불가
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            //System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");정적 메소드가 클래스의 생성과 상관없이 사용될수 있으므로 인스턴스멤버 사용불가 
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass oc = new OutClass();
        oc.usingClass();

        /*
        OutClass c = new OutClass();
        OutClass.InClass i = c.new InClass();
        i.inTest();
        */
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();//정적내부클래스는 외부클래스의 객체를 생성하지않고도 객체생성이 가능하다.
        sInClass.inTest();
        OutClass.InStaticClass.inTest2();//static메서드는 바로 사용가능
    }

}

