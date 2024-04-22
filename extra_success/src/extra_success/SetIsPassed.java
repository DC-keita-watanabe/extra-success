package extra_success;

public class SetIsPassed {
	private User user;
	private String isPassed;
	
	public SetIsPassed(User _user, String _isPassed) {
		this.user = _user;
		this.isPassed = _isPassed;
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
