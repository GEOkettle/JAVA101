package domain.userInfo.dao.mssql;

import domain.userInfo.UserInfo;
import domain.userInfo.dao.UserInfoDao;

public class UserInfoMsSqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		
		System.out.println("insert into mssql " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update set mssql " + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete from mssql " + userInfo.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfo userInfo) {
		System.out.println("select from mssql " + userInfo.getUserId());
		
	}
	
	

}
