package ch02;

public class UserInfo {

    private int date;
    private String userId;
    private String userPassword;
    private String address;
    private int phoneNumber;
    private boolean isValid;

    public UserInfo() {
    }

    void showDate(){
        if(isValid){
            System.out.println("날짜는:"+date);
        }
        else {
            System.out.println("유효하지않은 날짜입니다!");
        }
    }
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        if(date>=1 && date <= 12){
            isValid = true;
            this.date = date;
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


