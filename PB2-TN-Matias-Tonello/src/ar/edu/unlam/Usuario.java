package ar.edu.unlam;

import java.util.Comparator;
import java.util.Objects;

public class Usuario implements Comparator<Usuario>{
    private String email;
    private String nombre;
    private Integer edad;
    private Evento eventoOrganizado;

    public Usuario(String email, String nombre, Integer edad) {
        this.email = email;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void convertirseEnOrganizador(Evento evento) {
        this.eventoOrganizado = evento;
    }

    public Evento getEventoOrganizado() {
        return eventoOrganizado;
    }

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email);
	}

	@Override
	public int compare(Usuario o1, Usuario o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
}



