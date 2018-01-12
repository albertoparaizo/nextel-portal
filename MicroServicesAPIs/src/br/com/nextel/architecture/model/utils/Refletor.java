package br.com.nextel.architecture.model.utils;

import java.lang.reflect.Field;

/**
 * Classe que faz trabalho reflection
 * 
 * @author "Ricardo Amorim Rodrigues" Criada em: 08/12/2013
 * 
 *         Alterada por: "(Ninguém)" Alterada em:
 */
public class Refletor {

	/**
	 * Todos os métodos desta classe deveram ser static
	 */
	private Refletor() {
		super();
	}

	/**
	 * Retorna o nome o atributo especificado.
	 * 
	 * @param value
	 *            Valor do Atribto.
	 * @param obj
	 *            Objeto que contém o atributo.
	 * @param isIgnoreCaseValue
	 *            Se "true" o método deve ignorar o case da comparação do valor
	 *            do atributo, caso "false" não ignora.
	 * @return
	 */
	public static String getAttribute(String value, Object obj,
			boolean isIgnoreCaseValue) {
		Class classe = obj.getClass();
		Field[] fields = classe.getFields();
		for (int i = 0; i < fields.length; i++) {
			try {
				if (isIgnoreCaseValue == true) {
					if ((String.valueOf(fields[i].get(obj))).trim()
							.equalsIgnoreCase(value.trim())) {
						return String.valueOf(fields[i].getName()).trim();
					}
				} else {
					if ((String.valueOf(fields[i].get(obj))).trim().equals(
							value.trim())) {
						return String.valueOf(fields[i].getName()).trim();
					}
				}
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
