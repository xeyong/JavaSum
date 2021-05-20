package ch01;
//문자형 char
public class CharTest {
    public static void main(String[] args) {
        char ch1 = 'a';//2byte인 이유가 알파벳은 한문자에 1byte이지만 다른글자들은 아니라서 기본 2byte
        char ch2 = 66;
        System.out.println((int)ch1+"//"+ch2);

        //char ch3 = 'uD550';//u는 유니코드

    }

}
