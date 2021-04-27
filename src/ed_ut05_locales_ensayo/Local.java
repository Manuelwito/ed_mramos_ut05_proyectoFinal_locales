package ed_ut05_locales_ensayo;

public class Local {
	
	private int id;
	private String ampliBajo;
	private String ampliGuitar;
	private String bateria;
	private boolean reservado;
	/**
	 * 
	 */
	public Local() {
		super();
	}
	/**
	 * @param ampliBajo
	 * @param ampliGuitar
	 * @param bateria
	 * @param reservado
	 */
	public Local(String ampliBajo, String ampliGuitar, String bateria, boolean reservado) {
		this.ampliBajo = ampliBajo;
		this.ampliGuitar = ampliGuitar;
		this.bateria = bateria;
		this.reservado = reservado;
	}
	public String getAmpliBajo() {
		return ampliBajo;
	}
	
	public int id() {
		return id;
	}
	public void setAmpliBajo(String ampliBajo) {
		this.ampliBajo = ampliBajo;
	}
	
	public void id(int id) {
		this.id = id;
	}
	public String getAmpliGuitar() {
		return ampliGuitar;
	}
	public void setAmpliGuitar(String ampliGuitar) {
		this.ampliGuitar = ampliGuitar;
	}
	public String getBateria() {
		return bateria;
	}
	public void setBateria(String bateria) {
		this.bateria = bateria;
	}
	public boolean isReservado() {
		return reservado;
	}
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

}


