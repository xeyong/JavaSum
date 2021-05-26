package dataStructure.generic;

public class Point<T,V> {
    private T t;
    private V v;

    Point(T t, V v){
        this.t = t;
        this.v = v;
    }

    public T getX(){
        return t;
    }
    public V getY(){
        return v;
    }

}
class Point2<T,V,A>{

}
