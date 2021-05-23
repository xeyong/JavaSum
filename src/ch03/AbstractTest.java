package ch03;

public abstract class AbstractTest {
    
    public int a;
    
    public AbstractTest(){
        
    }//추상클래스도 생성자를 포함해야한다 왜냐하면 하위클래스 객체를 생성할때 super를 통해서 불려야하기때문에
    
    public abstract void test();//추상메서드는 추상클래스에서만 올수있음

    public void test2(){

    }//일반 메서드도 추상클래스에서 구현가능하다

}
