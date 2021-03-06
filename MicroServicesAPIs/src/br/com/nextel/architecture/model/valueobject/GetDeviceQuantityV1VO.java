package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetDeviceQuantityV1VO extends ValueObjectJson implements Cloneable {

	private GetDeviceQuantityV1VO getDeviceQuantityV1VO;
	private boolean isClone = false;
	private String documentNumber;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetDeviceQuantityV1VO() {
		// TODO Auto-generated constructor stub
	}

	public GetDeviceQuantityV1VO getGetDeviceQuantityV1VO() {
		return this.getDeviceQuantityV1VO;
	}

	public void setGetDeviceQuantityV1VO(GetDeviceQuantityV1VO getDeviceQuantityV1VO) {
		this.getDeviceQuantityV1VO = getDeviceQuantityV1VO;
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
	public GetDeviceQuantityV1VO getClone() {
		try { // call clone in Object.
			return (GetDeviceQuantityV1VO) super.clone();
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