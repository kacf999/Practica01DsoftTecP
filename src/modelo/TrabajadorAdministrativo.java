package modelo;

public class TrabajadorAdministrativo extends Paciente {
	private String numeroEmpleado;

    // Constructor
    public TrabajadorAdministrativo(String nombre, String apellidos, int edad, 
    		String direccionElectronica, Telefono telefono, 
    		String numeroEmpleado) throws Exception{
        super(nombre, apellidos, edad, direccionElectronica, telefono);
        setNumeroEmpleado(numeroEmpleado);
    }

    // Getters y Setters
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

}
