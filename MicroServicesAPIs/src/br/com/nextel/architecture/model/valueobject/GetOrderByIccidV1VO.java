package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetOrderByIccidV1VO extends ValueObjectJson implements Cloneable {

	private GetOrderByIccidV1VO getOrderByIccidV1VO;
	private boolean isClone = false;
	private String documentNumber;
	private String clientId;
	private String iccid;
	
	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetOrderByIccidV1VO() {
		// TODO Auto-generated constructor stub
	}
	
	public GetOrderByIccidV1VO getGetOrderByIccidV1VO() {
		return this.getOrderByIccidV1VO;
	}


	public void setGetOrderByIccidV1VO(GetOrderByIccidV1VO getOrderByIccidV1VO) {
		this.getOrderByIccidV1VO = getOrderByIccidV1VO;
	}


	public String getIccid() {
		return this.iccid;
	}


	public void setIccid(String iccid) {
		this.iccid = iccid;
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
	public GetOrderByIccidV1VO getClone() {
		try { // call clone in Object.
			return (GetOrderByIccidV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() +
				"\"}, \"data\":{\"documentNumber\":\""
				+ this.getDocumentNumber() + "\","
						+ "\"iccid\":\""+ this.getIccid() + "\" }}";
		return s;
	}

}