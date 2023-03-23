package web.userInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import domain.userInfo.UserInfo;
import domain.userInfo.dao.UserInfoDao;
import domain.userInfo.dao.mssql.UserInfoMsSqlDao;
import domain.userInfo.dao.mysql.UserInfoMySqlDao;
import domain.userInfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		//대충 파일 찾아서 키:밸류 가져오는 util
		FileInputStream fis = new FileInputStream("src/db.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		System.out.println(dbType);
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("geo");
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("MYSQL")) userInfoDao = new UserInfoMySqlDao();
		else if(dbType.equals("MSSQL")) userInfoDao = new UserInfoMsSqlDao();
		else if(dbType.equals("ORACLE")) userInfoDao = new UserInfoOracleDao();
		else System.out.println("db error"); 
		
//		System.out.println(userInfo.getUserId());
		userInfoDao.insertUserInfo(userInfo);
			
	}

}
 
