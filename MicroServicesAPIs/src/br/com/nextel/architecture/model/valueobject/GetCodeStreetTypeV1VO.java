package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetCodeStreetTypeV1VO extends ValueObjectJson implements Cloneable {

	private GetCodeStreetTypeV1VO getCodeStreetTypeV1VO;
	private boolean isClone = false;
	private String streetTypeDesc;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetCodeStreetTypeV1VO() {
		// TODO Auto-generated constructor stub
	}

	public GetCodeStreetTypeV1VO getGetCodeStreetTypeV1VO() {
		return this.getCodeStreetTypeV1VO;
	}

	public void setGetCodeStreetTypeV1VO(GetCodeStreetTypeV1VO getCodeStreetTypeV1VO) {
		this.getCodeStreetTypeV1VO = getCodeStreetTypeV1VO;
	}

	public String getStreetTypeDesc() {
		return this.streetTypeDesc;
	}

	public void setStreetTypeDesc(String streetTypeDesc) {
		this.streetTypeDesc = streetTypeDesc;
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
	public GetCodeStreetTypeV1VO getClone() {
		try { // call clone in Object.
			return (GetCodeStreetTypeV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() +
				"\"}, \"data\":{\"streetTypeDesc\":\""
				+ this.getStreetTypeDesc() + "\"}}";
		return s;
	}

}