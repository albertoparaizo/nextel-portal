package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetCustomerContractInformationV1VO extends ValueObjectJson implements Cloneable {

	private GetCustomerContractInformationV1VO getCustomerContractInformationV1VO;
	private boolean isClone = false;
	private String clientId;
	private String customerId;
	private String documentNumber;
	private String costCenterId;
	
	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetCustomerContractInformationV1VO() {
		// TODO Auto-generated constructor stub
	}

	public GetCustomerContractInformationV1VO getGetCustomerContractInformationV1VO() {
		return this.getCustomerContractInformationV1VO;
	}

	public void setGetCustomerContractInformationV1VO(
			GetCustomerContractInformationV1VO getCustomerContractInformationV1VO) {
		this.getCustomerContractInformationV1VO = getCustomerContractInformationV1VO;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCostCenterId() {
		return this.costCenterId;
	}

	public void setCostCenterId(String costCenterId) {
		this.costCenterId = costCenterId;
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
	public GetCustomerContractInformationV1VO getClone() {
		try { // call clone in Object.
			return (GetCustomerContractInformationV1VO) super.clone();
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