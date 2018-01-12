package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class SecurityOauth2VO extends ValueObjectJson implements Cloneable {

	private SecurityOauth2VO securityOauth2VO;
	private boolean isClone = false;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public SecurityOauth2VO() {
		// TODO Auto-generated constructor stub
	}

	public boolean isClone() {
		return isClone;
	}

	public void setClone(boolean isClone) {
		this.isClone = isClone;
	}

	public SecurityOauth2VO getCloneCallMeTransportGenesysVO() {
		return securityOauth2VO;
	}

	public void setCloneCallMeTransportGenesysVO(SecurityOauth2VO securityOauth2VO) {
		this.securityOauth2VO = securityOauth2VO;
	}

	/**
	 * This method calls Object's clone().
	 * 
	 * @return
	 */
	public SecurityOauth2VO getClone() {
		try { // call clone in Object.
			return (SecurityOauth2VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		return "{\"grant_type\":\"client_credentials\", \"client_id\":\"pocportal\", \"client_secret\": \"pocportal\"}";
	}

}
