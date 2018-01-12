package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetCustomerAddressListV1VO extends ValueObjectJson implements Cloneable {

	private GetCustomerAddressListV1VO getCustomerAddressListV1VO;
	private boolean isClone = false;
	private String clientId;
	private String documentNumber;
	private String costCenterId;
	private String contactReasonCode;

	
	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetCustomerAddressListV1VO() {
		// TODO Auto-generated constructor stub
	}

	public GetCustomerAddressListV1VO getGetCustomerAddressListV1VO() {
		return this.getCustomerAddressListV1VO;
	}

	public void setGetCustomerAddressListV1VO(GetCustomerAddressListV1VO getCustomerAddressListV1VO) {
		this.getCustomerAddressListV1VO = getCustomerAddressListV1VO;
	}

	public String getCostCenterId() {
		return this.costCenterId;
	}

	public void setCostCenterId(String costCenterId) {
		this.costCenterId = costCenterId;
	}

	public String getContactReasonCode() {
		return this.contactReasonCode;
	}

	public void setContactReasonCode(String contactReasonCode) {
		this.contactReasonCode = contactReasonCode;
	}

	public boolean isClone() {
		return this.isClone;
	}

	public void setClone(boolean isClone) {
		this.isClone = isClone;
	}

	public String getDocumentNumber() {
		return this.documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
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
	public GetCustomerAddressListV1VO getClone() {
		try { // call clone in Object.
			return (GetCustomerAddressListV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() +
				"\"}, \"data\":{\"documentNumber\":\""
				+ this.getDocumentNumber() + "\"}}";
		return s;
	}

}