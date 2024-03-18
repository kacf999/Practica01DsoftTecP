package modelo;

public class Profesor extends Paciente {
	private int numeroEmpleado;
    private int edad;

    // Constructor
    public Profesor(int numeroEmpleado, int edad) throws Exception{
        super();
        this.numeroEmpleado = numeroEmpleado;
        this.edad = edad;
    }

    // Getters y Setters
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
