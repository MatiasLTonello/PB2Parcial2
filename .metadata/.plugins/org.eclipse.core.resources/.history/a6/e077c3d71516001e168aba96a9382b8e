package ar.edu.unlam;

public class Cumple extends Evento {
	Usuario agasajado;
    public Cumple(String nombre, Usuario agasajado) {
        super(nombre);
        this.agasajado = agasajado;
    }

	public Cumple(Usuario agasajado) {
		this.agasajado = agasajado;
	}

	@Override
	protected void add(Usuario agasajado) {
		if(agasajado == null) {
			setAgasajado(agasajado);
		}
	}


}
