package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetCustomerContractedServicesV1VO extends ValueObjectJson implements Cloneable {

	private GetCustomerContractedServicesV1VO getCustomerContractedServicesV1VO;
	private boolean isClone = false;
	private String clientId;
	private String contractId;
	private String phoneNumber;
	
	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetCustomerContractedServicesV1VO() {
		// TODO Auto-generated constructor stub
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
	
	public GetCustomerContractedServicesV1VO getGetCustomerContractedServicesV1VO() {
		return this.getCustomerContractedServicesV1VO;
	}

	public void setGetCustomerContractedServicesV1VO(GetCustomerContractedServicesV1VO getCustomerContractedServicesV1VO) {
		this.getCustomerContractedServicesV1VO = getCustomerContractedServicesV1VO;
	}

	public String getContractId() {
		return this.contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * This method calls Object's clone().
	 * 
	 * @return
	 */
	public GetCustomerContractedServicesV1VO getClone() {
		try { // call clone in Object.
			return (GetCustomerContractedServicesV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() +
				"\"}, \"data\":{\"contractId\":" + this.getContractId() +
				/**", \"phoneNumber\":" + this.getPhoneNumber() + */"}}";
		return s;
	}

}