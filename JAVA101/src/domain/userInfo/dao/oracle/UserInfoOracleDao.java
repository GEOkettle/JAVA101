package domain.userInfo.dao.oracle;

import domain.userInfo.UserInfo;
import domain.userInfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into Oracle" +userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("insert set Oracle" +userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete from Oracle" +userInfo.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfo userInfo) {
		System.out.println("select from Oracle" +userInfo.getUserId());
		
	}
	
	

}
