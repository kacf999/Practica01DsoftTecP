package modelo;

import modelo.Tipo.tipo;

public class Telefono {
	private Tipo.tipo atipo;
	private String numero;
	
	public Telefono(){}
	
	public Telefono(tipo atipo, String numero) throws Exception{
		this.atipo = atipo;
		setNumero(numero);
	}

	public Tipo.tipo getAtipo() {
		return atipo;
	}

	public void setAtipo(Tipo.tipo atipo) {
		this.atipo = atipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) throws Exception {
		if(numero.length() == 10) {
			this.numero = numero;
		}else {
			throw new Exception("numero no valido");
		}
	}
	
}
