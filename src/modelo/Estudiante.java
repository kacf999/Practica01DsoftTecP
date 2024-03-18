package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Estudiante extends Paciente {
	private String matricula;
	
	public Estudiante() {}

	public Estudiante(String nombre, String apellidos, int edad, String direccionElectronica, Telefono telefono, String matricula) throws Exception{
		super(nombre, apellidos, edad, direccionElectronica, telefono);
		setMatricula(matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) throws Exception{
		Pattern pat = Pattern.compile("[0-2][0-9]00[1-5][0-9]+");
	    Matcher mat = pat.matcher(matricula);                                                                           
	    if (mat.matches()) {
	    	this.matricula = matricula;
	    } else {
	        throw new Exception("Matricula no valida");                                                                              
	    }
	}
	
}
