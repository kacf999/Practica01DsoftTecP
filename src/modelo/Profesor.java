package modelo;

public class Profesor extends Persona {
	private String numeroEmpleado;

    // Constructor
    public Profesor(String nombre, String apellidos, int edad, 
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

	public void mostrarDatos() {
		System.out.println("Numero de Empleado: "+getNumeroEmpleado());
		System.out.println("Nombre: "+getNombre()+ " Apellidos: "+getApellidos());
		System.out.println("Edad: "+getEdad()+" Direccion Electronica: "+getDireccionElectronica());
		System.out.println("Telefono: "+getTelefono().getNumero()+" tipo: "+getTelefono().getAtipo());
	}
}
