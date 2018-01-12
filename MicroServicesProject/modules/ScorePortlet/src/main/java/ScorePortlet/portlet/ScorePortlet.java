package ScorePortlet.portlet;

import ScorePortlet.constants.ScorePortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import br.com.nextel.architecture.model.business.*;
import java.io.IOException;
import javax.portlet.PortletException;

/**
 * @author ALBERTO
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Nextel",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ScorePortlet Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ScorePortletKeys.Score,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ScorePortlet extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
		System.out.println("doView" );
		String score = "branco"; 
		System.out.println(score);
		//GetCustomerScoreBusinessRulesAPI api = new GetCustomerScoreBusinessRulesAPI();
 		score = GetCustomerScoreV1BusinessRulesAPI.callService();
		System.out.println("Score: " + score);
		renderRequest.setAttribute("score", score); 
		
		super.doView(renderRequest, renderResponse);
	}		
}