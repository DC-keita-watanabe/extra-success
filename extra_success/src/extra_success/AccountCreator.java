package extra_success;

public class AccountCreator {
	private static int number = 0;
	private User user;
	
	/**
	 * コンストラクタ
	 * @param userName
	 */
	public AccountCreator(String userName) {
		this.user = new User(userName, this.createExamNumber(number), false);
	}
	
	/*
	 * 4桁の受験番号を発行するメソッド
	 */
	private String createExamNumber(int number) {
		return String.format("%04d", ++number);
	}
	
	/**
	 * ユーザーインスタンスをかえすめそっど
	 * @return
	 */
	public User getUser() {
		return this.user;
	}
}
 