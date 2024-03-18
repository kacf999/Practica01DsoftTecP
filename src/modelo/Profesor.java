package modelo;

public class Profesor extends Paciente {
	private String numeroEmpleado;
	private String cedulaProfesional;

    // Constructor
    public Profesor(String nombre, String apellidos, int edad, 
    		String direccionElectronica, Telefono telefono,
    		String numeroEmpleado, String cedulaProfesional) throws Exception{
        super(nombre, apellidos, edad, direccionElectronica, telefono);
        setNumeroEmpleado(numeroEmpleado);
        setCedulaProfesional(cedulaProfesional);
    }

    // Getters y Setters
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

	public String getCedulaProfesional() {
		return cedulaProfesional;
	}

	public void setCedulaProfesional(String cedulaProfecional) {
		this.cedulaProfesional = cedulaProfecional;
	}
    
}
