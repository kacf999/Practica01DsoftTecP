package modelo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Medico extends Persona{
	private String numeroEmpleado;
    private String cedulaProfesional;

    public Medico(String nombre, String apellidos, int edad, String direccionElectronica, 
    		Telefono telefono, String numeroEmpleado, 
    		String cedulaProfesional) throws Exception {
    	super(nombre, apellidos, edad, direccionElectronica, telefono);
    	setNumeroEmpleado(numeroEmpleado);
        setCedulaProfesional(cedulaProfesional);
    }

	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(String numeroEmpleado) throws Exception{
		Pattern pat = Pattern.compile("[0-9]{5}"); // Se espera un número de 5 dígitos
		Matcher mat = pat.matcher(numeroEmpleado);
		if (mat.matches()) {
		this.numeroEmpleado = numeroEmpleado;
		}else {
			throw new Exception("El numero de empleado no es valido");
		}
	}

	public String getCedulaProfesional() {
		return cedulaProfesional;
	}

	public void setCedulaProfesional(String cedulaProfesional) throws Exception{
		Pattern pat = Pattern.compile("[A-Z]{3}[0-9]{3}");
		Matcher mat = pat.matcher(cedulaProfesional);
		if (mat.matches()) {
		this.cedulaProfesional = cedulaProfesional;
		}else {
			throw new Exception("La cedula profesional no es validas");
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Cedula Profesional: "+getCedulaProfesional());
		System.out.println("Numero de Empleado: "+getNumeroEmpleado());
		System.out.println("Nombre: "+getNombre()+ " Apellidos: "+getApellidos());
		System.out.println("Edad: "+getEdad()+" Direccion Electronica: "+getDireccionElectronica());
		System.out.println("Telefono: "+getTelefono().getNumero()+" tipo: "+getTelefono().getAtipo());
	}
}
