package extra_success;

import java.util.ArrayList;

public class ExamResultManager {
	private static ArrayList userList = new ArrayList();
	
	/**
	 * userListに受験情報を持ったuserインスタンスを
	 * 格納するメソッド
	 * @param userName
	 */
	public static void addUser(String userName) {
		AccountCreator accountCreator  = new AccountCreator(userName);
		userList.add(accountCreator.getUser());
		System.out.println(accountCreator.getUser().toString());
	}
}
