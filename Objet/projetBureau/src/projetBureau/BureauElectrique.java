package projetBureau;

public class BureauElectique extends Bureau{
	private boolean branche;
	
	public BureauElectique() {
		super();
		branche=false;
	}
	public BureauElectique(boolean _branche, BigDecimal _hauteurEnCM) {
		super(_hauteurEnCM);
		branche= _branche;
	}
}
