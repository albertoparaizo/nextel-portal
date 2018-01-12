package br.com.nextel.architecture.model.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author "Ricardo Amorim Rodrigues" Criada em: 08/04/2006
 *
 * Alterada por: "(Ninguém)" Alterada em:
 */
public final class Resources {

	private static Resources resources;

	public static final String GENESYS = "genesys.properties";

	public static final String SQL_SERVER = "sqlserver.properties";

	private Map allProperties = new HashMap();

	/**
	 * Este construtor inicializará todos os properties desta classe.
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
	 * Este método retorna a instância deste objeto já criado em memória caso
	 * não tenha em memória será crido uma nova instância. (Singleton)
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
	 * Este método retorna o valor da chave que foi passado do respectivo
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
			System.out.println("property é null para key = " + key);
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