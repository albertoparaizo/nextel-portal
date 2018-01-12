package br.com.nextel.architecture.model.business;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import br.com.nextel.architecture.model.integration.microservices.ConnectJSONMicroServicesAPIs;
import br.com.nextel.architecture.model.valueobject.GetCustomerAddressListV1VO;
import br.com.nextel.architecture.model.valueobject.GetCustomerInformationV1VO;
import br.com.nextel.architecture.model.valueobject.SecurityOauth2VO;

public class GetCustomerAddressListV1BusinessRulesAPI {
	
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
				
				/**:::::::::::::::::GetCustomerAddressList/V1/oauth2/token:::::::::::::::::*/
				ConnectJSONMicroServicesAPIs http = new ConnectJSONMicroServicesAPIs();
				System.out.println("\nTesting - Send Http POST request");
				SecurityOauth2VO oauth2vo = new SecurityOauth2VO();
				oauth2vo.setAPI_NAME("/GetCustomerAddressList/V1/oauth2/token");
				oauth2vo = (SecurityOauth2VO) http.sendPost(oauth2vo, END_POINT_API);
				
				
				JsonReader jsonReaderSecurityOauth = new JsonReader(oauth2vo.getResponseJsonByStringReader());
				jsonReaderSecurityOauth.setLenient(true);
				JsonParser parserSecurityOauth = new JsonParser();
				JsonObject jsonObjSecurityOauth = (JsonObject) parserSecurityOauth.parse(jsonReaderSecurityOauth);
				String access_token = jsonObjSecurityOauth.get("access_token").getAsString();
						
				System.out.println("access_token CONTEUDO REAL = " + access_token);
				System.out.println();
				
				
				/**:::::::::::::::::GetCustomerAddressList/V1:::::::::::::::::*/
				http = new ConnectJSONMicroServicesAPIs();
				GetCustomerAddressListV1VO getCustomerAddressListV1VO = new GetCustomerAddressListV1VO();
				getCustomerAddressListV1VO.setAPI_NAME("/GetCustomerAddressList/V1");
				getCustomerAddressListV1VO.setAccess_token(access_token);
				getCustomerAddressListV1VO.setClientId("URAVOICE");
				getCustomerAddressListV1VO.setDocumentNumber("59104273000129");
				getCustomerAddressListV1VO = (GetCustomerAddressListV1VO) http.sendPost(getCustomerAddressListV1VO, END_POINT_API);
				
				
				JsonReader jsonReader = new JsonReader(getCustomerAddressListV1VO.getResponseJsonByStringReader());
				jsonReader.setLenient(true);
			 
				JsonParser parser = new JsonParser();
				JsonObject jsonObj = (JsonObject) parser.parse(jsonReader);
				
				JsonElement jsonElementHeader = jsonObj.get("header");
				JsonObject jsonObjHeader = jsonElementHeader.getAsJsonObject();
				
				JsonElement jsonElementDataResponse = jsonObj.get("dataResponse");
				JsonObject jsonObjDataResponse = jsonElementDataResponse.getAsJsonObject();
				
//				if (jsonObjHeader != null) {
//					System.out.println("clientId ::: ->> " + jsonObjHeader.get("clientId"));
//					System.out.println("jsonObj.toString() &&&&&&&&&&&&&&&& " + jsonObjHeader.toString());
//					System.out.println("paradigm ::: ->> " + jsonObjHeader.get("paradigm"));
//					System.out.println("serviceName ::: ->> " + jsonObjHeader.get("serviceName"));
//					System.out.println("return ::: ->> " + jsonObjHeader.get("return"));
//					JsonElement returnElement  = jsonObjHeader.get("return");
//					System.out.println(" jsonObjDataResponse.get(return) ::: " + jsonObjHeader.get("return").isJsonObject());
//					JsonObject returnJsonObj = returnElement.getAsJsonObject();
//					
//					System.out.println("serviceDesc ::: ->> " + returnJsonObj.get("serviceDesc"));
//					System.out.println("serviceCode ::: ->> " + returnJsonObj.get("serviceCode"));
//					System.out.println("messageId ::: ->> " + jsonObjHeader.get("messageId"));
//					
//					JsonElement elementTracking  = returnJsonObj.get("tracking");
//					if (elementTracking != null) {
//						JsonObject jsonObjTracking = elementTracking.getAsJsonObject();
//						System.out.println("providerCode -->> " + jsonObjTracking.get("providerCode"));
//						System.out.println("providerDesc -->> " + jsonObjTracking.get("providerDesc"));
//					}
//				}
//				
//				if (jsonObjDataResponse != null) {
//					System.out.println("creditScore ::: ->> " + jsonObjDataResponse.get("creditScore"));
//				}
				
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
