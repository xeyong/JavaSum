package ch02;
//this:-인스턴스 자신의 메모리를 가리킴
//     -생성자에서 또 다른 생성자를 호출 할때 사용
//     -자신의 주소(참조값)을 반환 함
public class This {

    public This(){
        //System.out.println("dd");->this()이전에 다른 코드를 쓸수없다 왜냐하면 생성자의 역할은
        //인스턴스를 초기화하는것인데 this()가있을경우 아직 초기화가 다 안됬다는말이기때문
        this("seyong");//다른 생성자를 호출할때 this를 사용하고
    }
    public This(String a){
        System.out.println(a);
    }

    public This getThis(){
        return this;
    }
}
