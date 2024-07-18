package porteGarage;

 public class PorteGarage  {

	private boolean estVerouille;
	private float pourcentageOuverture;
	private float pourcentageOuvertureMax;
	private float pourcentageOuvertureMin;

	PorteGarage(boolean _estVerouille, float _pourcentageOuverture, float _pourcentageOuvertureMax, float _pourcentageOuvertureMin){
	this.estVerouille = _estVerouille;
	this.pourcentageOuverture = _pourcentageOuverture;
	this.pourcentageOuvertureMax= _pourcentageOuvertureMax;
	this.pourcentageOuvertureMin =_pourcentageOuvertureMin;
	}
	
	
	//porteDuPauvre
	public PorteGarage() {
		estVerouille = false;
		pourcentageOuverture = 20f;
		pourcentageOuvertureMax = 70f;
		pourcentageOuvertureMin = 0f;
	}
	
	
	
 
 }
