package dataStructure.generic;

public class GenericMethod {

    public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2){
        double left = ((Number)p1.getX()).doubleValue();
        double right =((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();

        double width = right - left;
        double height = bottom - top;

        return width * height;

    }
    public static <T,V,A> void makeTest(Point<T,V> t1, Point2<T,V,A> t2){

    }

    public static void main(String[] args) {
        Point<Integer, Double> p1 = new Point<>(3, 3.14);
        Point<Integer, Double> p2 = new Point<>(4, 4.5);
        double d = GenericMethod.<Integer, Double>makeRectangle(p1,p2);
        System.out.println(d);
    }
}
