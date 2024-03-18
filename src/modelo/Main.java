package modelo;
import java.util.Calendar;

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
		
		Calendar fecha = Calendar.getInstance();
		//fecha.set(2023, 4, 1); anio, mes(enero = 0), dia
		Consulta consulta = new Consulta(fecha, "dolor en las rodillas","se le amputaron las rodillas",medico);
		System.out.println("Fecha: "+consulta.obtenerFecha()+" diagnostico:"+consulta.getDiagnostico()+" tratamiento:"+consulta.getTratamiento()+" medico:"+medico.getNombre());
		
		Expediente expediente = new Expediente(estudiante);
		expediente.agregarConsulta(consulta);
		
		
		fecha.set(2023, 2, 4);
		Consulta consulta2 = new Consulta(fecha, "Le rompieron el corazon","Cariñosas 2 veces a la semana",medico);
		expediente.agregarConsulta(consulta2);
		
		expediente.mostrarConsultas();
	}

}
