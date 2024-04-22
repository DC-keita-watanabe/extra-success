package extra_success;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ExamResultManager {
	private static ArrayList<User> userList = new ArrayList<>();
	
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
	
	/**
	 * ユーザーアカウントを検索して、ヒットすれば
	 * 試験結果を入力することができる
	 */
	public static void  setExamResult(String userNameOrNumber) {
		SearchUserAccount searchUserAccount = new SearchUserAccount(userNameOrNumber, userList);
		Scanner scanner = new Scanner(System.in);
		User userAccount = searchUserAccount.findUserAccount();
		if(Objects.isNull(userAccount)) {
			System.out.println("ユーザーアカウントが存在しません。");
		}else {
			System.out.println("該当する項目を入力してください\n  合格：1　　不合格：2");
			String isPassed = scanner.next();
			SetIsPassed setIsPassed = new SetIsPassed(userAccount);
			setIsPassed.setExamResult(isPassed);
			System.out.println(userAccount);
		}
		
	}
	
}
