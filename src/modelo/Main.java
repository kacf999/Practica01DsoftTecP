package modelo;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) throws Exception {
		Telefono telefono = new Telefono(Tipo.tipo.Fijo, "5527529715");
		Telefono telefono2 = new Telefono(Tipo.tipo.Celular, "5527523023");
		Estudiante estudiante = new Estudiante("Jose", "Roberto", 63, "cosas@gmail.com",telefono,"180030773");
		
		estudiante.mostrarDatos();
		
		Medico medico = new Medico("Alegandra", "Mercado", 45, "Doctora@gmail.com", telefono, "12345", "ASD123");
		medico.mostrarDatos();
		
		Profesor profesor = new Profesor("Javier", "Alvares", 29, "MonasChinas@Yahoo.com", telefono2, "98345");
		profesor.mostrarDatos();
		
		TrabajadorAdministrativo secretaria = new TrabajadorAdministrativo("Clara", "Robles", 32, "ChocoFlan@Hotmail.com", telefono2, "89234");
		secretaria.mostrarDatos();
		
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
		
		Expediente expediente2 = new Expediente(profesor);
		expediente2.agregarConsulta(consulta);
		expediente2.agregarConsulta(consulta2);
		
		Expediente expediente3 = new Expediente(secretaria);
		expediente3.agregarConsulta(consulta);
		expediente3.agregarConsulta(consulta2);
		
		ArchivoClinico archivo = new ArchivoClinico();
		archivo.agregarExpediente(expediente3);
		archivo.agregarExpediente(expediente);
		archivo.agregarExpediente(expediente2);
		archivo.mostrarExpedientes();
		System.out.println("Mostrando expedientes ordenados");
		
		archivo.ordenarExpedientes();
		archivo.mostrarExpedientes();
	}

}
