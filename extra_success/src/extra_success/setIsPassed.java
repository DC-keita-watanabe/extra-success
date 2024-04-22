package extra_success;

public class setIsPassed {
	private User user;
	private String isPassed;
	
	public setIsPassed(User _user, String _isPassed) {
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
