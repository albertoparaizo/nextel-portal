package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetCodeDistrictByCodeLocalityCityV1VO extends ValueObjectJson implements Cloneable {

	private GetCodeDistrictByCodeLocalityCityV1VO getCodeDistrictByCodeLocalityCityV1VO;
	private boolean isClone = false;
	private String localityCode;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetCodeDistrictByCodeLocalityCityV1VO() {
		// TODO Auto-generated constructor stub
	}

	public GetCodeDistrictByCodeLocalityCityV1VO getGetCodeDistrictByCodeLocalityCityV1VO() {
		return this.getCodeDistrictByCodeLocalityCityV1VO;
	}

	public void setGetCodeDistrictByCodeLocalityCityV1VO(
			GetCodeDistrictByCodeLocalityCityV1VO getCodeDistrictByCodeLocalityCityV1VO) {
		this.getCodeDistrictByCodeLocalityCityV1VO = getCodeDistrictByCodeLocalityCityV1VO;
	}

	public String getLocalityCode() {
		return this.localityCode;
	}

	public void setLocalityCode(String localityCode) {
		this.localityCode = localityCode;
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
	public GetCodeDistrictByCodeLocalityCityV1VO getClone() {
		try { // call clone in Object.
			return (GetCodeDistrictByCodeLocalityCityV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() +
				"\"}, \"data\":{\"localityCode\":\""
				+ this.getLocalityCode() + "\"}}";
		return s;
	}

}