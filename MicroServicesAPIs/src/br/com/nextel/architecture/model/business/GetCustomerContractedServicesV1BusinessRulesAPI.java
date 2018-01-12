package br.com.nextel.architecture.model.business;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import br.com.nextel.architecture.model.integration.microservices.ConnectJSONMicroServicesAPIs;
import br.com.nextel.architecture.model.valueobject.GetCustomerContractedServicesV1VO;
import br.com.nextel.architecture.model.valueobject.SecurityOauth2VO;

public class GetCustomerContractedServicesV1BusinessRulesAPI {
	
	private static String END_POINT_API = "ms-apis-uat.nextel.com.br";

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		long timeCurrent = 0;
		long timeDiff = 0;
		long timeResult = 0;
		
			for (int i = 0; i < 1; i++){
				
				java.util.Date dateTimeCurrent = new java.util.Date();
				timeCurrent = dateTimeCurrent.getTime();
				
				/**:::::::::::::::::GetCustomerContractedServices/V1/oauth2/token:::::::::::::::::*/
				ConnectJSONMicroServicesAPIs http = new ConnectJSONMicroServicesAPIs();
				System.out.println("\nTesting - Send Http POST request");
				SecurityOauth2VO oauth2vo = new SecurityOauth2VO();
				oauth2vo.setAPI_NAME("/GetCustomerContractedServices/V1/oauth2/token");
				oauth2vo = (SecurityOauth2VO) http.sendPost(oauth2vo, END_POINT_API);
				
				
				JsonReader jsonReaderSecurityOauth = new JsonReader(oauth2vo.getResponseJsonByStringReader());
				jsonReaderSecurityOauth.setLenient(true);
				JsonParser parserSecurityOauth = new JsonParser();
				JsonObject jsonObjSecurityOauth = (JsonObject) parserSecurityOauth.parse(jsonReaderSecurityOauth);
				String access_token = jsonObjSecurityOauth.get("access_token").getAsString();
						
				System.out.println("access_token CONTEUDO REAL = " + access_token);
				System.out.println();
				
				/**:::::::::::::::::GetCustomerContractedServices/V1:::::::::::::::::*/
				http = new ConnectJSONMicroServicesAPIs();
				GetCustomerContractedServicesV1VO getCustomerContractedServicesV1VO = new GetCustomerContractedServicesV1VO();
				getCustomerContractedServicesV1VO.setAPI_NAME("/GetCustomerContractedServices/V1");
				getCustomerContractedServicesV1VO.setAccess_token(access_token);
				getCustomerContractedServicesV1VO.setClientId("URAVOICE");
				getCustomerContractedServicesV1VO.setContractId("18918182");
				getCustomerContractedServicesV1VO.setPhoneNumber("5511940186645");
				getCustomerContractedServicesV1VO = (GetCustomerContractedServicesV1VO) http.sendPost(getCustomerContractedServicesV1VO, END_POINT_API);
				
				JsonReader jsonReader = new JsonReader(getCustomerContractedServicesV1VO.getResponseJsonByStringReader());
				jsonReader.setLenient(true);
			 
				JsonParser parser = new JsonParser();
				JsonObject jsonObj = (JsonObject) parser.parse(jsonReader);
				
				JsonElement jsonElementHeader = jsonObj.get("header");
				JsonObject jsonObjHeader = jsonElementHeader.getAsJsonObject();
				
				JsonElement jsonElementDataResponse = jsonObj.get("dataResponse");
				JsonObject jsonObjDataResponse = jsonElementDataResponse.getAsJsonObject();
				
				System.err.println("INVOCAÇÃO::: " + i);
				java.util.Date dateTimeDiff = new java.util.Date();
				timeDiff = dateTimeDiff.getTime();

				timeResult = timeDiff - timeCurrent;

				java.util.Date dateTimeResult = new java.util.Date();
				dateTimeResult.setTime(timeResult);

				System.err.println("Tempo de Resposta do MicroServiço = " + ((double) dateTimeResult.getTime() / 1000));

				System.out.println("\n\n");
			}
		}
}
