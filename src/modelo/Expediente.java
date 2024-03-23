package modelo;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Expediente implements Iterator{
	private Persona paciente;
	private List<Consulta> consultas;
	private int indice;
	
	public Expediente(Persona paciente) {
		setPaciente(paciente);
		consultas = new ArrayList<Consulta>();
	}
	
	public Persona getPaciente(){
		return paciente;
	}
	
	public void setPaciente(Persona paciente){
		this.paciente = paciente;
	}
	
	public void agregarConsulta(Consulta consulta) {
		consultas.add(consulta);
	}
	
	public void mostrarConsultas() {
		System.out.println("Mostrando consultas del paciente: "+paciente.getNombre()+" "+paciente.getApellidos());
		for(int i = 0; i<consultas.size(); i++) {
			System.out.println("consulta: "+consultas.get(i).obtenerFecha());
			System.out.println("Diagnostico: "+consultas.get(i).getDiagnostico());
			System.out.println("Tratamiento: "+consultas.get(i).getTratamiento());
			System.out.println("Medico: "+consultas.get(i).getMedico().getNombre() +" "+consultas.get(i).getMedico().getApellidos());
			System.out.println("Cedula Profesional: "+consultas.get(i).getMedico().getCedulaProfesional());
			System.out.println("-----------------------------------------------------------------------------");
		}
	}
	
	public List<Consulta> getConsultas() {
		return Collections.unmodifiableList(consultas);
	}

	@Override
	public boolean hasNext() {
		return indice < consultas.size();
	}

	@Override
	public Object next() {
		if(hasNext()) {
			return consultas.get(indice++);
		}else{
			throw new NoSuchElementException();
		}
	}

	public int compareTo(Expediente o) {
		return paciente.getApellidos().compareTo(o.paciente.getApellidos());
	}
	
	public int size() {
		return consultas.size();
	}
	
}
