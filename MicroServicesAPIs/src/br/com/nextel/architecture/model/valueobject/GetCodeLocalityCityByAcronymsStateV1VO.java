package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetCodeLocalityCityByAcronymsStateV1VO extends ValueObjectJson implements Cloneable {

	private GetCodeLocalityCityByAcronymsStateV1VO customerScoreV1VO;
	private boolean isClone = false;
	private String stateCode;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetCodeLocalityCityByAcronymsStateV1VO() {
		// TODO Auto-generated constructor stub
	}

	public String getStateCode() {
		return this.stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public GetCodeLocalityCityByAcronymsStateV1VO getCustomerScoreV1VO() {
		return this.customerScoreV1VO;
	}

	public void setCustomerScoreV1VO(GetCodeLocalityCityByAcronymsStateV1VO customerScoreV1VO) {
		this.customerScoreV1VO = customerScoreV1VO;
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
	public GetCodeLocalityCityByAcronymsStateV1VO getClone() {
		try { // call clone in Object.
			return (GetCodeLocalityCityByAcronymsStateV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() +
				"\"}, \"data\":{\"stateCode\":\""
				+ this.getStateCode() + "\"}}";
		return s;
	}

}