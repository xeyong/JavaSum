package demonstration;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student;
        ArrayList<Subject> subjects = new ArrayList<>();

        System.out.println("-------성적입력프로그램--------");
        System.out.println("======이름을 입력해주세요======");
        System.out.println("이름:");
        String name = scanner.next();
        student = new Student(name);


            while(true){
                System.out.println("======과목을 입력해주세요======");
                System.out.println("과목:");
                String subName = scanner.next();
                System.out.println("======성적을 입력해주세요======");
                System.out.println("점수:");
                int subScore = scanner.nextInt();
                subjects.add(new Subject(subName, subScore));
                System.out.println("과목을 그만입력하시려면 N을누르세요");
                if(scanner.next().equals("N")){
                    break;
                }
            }




        for(int i=0; i<subjects.size(); i++){
            System.out.println(student.getName()+"의  "+subjects.get(i).getSubName()+"과목 성적:"+subjects.get(i).getSubScore());
        }

    }
}

class Student{
    private String name;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Subject{
    private String subName;
    private int subScore;

    public Subject(String subName, int subScore){
        this.subName = subName;
        this.subScore = subScore;
    }

    public String getSubName() {
        return subName;
    }

    public int getSubScore() {
        return subScore;
    }

}
