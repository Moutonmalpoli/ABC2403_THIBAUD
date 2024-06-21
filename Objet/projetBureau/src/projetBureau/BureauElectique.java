package projetBureau;

public class BureauElectique extends Bureau{
	private boolean branche;
	
	public BureauElectrique() {
		super();
		branche=false;
	}
	public BureauElectrique(boolean _branche, BigDecimal _hauteurEnCM) {
		super(_hauteurEnCM);
		branche= _branche;
	}
}
