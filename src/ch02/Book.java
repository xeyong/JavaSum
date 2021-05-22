package ch02;

public class Book {
    private String title;
    private int price;

    public Book(String title, int price){
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void showInfo(){
        System.out.println("저자:"+title+"가격:"+price);
    }
}
