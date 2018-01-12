package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetContractVoluntaryCancelNegotiationByRegisterAttendanceV1VO extends ValueObjectJson
		implements Cloneable {

	private GetContractVoluntaryCancelNegotiationByRegisterAttendanceV1VO getContractVoluntaryCancelNegotiationByRegisterAttendanceV1VO;
	private boolean isClone = false;
	private String clientId;
	private String protocolNumber;
	private String registerAttendanceNumber;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetContractVoluntaryCancelNegotiationByRegisterAttendanceV1VO() {
		// TODO Auto-generated constructor stub
	}

	public boolean isClone() {
		return this.isClone;
	}

	public void setClone(boolean isClone) {
		this.isClone = isClone;
	}

	public GetContractVoluntaryCancelNegotiationByRegisterAttendanceV1VO getGetContractVoluntaryCancelNegotiationByRegisterAttendanceV1VO() {
		return this.getContractVoluntaryCancelNegotiationByRegisterAttendanceV1VO;
	}

	public void setGetContractVoluntaryCancelNegotiationByRegisterAttendanceV1VO(
			GetContractVoluntaryCancelNegotiationByRegisterAttendanceV1VO getContractVoluntaryCancelNegotiationByRegisterAttendanceV1VO) {
		this.getContractVoluntaryCancelNegotiationByRegisterAttendanceV1VO = getContractVoluntaryCancelNegotiationByRegisterAttendanceV1VO;
	}

	public String getProtocolNumber() {
		return this.protocolNumber;
	}

	public void setProtocolNumber(String protocolNumber) {
		this.protocolNumber = protocolNumber;
	}

	public String getRegisterAttendanceNumber() {
		return this.registerAttendanceNumber;
	}

	public void setRegisterAttendanceNumber(String registerAttendanceNumber) {
		this.registerAttendanceNumber = registerAttendanceNumber;
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
	public GetContractVoluntaryCancelNegotiationByRegisterAttendanceV1VO getClone() {
		try { // call clone in Object.
			return (GetContractVoluntaryCancelNegotiationByRegisterAttendanceV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() + "\"}, \"data\":{\"protocolNumber\":\""
				+ this.getProtocolNumber() + "\"" + ", \"registerAttendanceNumber\":\"" + this.getRegisterAttendanceNumber()
				+ "\"}}";
		return s;
	}

}