package ch04;

public class Student implements Cloneable {
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName){
        this.studentName = studentName;
        this.studentNum = studentNum;
    }

    @Override
    public String toString(){
        return studentName+","+studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){//Object타입으로 선언했을경우도 구현하기위해
            Student std = (Student)obj;
            if(this.studentNum == std.studentNum)
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;//만약 equals()재정의하여서 논리적으로 비교하여 true를 반환하도록 했으면
                          //hashCode()도 재정의하여서 논리적 값을 반환하도록 해야한다.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
