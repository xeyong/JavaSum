package ch02;

public class MakeReport {
    private final String line="======================================\n";
    private String title="====제목:test // 날짜:ㅇㅇ // 시간: ㅇㅇ====\n";
    StringBuffer stringBuffer;

    MakeReport(){
        stringBuffer = new StringBuffer();
    }

    private void makeHeader(){//클라이언트입장에서 알필요가 없는 정보들을 encapsulation 함
        stringBuffer.append(line);
        stringBuffer.append(title);
        stringBuffer.append(line);
    }

    private void makeFooter(){
        stringBuffer.append(line);
    }

    StringBuffer makeBody(String body){
        makeHeader();
        stringBuffer.append(body+"\n");
        makeFooter();
        return stringBuffer;
    }



}
