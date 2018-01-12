package br.com.nextel.architecture.model.valueobject;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class GetOfferMenuPlanDetailForRetentionV1VO extends ValueObjectJson implements Cloneable {

	private GetOfferMenuPlanDetailForRetentionV1VO getOfferMenuPlanDetailForRetentionV1VO;
	private boolean isClone = false;
	private String ratePlan;
	private String planName;
	private String clientId;

	/**
	 * Construtor SecurityOauth2VO POJO
	 */
	public GetOfferMenuPlanDetailForRetentionV1VO() {
		// TODO Auto-generated constructor stub
	}

	public GetOfferMenuPlanDetailForRetentionV1VO getGetOfferMenuPlanDetailForRetentionV1VO() {
		return this.getOfferMenuPlanDetailForRetentionV1VO;
	}

	public void setGetOfferMenuPlanDetailForRetentionV1VO(
			GetOfferMenuPlanDetailForRetentionV1VO getOfferMenuPlanDetailForRetentionV1VO) {
		this.getOfferMenuPlanDetailForRetentionV1VO = getOfferMenuPlanDetailForRetentionV1VO;
	}

	public boolean isClone() {
		return this.isClone;
	}

	public void setClone(boolean isClone) {
		this.isClone = isClone;
	}

	public String getRatePlan() {
		return this.ratePlan;
	}

	public void setRatePlan(String ratePlan) {
		this.ratePlan = ratePlan;
	}

	public String getPlanName() {
		return this.planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
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
	public GetOfferMenuPlanDetailForRetentionV1VO getClone() {
		try { // call clone in Object.
			return (GetOfferMenuPlanDetailForRetentionV1VO) super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(" Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public String toString() {
		String s = "{\"header\":{ \"clientId\":\"" + this.getClientId() + "\"}, \"data\":{\"ratePlan\":\""
				+ this.getRatePlan() + "\", \"planName\":\"" + this.getPlanName() + "\"}}";
		return s;
	}

}