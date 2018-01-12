package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetSaleResponsibleV1VO extends ValueObjectJson implements Cloneable {

	private GetSaleResponsibleV1VO getSaleResponsibleV1VO;
	private boolean isClone = false;
	private String orderNumber;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetSaleResponsibleV1VO() {
		// TODO Auto-generated constructor stub
	}

	public GetSaleResponsibleV1VO getGetSaleResponsibleV1VO() {
		return this.getSaleResponsibleV1VO;
	}

	public void setGetSaleResponsibleV1VO(GetSaleResponsibleV1VO getSaleResponsibleV1VO) {
		this.getSaleResponsibleV1VO = getSaleResponsibleV1VO;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
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
	public GetSaleResponsibleV1VO getClone() {
		try { // call clone in Object.
			return (GetSaleResponsibleV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() +
				"\"}, \"data\":{\"orderNumber\":\""
				+ this.getOrderNumber() + "\"}}";
		return s;
	}

}