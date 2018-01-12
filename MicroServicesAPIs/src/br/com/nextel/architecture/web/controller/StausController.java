package br.com.nextel.architecture.web.controller;

import br.com.nextel.architecture.model.utils.Resources;

public class StausController {

	public static boolean CONSULTA_STATUS = false;
	
	public static final String HOST_NAME_PRIMARIO = Resources.getInstance().getProperty(Resources.GENESYS, "HOST_NAME_PRIMARIO");
	
	public static final String HOST_NAME_SECUNDARIO = Resources.getInstance().getProperty(Resources.GENESYS, "HOST_NAME_SECUNDARIO");
	
	public static int QUANTIDADE_HOST_NAME_GENESYS = 0;
	
	public static String HOST_NAME_UTILIZADO_NO_MOMENTO = HOST_NAME_PRIMARIO;

}
