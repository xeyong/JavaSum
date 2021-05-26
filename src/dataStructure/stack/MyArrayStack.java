package dataStructure.stack;

import dataStructure.array.MyArray;

/*스택
1.FILO의 구조를가짐
2.삽입(push)삭제(pop)가 한쪽(top)에서만 일어난다
3.메서드가 호출되면 Stack메모리에 할당되는데 FILO구조로 메서드들이 호출된다
 */
public class MyArrayStack {
    MyArray arrayStack;
    int top;

    public MyArrayStack(){
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size){
        top = 0 ;
        arrayStack = new MyArray(size);
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }

        return arrayStack.removeElement(--top);

    }

    public boolean isFull(){
        if(top == arrayStack.ARRAY_SIZE){
            return true;
        }
        else
            return false;
    }

    public boolean isEmpty(){
        if(top == 0){
            System.out.println("stack is empty");
            return true;
        }
        else
            return  false;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stac is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(--top);
    }

    public void printAll(){
        arrayStack.printAll();
    }
}
