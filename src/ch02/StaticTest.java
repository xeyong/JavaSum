package ch02;

public class StaticTest {

    public static void main(String[] args) {

        YongStatic p1 = new YongStatic();
        System.out.println(p1.serialNum);//추천에 안뜨는 이유는 static이라서 클래스변수인데 참조변수를 통해서 접근하니까 추천이안뜨는거
        //YongStatic.serialNum;이런식으로 쓰라는거지
        YongStatic p2 = new YongStatic();
        p2.serialNum +=100;
        System.out.println(p2.serialNum); // static 변수는 다른 인스턴스여도 공유한다는 사실을 알 수 있다.

    }
}
