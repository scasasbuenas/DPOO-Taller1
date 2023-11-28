package modelo;

public abstract class HamburguesaException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5355498235359237807L;

	public HamburguesaException(String laExcepcion) {
		super(laExcepcion);
	}
}
