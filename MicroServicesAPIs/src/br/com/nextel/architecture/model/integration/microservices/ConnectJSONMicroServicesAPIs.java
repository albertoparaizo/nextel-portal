package br.com.nextel.architecture.model.integration.microservices;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

import br.com.nextel.architecture.model.valueobject.ValueObjectJson;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class ConnectJSONMicroServicesAPIs {

	private final String USER_AGENT = "Ricardo";
	
	private String resposta = null;
	private int responseCode = 0;
	
	// HTTP POST request
	public ValueObjectJson sendPost(ValueObjectJson valueObjectJson, String hostName) {
		if (valueObjectJson != null) {
			BufferedReader in = null;
			HttpURLConnection con = null;
			URL url = null;
			try {
				String urlSTR = "https://" + hostName + valueObjectJson.getAPI_NAME();
				System.out.println("URL: >>>> " + urlSTR);
				url = new URL(urlSTR);
				con = (HttpURLConnection) url.openConnection();
				con.setConnectTimeout(60000);
		        con.setReadTimeout(60000);

				//add request header
				con.setRequestMethod("POST");
				con.setRequestProperty("User-Agent", USER_AGENT);
				con.setRequestProperty("Accept", "application/json");
				con.setRequestProperty("Content-type", "application/json");
				
				if (valueObjectJson.getAccess_token() != null) {
					con.setRequestProperty("Authorization", valueObjectJson.getAccess_token());
					System.out.println("Token::: " + valueObjectJson.getAccess_token());
				}
		
				// Send post request
				con.setDoOutput(true);
				DataOutputStream wr = new DataOutputStream(con.getOutputStream());
				String messageSendPayload = valueObjectJson.toString();
				System.out.println("Payload : " + messageSendPayload);
				wr.writeBytes(messageSendPayload);
				wr.flush();
				wr.close();
				
				System.out.println("\nSending 'POST' request to URL : " + url);
				responseCode = con.getResponseCode();
				System.out.println("Response Code : " + responseCode);
		
				in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();
				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				//print result
				resposta = response.toString();
				System.out.println("RESPOSTA ::::: " + resposta);
				
				StringReader reader = null;
				if (resposta != null){
				 reader = new StringReader(resposta.trim());
				 valueObjectJson.setResponseJsonByStringReader(reader);
				}
				 
			} catch (Exception e) {
				valueObjectJson.setMensagemRetornoGenerica(e.fillInStackTrace().getMessage());
				System.err.println("Erro: --> " + e.fillInStackTrace().getMessage());
				resposta = e.fillInStackTrace().getMessage();
			} finally {
				valueObjectJson.setCdRetorno(String.valueOf(responseCode));
				valueObjectJson.setMensagemRetornoGenerica(resposta);
				con.disconnect();
			}
		} else {
			System.out.println("Objeto 'SecurityOauth2VO' vazio!!!");
		}
		
		return valueObjectJson;
	}
}
