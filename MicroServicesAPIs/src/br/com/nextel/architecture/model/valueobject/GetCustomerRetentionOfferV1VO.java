package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetCustomerRetentionOfferV1VO extends ValueObjectJson implements Cloneable {

	private GetCustomerRetentionOfferV1VO getCustomerRetentionOfferV1VO;
	private boolean isClone = false;
	private String contractId;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetCustomerRetentionOfferV1VO() {
		// TODO Auto-generated constructor stub
	}

	public boolean isClone() {
		return this.isClone;
	}

	public void setClone(boolean isClone) {
		this.isClone = isClone;
	}

	public GetCustomerRetentionOfferV1VO getGetCustomerRetentionOfferV1VO() {
		return this.getCustomerRetentionOfferV1VO;
	}

	public void setGetCustomerRetentionOfferV1VO(GetCustomerRetentionOfferV1VO getCustomerRetentionOfferV1VO) {
		this.getCustomerRetentionOfferV1VO = getCustomerRetentionOfferV1VO;
	}

	public String getContractId() {
		return this.contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
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
	public GetCustomerRetentionOfferV1VO getClone() {
		try { // call clone in Object.
			return (GetCustomerRetentionOfferV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() + "\"}, \"data\":{\"contractId\":\""
				+ this.getContractId() + "\"}}";
		return s;
	}

}