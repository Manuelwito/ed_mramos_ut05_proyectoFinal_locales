package ed_ut05_locales_ensayo;

public class LocalPremium extends Local {

	private String piano;
	private String percusion;
	
	
	
	
	/**
	 * 
	 */
	public LocalPremium() {
		super();
	}

	/**
	 * @param ampliBajo
	 * @param ampliGuitar
	 * @param bateria
	 * @param reservado
	 */
	public LocalPremium(String ampliBajo, String ampliGuitar, String bateria, boolean reservado) {
		super(ampliBajo, ampliGuitar, bateria, reservado);
	}

	/**
	 * @param piano
	 * @param percusion
	 */
	public LocalPremium(String piano, String percusion) {
		this.piano = piano;
		this.percusion = percusion;
	}

	@Override
	public String getAmpliBajo() {
		return super.getAmpliBajo();
	}

	@Override
	public void setAmpliBajo(String ampliBajo) {
		super.setAmpliBajo(ampliBajo);
	}

	@Override
	public String getAmpliGuitar() {
		return super.getAmpliGuitar();
	}

	@Override
	public void setAmpliGuitar(String ampliGuitar) {
		super.setAmpliGuitar(ampliGuitar);
	}

	@Override
	public String getBateria() {
		return super.getBateria();
	}

	@Override
	public void setBateria(String bateria) {
		super.setBateria(bateria);
	}

	@Override
	public boolean isReservado() {
		return super.isReservado();
	}

	@Override
	public void setReservado(boolean reservado) {
		super.setReservado(reservado);
	}

}
