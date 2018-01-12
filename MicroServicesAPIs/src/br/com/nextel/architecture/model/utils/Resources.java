package br.com.nextel.architecture.model.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author "Ricardo Amorim Rodrigues" Criada em: 08/04/2006
 *
 * Alterada por: "(Ningu�m)" Alterada em:
 */
public final class Resources {

	private static Resources resources;

	public static final String GENESYS = "genesys.properties";

	public static final String SQL_SERVER = "sqlserver.properties";

	private Map allProperties = new HashMap();

	/**
	 * Este construtor inicializar� todos os properties desta classe.
	 */
	private Resources() {
		allProperties.put(GENESYS, new Properties());
		allProperties.put(SQL_SERVER, new Properties());

		Set filesProperties = allProperties.keySet();
		for (Iterator iter = filesProperties.iterator(); iter.hasNext();) {
			String fileProperties = (String) iter.next();
			Properties p = (Properties) allProperties.get(fileProperties);
			try {
				p.load(getClass().getClassLoader().getResourceAsStream(
						fileProperties));
			} catch (Exception e) {
				System.err.println("Erro carregando " + fileProperties +  e.fillInStackTrace().toString());
			}
		}
	}

	/**
	 * Este m�todo retorna a inst�ncia deste objeto j� criado em mem�ria caso
	 * n�o tenha em mem�ria ser� crido uma nova inst�ncia. (Singleton)
	 *
	 * @return
	 */
	public static Resources getInstance() {
		if (resources == null) {
			resources = new Resources();
		}
		return resources;
	}

	/**
	 * Este m�todo retorna o valor da chave que foi passado do respectivo
	 * Property passado.
	 *
	 * @param fileProperty
	 * @param key
	 * @return
	 */
	public String getProperty(String fileProperty, String key) {
		String property = "";
		Properties prop = (Properties) allProperties.get(fileProperty);
		if (prop != null) {
			property = prop.getProperty(key);
		}

		if (property == null) {
			System.out.println("property � null para key = " + key);
		}

		return property;
	}

	/**
	 * @param fileProperty
	 * @return
	 */
	public Properties getProperties(String fileProperty) {
		return (Properties) allProperties.get(fileProperty);
	}
}