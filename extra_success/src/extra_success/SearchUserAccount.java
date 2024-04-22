package extra_success;

import java.util.ArrayList;

public class SearchUserAccount {
	String userNameOrNumber;
	ArrayList<User> userList;
	
	/**
	 * コンストラクタ
	 * @param _userNameOrNumber
	 * @param _userList
	 */
	public SearchUserAccount(String _userNameOrNumber, ArrayList<User> _userList) {
		this.userNameOrNumber = _userNameOrNumber;
		this.userList = _userList;
	}
	
	/**
	 * 受験者氏名か受験番号が存在するか検索するメソッド
	 * @param userNameOrNumber
	 * @return
	 */
	public User findUserAccount() {
		for(User user: userList) {
			if(userNameOrNumber.equals(user.getNumber())) {
				return user;
			}
			if(userNameOrNumber.equals(user.getNumber())) {
				return user;
			}
		}
		return null;
	}
}
