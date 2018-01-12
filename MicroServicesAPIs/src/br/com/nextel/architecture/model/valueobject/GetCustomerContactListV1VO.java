package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetCustomerContactListV1VO extends ValueObjectJson implements Cloneable {

	private GetCustomerContactListV1VO customerScoreV1VO;
	private boolean isClone = false;
	private String documentNumber;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetCustomerContactListV1VO() {
		// TODO Auto-generated constructor stub
	}

	public GetCustomerContactListV1VO getCustomerScoreV1VO() {
		return this.customerScoreV1VO;
	}

	public void setCustomerScoreV1VO(GetCustomerContactListV1VO customerScoreV1VO) {
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
	public GetCustomerContactListV1VO getClone() {
		try { // call clone in Object.
			return (GetCustomerContactListV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	public String toString1() {
		String s = "{"+
		   "\"header\":{"+
		      "\"clientId\":\"String\","+
		      "\"messageId\":\"String\","+
		      "\"return\":{"+
		         "\"serviceCode\":12345,"+
		         "\"serviceDesc\":\"String\","+
		         "\"tracking\":{"+
		            "\"providerCode\":\"String\","+
		            "\"providerDesc\":\"String\""+
		         "}"+
		      "}"+
		   "},"+
		   "\"dataResponse\":{"+
		   "}"+
		"}";
		return s;
		}
	
	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() +
				"\"}, \"data\":{\"documentNumber\":\""
				+ this.getDocumentNumber() + "\"}}";
		return s;
	}

}