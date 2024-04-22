package extra_success;

public class User {
	private String name;
	private String number;
	private boolean isPassed;
	
	public User(String _name, String _number, boolean _isPassed) {
		this.name = _name;
		this.number = _number;
		this.isPassed = _isPassed;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public boolean isPassed() {
		return isPassed;
	}
	
	public void setIsPassed(boolean _isPassed) {
		this.isPassed = _isPassed;
	}

	
}
