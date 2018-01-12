package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetProtocolListByDocumentV1VO extends ValueObjectJson implements Cloneable {

	private GetProtocolListByDocumentV1VO getProtocolListByDocumentV1VO;
	private boolean isClone = false;
	private String clientId;
	private String documentNumber;
	private String startDate;
	private String endDate;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetProtocolListByDocumentV1VO() {
		// TODO Auto-generated constructor stub
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

	public GetProtocolListByDocumentV1VO getGetProtocolListByDocumentV1VO() {
		return this.getProtocolListByDocumentV1VO;
	}

	public void setGetProtocolListByDocumentV1VO(GetProtocolListByDocumentV1VO getProtocolListByDocumentV1VO) {
		this.getProtocolListByDocumentV1VO = getProtocolListByDocumentV1VO;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
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
	public GetProtocolListByDocumentV1VO getClone() {
		try { // call clone in Object.
			return (GetProtocolListByDocumentV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() + "\"}, \"data\":{"
				+ "\"documentNumber\":\"" + this.getDocumentNumber() + "\""
				+ ", \"startDate\":\"" + this.getStartDate() + "\""
				+ ", \"endDate\":\"" + this.getEndDate() + "\""
						+ "}}";
		return s;
	}

}