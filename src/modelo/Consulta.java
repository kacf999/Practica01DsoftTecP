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
