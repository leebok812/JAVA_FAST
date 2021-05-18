package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("db.properties");

		Properties prop = new Properties();// 쌍으로 되어있는 애들을 읽을수 있는것 ex) DBTYPE=MYSQL // a = 뭐뭐뭐
		prop.load(fis);

		String dbType = prop.getProperty("DBTYPE");

		UserInfo userInfo = new UserInfo(); // 원래는 웹상에서 만들어져서 읽어들어오는것이지만 구축한 사이트가 없기에 대용
		userInfo.setUserId("12345");
		userInfo.setPassward("!@(#&@");
		userInfo.setUserName("LEE");
		
		UserInfoDao userInfoDao = null;

		if (dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		} else if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		} else {
			System.out.println("DB ERROR");
			return;
		}

		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
