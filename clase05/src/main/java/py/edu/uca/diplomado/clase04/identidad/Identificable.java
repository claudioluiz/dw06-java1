package py.edu.uca.diplomado.clase04.identidad;

/**
 * Definimos una interfaz que deben implementar todas las Clases que deban ser Identificables
 * @author juca
 *
 */
public interface Identificable {

	public static final String CODIGO_ISO_PARAGUAY = "PY";
	public static final String CODIGO_ISO_BRASIL = "BR";
	
//	DocumentoIdentidad getIdentidad();
	String getNroIdentidad();
	
	String getCodigoISOPais();
}
