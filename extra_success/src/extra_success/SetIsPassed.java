package extra_success;

public class SetIsPassed {
	private User user;
	
	public SetIsPassed(User _user) {
		this.user = _user;
	}
	
	public void setExamResult(String isPassed) {
		switch(isPassed) {
		case "1":
			this.user.setIsPassed(true);
			break;
		case "2":
			this.user.setIsPassed(false);
			break;
		}
	}
}
