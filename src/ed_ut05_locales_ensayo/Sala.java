package ed_ut05_locales_ensayo;

import java.util.List;

public class Sala {
	
	private String nombre;
	private String direccion;
	private List<Local> locales;
	
	public Sala() {
		
	}
	
	
	/**
	 * @param nombre
	 * @param direccion
	 * @param locales
	 */
	public Sala(String nombre, String direccion, List<Local> locales) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.locales = locales;
	}
	@Override
	public String toString() {
		return "Sala [nombre=" + nombre + ", direccion=" + direccion + ", locales=" + locales + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Local> getLocales() {
		return locales;
	}
	public void setLocales(List<Local> locales) {
		this.locales = locales;
	}

}
