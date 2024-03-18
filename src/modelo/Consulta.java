package modelo;
import java.util.Calendar;

public class Consulta {
	private Calendar fecha;
    private String diagnostico;
    private String tratamiento;
    private Medico medico;

    public Consulta(Calendar fecha, String diagnostico, 
    		String tratamiento, Medico medico) throws Exception{
        setFecha(fecha);
        setDiagnostico(diagnostico);
        setTratamiento(tratamiento);
        setMedico(medico);
    }

	
	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	
	public String obtenerFecha() {
		int anio = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		return ""+dia+"/"+(mes+1)+"/"+anio;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
}
