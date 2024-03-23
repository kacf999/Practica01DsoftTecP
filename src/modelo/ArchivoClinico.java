package modelo;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArchivoClinico implements Iterator{
	private List<Expediente> expedientes;
	private int indice;
	
	public ArchivoClinico() {
		expedientes = new ArrayList<Expediente>();
	}
	
	public void agregarExpediente(Expediente expediente) {
		expedientes.add(expediente);
	}
	
	public List<Expediente> getExpediente(){
		return Collections.unmodifiableList(expedientes);
	}
	
	public void mostrarExpedientes(){
		System.out.println("Mostrando Expedientes: ");
		for(int i=0; i < expedientes.size(); i++) {
			System.out.println("Nombre: "+expedientes.get(i).getPaciente().getNombre()+" "
					+expedientes.get(i).getPaciente().getApellidos());
			System.out.println("Numero de consultas: "+expedientes.get(i).size());
			System.out.println("--------------------------------------------------------------");
		}
	}

	@Override
	public boolean hasNext() {
		return indice < expedientes.size();
	}

	@Override
	public Object next() {
		if(hasNext()) {
			return expedientes.get(indice++);
		}else{
			throw new NoSuchElementException();
		}
	}

	public int size() {
		return expedientes.size();
	}

	public boolean isEmpty() {
		if(expedientes.size()==0) {
			return true;
		}
		return false;
	}
	
	public void ordenarExpedientes() {
		Collections.sort(expedientes, (expediente1, expediente2) ->
        expediente1.getPaciente().getApellidos().compareTo(expediente2.getPaciente().getApellidos()));
	}
	
}
