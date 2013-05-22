package py.edu.uca.diplomado.clase05.instrumento;

public class Note {

	private Double frecuencia;
	public static final Note MIDDLE_C = new Note();

	public void setFrecuencia(Double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public Double getFrecuencia() {
		if (frecuencia == null)
			frecuencia = 0d;
		return frecuencia;
	}

	@Override
	public String toString() {
		return "Note con frecuencia: " + getFrecuencia();
	}
}