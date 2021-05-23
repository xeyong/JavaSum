package ch03.userinfo.web;

import ch03.domain.userinfo.UserInfo;
import ch03.domain.userinfo.dao.UserInfoDao;
import ch03.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch03.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");//db.properties를 읽어드림

        Properties prop = new Properties();// key value 쌍으로 값을 읽어드리는 객체
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");//키에 해당되는 value값을 반환해줌

        UserInfo userInfo = new UserInfo();

        UserInfoDao userInfoDao = null;//어떤 객체를 쓸지 안정해서 null로 해둠

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }
        else if(dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMySqlDao();
        }
        else{
            System.out.println("db error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
    }
}
