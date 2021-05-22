package ch02;

public class YongStatic {

    public static int serialNum = 1000;

    private String name;
    private int id;
    private int age;

    public YongStatic(){
        serialNum++;
        id = serialNum;//인스턴스가 생성될때마다 id값을 올려서 사용
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

