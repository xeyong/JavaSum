package ch02;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        int price = 3000;
        for (int i=0; i<books.length; i++){
            books[i] = new Book("책"+(i+1)+"권",price);
        }
        System.out.println("----책들의주솟값:"+books+"------");
        for(Book chong:books){
            System.out.println(chong.getTitle()+"//"+chong.getPrice()+"원"+"주소:"+chong);
        }
        Book[] books2 = new Book[5];
        Book[] books3 = books2;

        System.arraycopy(books, 0, books2,0,5);//얕은복사 주소값을 복사해준것
        System.out.println(books+"////"+books2);
        for(int i=0; i<5; i++){

            System.out.println(books[i]+"..."+books2[i]);// 각각의 참조변수가 같은 힙영역의 메모리를 가리키고있음
                                                         //왜냐하면 주소값을 복사해준것이기때문에
        }
       
    }
}
