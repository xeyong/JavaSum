package demonstration;

public class Test1{

    public static void main(String[] args) {
        InfoTest infoTest = new InfoTest("토마스", 37, 78,180,01);
        infoTest.print();

    }

}
class InfoTest {
    private String name;
    private int age;
    private int height;
    private int weight;
    private int sexCode;

    public InfoTest(String name, int age, int height, int weight, int sexCode){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sexCode = sexCode;
    }

    public void print(){
        String sex = null;
        if(sexCode == 01){
            sex = "남";
        }
        else if(sexCode == 02){
            sex = "여";
        }
        System.out.println("이름:"+name+"나이:"+age+"키:"+height+"몸무게:"+weight+"성별:"+sex);
    }
}

class OrderTest{
    private int orderNum;
    private int phoneNum;
    private String address;
    private String date;
    private String time;
    private int price;
    private int menuNum;

    public OrderTest(int orderNum, int phoneNum, String address, String date, String time, int price, int menuNum){
        this.orderNum = orderNum;
        this.phoneNum = phoneNum;
        this.address = address;
        this.date = date;
        this.time = time;
        this.price = price;
        this.menuNum = menuNum;
    }

}