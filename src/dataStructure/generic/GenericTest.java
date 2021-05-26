package dataStructure.generic;

public class GenericTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        GenericPrinter<Powder> gp = new GenericPrinter<>();
        gp.setMaterial(powder);
        System.out.println(gp.toString());

        Powder p = gp.getMaterial();//다운캐스팅이 필요x
        System.out.println(p.toString());

       // GenericPrinter<String> gp2 = new GenericPrinter<>(); 타입제한으로 아무런 클래스가아닌 Material을 상속하는 클래스를 사용가능
        GenericPrinter<Material> dd = new GenericPrinter<>();
    }
}
