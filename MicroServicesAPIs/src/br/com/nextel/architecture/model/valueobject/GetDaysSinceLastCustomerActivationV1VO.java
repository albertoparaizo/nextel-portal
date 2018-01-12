package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetDaysSinceLastCustomerActivationV1VO extends ValueObjectJson implements Cloneable {

	private GetDaysSinceLastCustomerActivationV1VO GetDaysSinceLastCustomerActivationV1VO;
	private boolean isClone = false;
	private String phoneNumber;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetDaysSinceLastCustomerActivationV1VO() {
		// TODO Auto-generated constructor stub
	}

	public GetDaysSinceLastCustomerActivationV1VO getGetDaysSinceLastCustomerActivationV1VO() {
		return this.GetDaysSinceLastCustomerActivationV1VO;
	}

	public void setGetDaysSinceLastCustomerActivationV1VO(
			GetDaysSinceLastCustomerActivationV1VO getDaysSinceLastCustomerActivationV1VO) {
		this.GetDaysSinceLastCustomerActivationV1VO = getDaysSinceLastCustomerActivationV1VO;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isClone() {
		return this.isClone;
	}

	public void setClone(boolean isClone) {
		this.isClone = isClone;
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * This method calls Object's clone().
	 * 
	 * @return
	 */
	public GetDaysSinceLastCustomerActivationV1VO getClone() {
		try { // call clone in Object.
			return (GetDaysSinceLastCustomerActivationV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() +
				"\"}, \"data\":{\"phoneNumber\":\""
				+ this.getPhoneNumber() + "\"}}";
		return s;
	}

}