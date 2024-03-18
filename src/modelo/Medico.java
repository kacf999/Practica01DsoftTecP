package modelo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Medico extends Paciente{
	private String numeroEmpleado;
    private String cedulaProfesional;
    private Consulta consulta; // Relación de composición

    public Medico(String numeroEmpleado, String cedulaProfesional, Consulta consulta) throws Exception {
        this.numeroEmpleado = numeroEmpleado;
        this.cedulaProfesional = cedulaProfesional;
        this.consulta = consulta;
    }

	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(String numeroEmpleado) throws Exception{
		Pattern pat = Pattern.compile("[0-9]{5}"); // Se espera un número de 5 dígitos
		Matcher mat = pat.matcher(numeroEmpleado);
		if (mat.matches()) {
		this.numeroEmpleado = numeroEmpleado;
		}else {
			throw new Exception("El numero de empleado no es valido");
		}
	}

	public String getCedulaProfesional() {
		return cedulaProfesional;
	}

	public void setCedulaProfesional(String cedulaProfesional) throws Exception{
		Pattern pat = Pattern.compile("[A-Z]{3}[0-9]{3}");
		Matcher mat = pat.matcher(cedulaProfesional);
		if (mat.matches()) {
		this.cedulaProfesional = cedulaProfesional;
		}else {
			throw new Exception("La cedula profesional no es validas");
		}
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

}
