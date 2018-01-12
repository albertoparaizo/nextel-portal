package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetAddressByZipCodeV1VO extends ValueObjectJson implements Cloneable {

	private GetAddressByZipCodeV1VO getAddressByZipCodeV1VO;
	private boolean isClone = false;
	private String zip;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetAddressByZipCodeV1VO() {
		// TODO Auto-generated constructor stub
	}

	public boolean isClone() {
		return this.isClone;
	}

	public void setClone(boolean isClone) {
		this.isClone = isClone;
	}

	public GetAddressByZipCodeV1VO getGetAddressByZipCodeV1VO() {
		return this.getAddressByZipCodeV1VO;
	}

	public void setGetAddressByZipCodeV1VO(GetAddressByZipCodeV1VO getAddressByZipCodeV1VO) {
		this.getAddressByZipCodeV1VO = getAddressByZipCodeV1VO;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
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
	public GetAddressByZipCodeV1VO getClone() {
		try { // call clone in Object.
			return (GetAddressByZipCodeV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() + "\"}, \"data\":{\"address\":{\"zip\":\""
				+ this.getZip() + "\"}}}";
		return s;
	}

}