package nnet.model.domain;

public class CustomerDTO {
	private String custId;
	private String custName;
	private int age;
	private int custMoney;
	private int mCode;
	
	public CustomerDTO() {
		super();
	}

	public CustomerDTO(String custId, String custName, int age, int custMoney, int mCode) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.age = age;
		this.custMoney = custMoney;
		this.mCode = mCode;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCustMoney() {
		return custMoney;
	}

	public void setCustMoney(int custMoney) {
		this.custMoney = custMoney;
	}

	public int getmCode() {
		return mCode;
	}

	public void setmCode(int mCode) {
		this.mCode = mCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomerDTO [custId=");
		builder.append(custId);
		builder.append(", custName=");
		builder.append(custName);
		builder.append(", age=");
		builder.append(age);
		builder.append(", custMoney=");
		builder.append(custMoney);
		builder.append(", mCode=");
		builder.append(mCode);
		builder.append("]");
		return builder.toString();
	}
}
