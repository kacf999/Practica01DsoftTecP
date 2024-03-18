package modelo;

public class Main {

	public static void main(String[] args) throws Exception {
		Telefono telefono = new Telefono(Tipo.tipo.Fijo, "5527529715");
		Estudiante estudiante = new Estudiante("Jose", "Roberto", 63, "cosas@gmail.com",telefono,"180030773");
		
		System.out.println("Nombre "+estudiante.getNombre()+" Matricula "+estudiante.getMatricula());
		System.out.println("Telefono "+estudiante.getTelefono().getNumero());
		
		Medico medico = new Medico("Alegandra", "Mercado", 45, "Doctora@gmail.com", telefono, "12345", "ASD123");
		System.out.println("Nombre: "+medico.getNombre()+" cedula Profesional: "+medico.getCedulaProfesional());
		
		Profesor profesor = new Profesor("Javier", "Torres", 29, "MonasChinas@Yahoo.com", telefono, "98345","PSO098");
		System.out.println("Nombre: "+profesor.getNombre()+" numero de Empleado: "+profesor.getCedulaProfesional());
		
		TrabajadorAdministrativo secretaria = new TrabajadorAdministrativo("Clara", "Robles", 32, "ChocoFlan@Hotmail.com", telefono, "89234");
		System.out.println("Nombre: "+secretaria.getNombre()+" numero de Empleado: "+secretaria.getNumeroEmpleado());
	}

}
