package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetContractTicklerV1VO extends ValueObjectJson implements Cloneable {

	private GetContractTicklerV1VO getContractTicklerV1VO;
	private boolean isClone = false;
	private String contractId;
	private String customerId;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetContractTicklerV1VO() {
		// TODO Auto-generated constructor stub
	}

	public GetContractTicklerV1VO getGetContractTicklerV1VO() {
		return this.getContractTicklerV1VO;
	}

	public void setGetContractTicklerV1VO(GetContractTicklerV1VO getContractTicklerV1VO) {
		this.getContractTicklerV1VO = getContractTicklerV1VO;
	}

	public String getContractId() {
		return this.contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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
	public GetContractTicklerV1VO getClone() {
		try { // call clone in Object.
			return (GetContractTicklerV1VO) super.clone();
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