package py.edu.uca.diplomado.clase01;

import java.io.IOException;
import java.util.ArrayList;

import py.edu.uca.diplomado.clase02.Alumno;
import py.edu.uca.diplomado.clase02.Auto;
import py.edu.uca.diplomado.clase02.Persona;
import py.edu.uca.diplomado.clase02.Profesor;
import py.edu.uca.diplomado.clase04.identidad.Identificable;
import py.edu.uca.diplomado.clase05.exception.EdadInsuficienteException;
import py.edu.uca.diplomado.clase05.exception.NacionalidadException;

public class Materia {
	/*
	 * Definimos una clase nueva, la convención determina que la primera letra
	 * debe ser mayúscula y el resto ya es a elección, mezcla de letras y
	 * números. Debe definirse dentro del archivo, por lo menos la clase con el
	 * mismo nombre del archivo que la contiene.
	 */

	/**
	 * @param args
	 */
	/*
	 * Para la clase01 declaramos con el modificador static para poder
	 * utilizarlo dentro del método main. Al declarar una propiedad o un método
	 * con el modificador "static" estamos haciendo que petenezca a toda la
	 * Clase, es decir el valor es compartido por todas las instancias
	 */
	public static Auto transporte;

	private Alumno alumno;
	private Profesor profesor;
	/*
	 * La propiedad codigo, es una propiedad de instancia, es decir cada nuevo
	 * objeto tiene su propio valor para esta propiedad
	 */
	private String codigo;
	private String descripcion;

	/*
	 * Una lista (la Clase Java Arraylist, que contendrá a los alumnos
	 * inscriptos)
	 */
	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

	public Materia() {
		inicializarMateria();
	}

	public Materia(String codigo) {
		this();
		setCodigo(codigo);
	}

	/*
	 * El método main con esta firma convierte a esta clase Java en una
	 * aplicación Java, es decir puede ejecutarse directamente
	 */
	public static void main(String[] args) {
		Materia java1 = new Materia();
		/*
		 * La clase System es parte del JRE y contiene un campo de tipo
		 * PrintStream para imprimir en la consola. Al utilizar directamente un
		 * string entre comillas, por detrás se instancia un objeto de tipo
		 * String
		 */
		System.out.println(new String("Hello World!"));
		java1.inicializarMateria();

		// Persona guardia = new Persona();
		System.out.println("Alumno: " + java1.getAlumno().getNombre());
		System.out.println("Profesor: " + java1.getProfesor().getNombre());
	}

	public void inicializarMateria() {
		/* Creamos una nueva instancia de la clase Auto */
		transporte = new Auto();
		/* Enviamos el mensaje de arrancar a la clase recientemente creada */
		transporte.arrancar();

		setAlumno(new Alumno());
		setProfesor(new Profesor());

		getAlumno().setNombre("Ale");
		getAlumno().setApellido("Feltes");
		getProfesor().setNombre("Luca");
		getProfesor().setApellido("Cernuzzi");
		getAlumno().setNumeroMatricula(37122);
		System.out.println("Alumno: " + getAlumno());
		System.out.println("Profesor: " + getProfesor());

		reservarSilla(getAlumno());
		reservarSilla(getProfesor());

	}

	public void reservarSilla(Persona persona) {
		System.out.println("Silla reservada: " + persona);
		if (persona instanceof Profesor) {
			boolean resultad = reservarProyector(persona, getCodigo());
		}
	}

	private boolean reservarProyector(Persona persona, String codigo2) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public static void describirMateria() {

	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void inscribirPersona(Alumno alumno2) throws NacionalidadException, IOException {
		if (!Identificable.CODIGO_ISO_PARAGUAY.equals(alumno2.getCodigoISOPais())) {
			throw new NacionalidadException(
					"Sólo se aceptan alumnos de nacionalidad Paraguaya. El alumno que intento inscribirse es: "
							+ alumno2.toString() + " y tiene nacionalidad " + alumno2.getCodigoPais());
		} else {
			System.out.println("Inscribiendo a: " + alumno2);
		}

	}

}
