package ch02;

public class StudentTest {

    Student testStudent = new Student(7);
    //test. 인스턴스변수는 힙영역에 할당되는데 .을통해서 접근하는것은 주솟값을통해서 간다는소리라서 지역변수에.을찍을수있다는거지
    public static void main(String[] args) {

        Student studentA = new Student(30);
        Student studentB = new Student(40);

        System.out.println(studentA);//jvm의 힙영역의 주소값이 스택영역에저장
        System.out.println(studentB);

        String arr[] = new String[3];
        System.out.println(arr);//주소값
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }

    public void test(){
        Student a = new Student(45);
        a.getStudentNumber();
    }
}
