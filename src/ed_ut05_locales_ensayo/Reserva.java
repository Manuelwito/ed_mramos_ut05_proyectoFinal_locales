package ed_ut05_locales_ensayo;

public class Reserva {
	
	private String hora;
	private int duracion;
	private boolean reservaCompletada;
	private Banda grupo;
	private Local local;
	
	
	
	
	
	/**
	 * @param hora
	 * @param duracion
	 * @param reservaCompletada
	 * @param grupo
	 */
	public Reserva(String hora, int duracion, boolean reservaCompletada, Banda grupo) {
		this.hora = hora;
		this.duracion = duracion;
		this.reservaCompletada = reservaCompletada;
		this.grupo = grupo;
	}
	
	
	@Override
	public String toString() {
		return "Reserva [hora=" + hora + ", duracion=" + duracion + ", reservaCompletada=" + reservaCompletada
				+ ", grupo=" + grupo + "]";
	}


	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public boolean isReservaCompletada() {
		return reservaCompletada;
	}
	public void setReservaCompletada(boolean reservaCompletada) {
		this.reservaCompletada = reservaCompletada;
	}
	public Banda getGrupo() {
		return grupo;
	}
	public void setGrupo(Banda grupo) {
		this.grupo = grupo;
	}
	
	public boolean reservar(String hora, int duracion, Banda grupo, Local local) {
		if (local.isReservado()==true) {
			
			return false;
			
		}
		
		return true;
	}
	
	
	

}
