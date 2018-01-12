package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetRegisterAttendanceHistoryListV1VO extends ValueObjectJson implements Cloneable {

	private GetRegisterAttendanceHistoryListV1VO getRegisterAttendanceHistoryListV1VO;
	private boolean isClone = false;

	private String clientId;
	private String documentNumber;
	private String startDate;
	private String endDate;
	private String protocolNumber;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetRegisterAttendanceHistoryListV1VO() {
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

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public GetRegisterAttendanceHistoryListV1VO getGetRegisterAttendanceHistoryListV1VO() {
		return this.getRegisterAttendanceHistoryListV1VO;
	}

	public void setGetRegisterAttendanceHistoryListV1VO(
			GetRegisterAttendanceHistoryListV1VO getRegisterAttendanceHistoryListV1VO) {
		this.getRegisterAttendanceHistoryListV1VO = getRegisterAttendanceHistoryListV1VO;
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

	public String getProtocolNumber() {
		return this.protocolNumber;
	}

	public void setProtocolNumber(String protocolNumber) {
		this.protocolNumber = protocolNumber;
	}

	/**
	 * This method calls Object's clone().
	 * 
	 * @return
	 */
	public GetRegisterAttendanceHistoryListV1VO getClone() {
		try { // call clone in Object.
			return (GetRegisterAttendanceHistoryListV1VO) super.clone();
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
				+ ", \"protocolNumber\":\"" + this.getProtocolNumber() + "\""
			+ "}}";
		return s;
	}

}