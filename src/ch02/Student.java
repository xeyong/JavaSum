package ch02;

public class Student {

    private int studentNumber;
    private String studentName;
    private int majorCode;
    private String majorName;
    private int grade;

    Student(int studentNumber){
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber(){
        return this.studentNumber;
    }//getter
    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }//setter


}
