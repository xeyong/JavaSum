package ch06.defineexception;

public class PassWordTest {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PassWordException {
        if(password == null){
            throw new PassWordException("비밀번호는 null 일수 없습니다!");
        }
        else if(password.length() <5){
            throw new PassWordException("비밀번호는 5자이상이어야합니다");
        }
        else if(password.matches("[a-zA-Z]+")){
            throw new PassWordException("비밀번호는 특수문자나 숫자를 포함해야합니다");
        }

             this.password = password;

    }

    public static void main(String[] args) {
            PassWordTest pt = new PassWordTest();
            String pw = null;
            try {
                pt.setPassword(pw);
            } catch (PassWordException e) {
                System.out.println(e.getMessage());
            }
            pw ="abc";
            try {
                pt.setPassword(pw);
            } catch (PassWordException e) {
                System.out.println(e.getMessage());
            }
            pw = "abcde";
            try {
                pt.setPassword(pw);
            } catch (PassWordException e) {
                System.out.println(e.getMessage());
            }
            pw ="abcde!";
            try {
                pt.setPassword(pw);
            } catch (PassWordException e) {
                System.out.println(e.getMessage());
            }

    }
}
