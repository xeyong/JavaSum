package dataStructure.generic;

public class GenericPrinter<T extends Material> {//extends를 통해서 T의 데이터타입에 제한을둠
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }
    //컴파일시에 T부분을 인스턴스생성시에 정의한 데이터타입으로 컴파일러가 변화시켜줌
}
