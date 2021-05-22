package ch02;

public class SingletonTest {

    private static SingletonTest singletonTest = new SingletonTest();//인스턴스를 생성하고 

    private SingletonTest(){//생성자를 private로 해줌으로서 외부에서 인스턴스 생성을 막는다
    }

    public static SingletonTest getInstance(){
        if(singletonTest == null){
            singletonTest = new SingletonTest();
        }
        return singletonTest;//생성자를 통한 인스턴스 생성을 막았기때문에 .method()통한 인스턴스 리턴을 해주는 static메서드를 만들어준다
    }

}
