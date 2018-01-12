package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetCustomerCostCenterListV1VO extends ValueObjectJson implements Cloneable {

	private GetCustomerCostCenterListV1VO customerScoreV1VO;
	private boolean isClone = false;
	private String documentNumber;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetCustomerCostCenterListV1VO() {
		// TODO Auto-generated constructor stub
	}

	public GetCustomerCostCenterListV1VO getCustomerScoreV1VO() {
		return this.customerScoreV1VO;
	}

	public void setCustomerScoreV1VO(GetCustomerCostCenterListV1VO customerScoreV1VO) {
		this.customerScoreV1VO = customerScoreV1VO;
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
	public GetCustomerCostCenterListV1VO getClone() {
		try { // call clone in Object.
			return (GetCustomerCostCenterListV1VO) super.clone();
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