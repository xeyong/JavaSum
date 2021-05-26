package dataStructure.array;
/*배열
1.생성할때 메모리에 정해진 크기를 할당받는다
2.수정/삭제시에 element들의 이동이 필요하여서 수행속도가 느리다
3.index를 활용해 검색에있어서 수행속도가 빠르다 O(1)
  ex)int[] a = new int[3];
     a[2]의 위치는 주소값+(2*4byte)
4.ArrayList, Vector
 */
public class MyArray {
    int[] intArr;   	//int array
    int count;  		//개수

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray()
    {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size)
    {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void addElement(int num)
    {
        if(count >= ARRAY_SIZE){
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num;

    }

    public void insertElement(int position, int num)//중간에 삽입시 요소들을 뒤로 밀어내는 메서드
    {
        int i;

        if(count >= ARRAY_SIZE){  //꽉 찬 경우
            System.out.println("not enough memory");
            return;
        }

        if(position < 0 || position > count ){  //index error
            System.out.println("insert Error");
            return;
        }

        for( i = count-1; i >= position ; i--){
            intArr[i+1]  = intArr[i];        // 하나씩 이동
        }

        intArr[position] = num;
        count++;
    }

    public int removeElement(int position)//삭제시 메서드
    {
        int ret = ERROR_NUM;

        if( isEmpty() ){
            System.out.println("There is no element");
            return ret;
        }

        if(position < 0 || position >= count ){  //index error
            System.out.println("remove Error");
            return ret;
        }

        ret = intArr[position];

        for(int i = position; i<count -1; i++ )
        {
            intArr[i] = intArr[i+1];
        }
        count--;
        return ret;
    }

    public int getSize()
    {
        return count;
    }

    public boolean isEmpty()
    {
        if(count == 0){
            return true;
        }
        else return false;
    }

    public int getElement(int position)
    {
        if(position < 0 || position > count-1){
            System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
            return ERROR_NUM;
        }
        return intArr[position];
    }

    public void printAll()
    {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        for(int i=0; i<count; i++){
            System.out.println(intArr[i]);
        }

    }

    public void removeAll()
    {
        for(int i=0; i<count; i++){
            intArr[i] = 0;
        }
        count = 0;
    }

}
