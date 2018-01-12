package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetCancellationFeeV1VO extends ValueObjectJson implements Cloneable {

	private GetCancellationFeeV1VO getCancellationFeeV1VO;
	private boolean isClone = false;
	private String customerCode;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetCancellationFeeV1VO() {
		// TODO Auto-generated constructor stub
	}

	public boolean isClone() {
		return this.isClone;
	}

	public void setClone(boolean isClone) {
		this.isClone = isClone;
	}

	public GetCancellationFeeV1VO getGetCancellationFeeV1VO() {
		return this.getCancellationFeeV1VO;
	}

	public void setGetCancellationFeeV1VO(GetCancellationFeeV1VO getCancellationFeeV1VO) {
		this.getCancellationFeeV1VO = getCancellationFeeV1VO;
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
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
	public GetCancellationFeeV1VO getClone() {
		try { // call clone in Object.
			return (GetCancellationFeeV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() + "\"}, \"data\":{\"customerCode\":\""
				+ this.getCustomerCode() + "\"}}";
		return s;
	}

}