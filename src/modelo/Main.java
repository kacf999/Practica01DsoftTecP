package modelo;

public class Main {

	public static void main(String[] args) throws Exception {
		Telefono telefono = new Telefono(Tipo.tipo.Fijo, "5527529715");
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Jose Alberto");
		estudiante.setApellidos("Roberto");
		estudiante.setEdad(63);
		estudiante.setDireccionElectronica("cosas@gmail.com");
		estudiante.setTelefono(telefono);
		estudiante.setMatricula("180030773");
		
		System.out.println("Nombre "+estudiante.getNombre()+" Matricula "+estudiante.getMatricula());
		System.out.println("Telefono "+estudiante.getTelefono().getNumero());
	}

}
