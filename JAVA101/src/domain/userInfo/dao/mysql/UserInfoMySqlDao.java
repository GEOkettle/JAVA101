package domain.userInfo.dao.mysql;

import domain.userInfo.UserInfo;
import domain.userInfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userID = " + userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update set MySQL DB userID = " + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete from MySQL DB userID = " + userInfo.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfo userInfo) {

		System.out.println("select from MySQL DB userID = " + userInfo.getUserId());
		
	}

}
