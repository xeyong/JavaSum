package dataStructure.generic;

public class ThreeDPrinter3 {
    private Object material;//옛날방식은 Object를 이용해서 어떠한 타입도 넣을수있게 해줬음

    public Object getMaterial() {
        return material;
    }//하지만 get할때 다시 downcasting해줘야하는 번거로움이 발생

    public void setMaterial(Object material) {
        this.material = material;
    }
}
