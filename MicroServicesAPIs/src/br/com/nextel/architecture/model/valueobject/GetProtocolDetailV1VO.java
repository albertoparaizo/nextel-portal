package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetProtocolDetailV1VO extends ValueObjectJson implements Cloneable {

	private GetProtocolDetailV1VO getProtocolDetailV1VO;
	private boolean isClone = false;
	private String number;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetProtocolDetailV1VO() {
		// TODO Auto-generated constructor stub
	}

	public boolean isClone() {
		return this.isClone;
	}

	public void setClone(boolean isClone) {
		this.isClone = isClone;
	}

	public GetProtocolDetailV1VO getGetProtocolDetailV1VO() {
		return this.getProtocolDetailV1VO;
	}

	public void setGetProtocolDetailV1VO(GetProtocolDetailV1VO getProtocolDetailV1VO) {
		this.getProtocolDetailV1VO = getProtocolDetailV1VO;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
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
	public GetProtocolDetailV1VO getClone() {
		try { // call clone in Object.
			return (GetProtocolDetailV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() + "\"}, \"data\":{\"protocol\":{\"number\":"
				+ this.getNumber() + "}}}";
		return s;
	}

}