package modelo;
import java.util.List;
import java.util.ArrayList;
public class Expediente {
	private Paciente paciente;
	private List<Consulta> consultas;
	
	public Expediente(Paciente paciente) {
		setPaciente(paciente);
		consultas = new ArrayList<Consulta>();
	}
	
	public Paciente getPaciente(){
		return paciente;
	}
	
	public void setPaciente(Paciente paciente){
		this.paciente = paciente;
	}
	
	public void agregarConsulta(Consulta consulta) {
		consultas.add(consulta);
	}
	
	public void mostrarConsultas() {
		System.out.println("Mostrando consultas del paciente: "+paciente.getNombre());
		for(int i = 0; i<consultas.size(); i++) {
			System.out.println("consulta: "+consultas.get(i).obtenerFecha()+
					" diagnostico: "+consultas.get(i).getDiagnostico()+
					" tratamiento: "+consultas.get(i).getTratamiento());
			System.out.println("Medico: "+consultas.get(i).getMedico().getNombre()+
					" Cedula Profesional: "+consultas.get(i).getMedico().getCedulaProfesional());
		}
	}
}
