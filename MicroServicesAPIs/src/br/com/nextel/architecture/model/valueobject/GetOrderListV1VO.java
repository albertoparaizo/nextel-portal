package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetOrderListV1VO extends ValueObjectJson implements Cloneable {

	private GetOrderListV1VO getOrderListV1VO;
	private boolean isClone = false;
	private String documentNumber;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetOrderListV1VO() {
		// TODO Auto-generated constructor stub
	}

	public GetOrderListV1VO getGetOrderListV1VO() {
		return this.getOrderListV1VO;
	}

	public void setGetOrderListV1VO(GetOrderListV1VO getOrderListV1VO) {
		this.getOrderListV1VO = getOrderListV1VO;
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
	public GetOrderListV1VO getClone() {
		try { // call clone in Object.
			return (GetOrderListV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() + "\"}, \"data\":{\"documentNumber\":\""
				+ this.getDocumentNumber() + "\"}}";
		return s;
	}

}