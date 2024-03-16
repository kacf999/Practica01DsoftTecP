package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Paciente {
	private String nombre;
	private String apellidos;
	private int edad;
	private String direccionElectronica;
	private Telefono telefono;
	
	public Paciente() {}

	public Paciente(String nombre, String apellidos, int edad, String direccionElectronica, Telefono telefono) 
	throws Exception{
		setNombre(nombre);
		setApellidos(apellidos);
		setEdad(edad);
		setDireccionElectronica(direccionElectronica);
		setTelefono(telefono);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws Exception{
		Pattern pat = Pattern.compile("[A-Za-z ]+{1,2}");
	    Matcher mat = pat.matcher(nombre);                                                                           
	    if (mat.matches()) {
	    	this.nombre = nombre;
	    }else {
	        throw new Exception("Nombre no valido");
	    }
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) throws Exception{
		Pattern pat = Pattern.compile("[A-Za-z ]+{1,2}");
	    Matcher mat = pat.matcher(apellidos);                                                                           
	    if (mat.matches()) {
	    	this.apellidos = apellidos;
	    }else {
	        throw new Exception("Apellidos no valido");
	    }
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception{
		if(edad>0 && edad<150) {
			this.edad = edad;
		}else {
			throw new Exception("Edad no valida");
		}
	}

	public String getDireccionElectronica() {
		return direccionElectronica;
	}

	public void setDireccionElectronica(String direccionElectronica) {
		this.direccionElectronica = direccionElectronica;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	
}
