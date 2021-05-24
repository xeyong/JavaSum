package ch04;
//  String은 ""로 객체를 생성할경우에 String constant pool에 같은 논리적 값이 있는지확인하고
//   있으면 그 주소값을 리턴하고, 없는경우에는 새로운 객체를 만들어 String constant pool에 할당한뒤 그주소값을 리턴한다.
//   반면 new 키워드를 통해 생성할경우에 다른 인스턴스처럼 각각의 객체를 생성하고 그 주소값을 리턴한다.
//   단, String pool에 값이 없다면 string pool에 한개 heap 영역에 1개 총 2개의 객체를 생성한다.
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("spring", "김영한");
        String str = "이미재정의";
        Integer a = 30;
        System.out.println(str);//String과 Integer 클래스는 이미 toString()이 재정의가 되어있어서 toString을 따로 재정의하지않아도
        System.out.println(a);//주솟값이 아닌 실제값이 출력됨
        System.out.println(book.toString());//Book클래스는 toString()을 재정의 하지않는다면 참조변수의 주솟값이 나오게된다.

        String astr = new String("dd");
        String bstr = new String("dd");
        if(astr == bstr){// == 연산자는 물리적으로 같은지를 비교하는 연산자이다
            System.out.println("dd");
        }else{
            System.out.println("asd");
        }
        if(astr.equals(bstr)){//Object의 equals()는 물리적(주소값)을 비교하는것이지만 String에서는 재정의 하여서 논리적으로 비교하게 만들어줬다
                              //그래서 String타입의 값을 비교할때 == 을쓰는것이아니라 .equals()써야한다
                              //일반적으로 new를 통해서 String객체를 만들지않을경우에는 같은 논리값을 가지는경우
            System.out.println("dd");
        }else{
            System.out.println("asd");
        }

        String dd = "dds";
        String db = "dds";
        if(dd == db){
            System.out.println("zzz");
        }
    }
}

class Book{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
