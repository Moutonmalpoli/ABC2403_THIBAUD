package bouteilles;

public class Bouteille {
	
	//attributes 
	private String typeDeContenu;
	private float contenanceEnL;
	private float contenuEnL;
	private boolean ouvert;
	private boolean fermer;
	private boolean remplir;
	private boolean vider;
	private float quantite;
	
	
	//access/modifier
	
	//constructor
	
	//constructeur par defaut
	public Bouteille() {
		typeDeContenu= "H20";
		contenanceEnL= 1;
		contenuEnL= 1;
		ouvert= false;
		fermer= true;
		remplir= false;
		vider= false;
		quantite= 0;
	}
	
	//constructeur classique
	
	public Bouteille(float _contenanceEnL,float _contenuEnL,boolean _ouvert,String _typeDeContenu, boolean _fermer, boolean _remplir, boolean _vider, float _quantite) {
		
		// initialization attributes 
		// this refers to the object, not the class
		this.contenanceEnL= _contenanceEnL;
		this.contenuEnL=_contenuEnL;
		this.ouvert=_ouvert;
		this.typeDeContenu=_typeDeContenu;
		this.fermer =_fermer;
		this.remplir =_remplir;
		this.vider=_vider;
		this.quantite= _quantite;
	}
	
	//constructeur par recopie ou de clonage
	/*
	public Bouteille(Bouteille _bouteilleARecopier) {
		this.contenanceEnL=_bouteilleARecopier.contenanceEnL;
		this.contenuEnL=_bouteilleARecopier.contenuEnL;
		this.ouvert=_bouteilleARecopier.ouvert;
		this.typeDeContenu=_bouteilleARecopier.typeDeContenu;
		
	}
	*/
	
	//methods
	
	public float donneContenanceEncL() {
		float result;
		result = this.contenanceEnL*100;
		return result;
	
	}
	public float donneContenuEncL() {
		float result;
		result = this.contenuEnL*100;
		return result;
	}
	public boolean ouvert() {
		if (ouvert=true) {
			
		System.out.println("Impossible, la bouteille est déja ouverte.");
		return ouvert;
		}
		else {
			
			ouvert = true;
			System.out.println("La bouteille est ouverte.");
			return ouvert;
		}
	}
	public boolean fermer() {
		if (fermer=true) {
			System.out.println("Impossible, la bouteille est déja fermée.");
			return fermer;
		}
		else {
			fermer = true;
			System.out.println("La bouteille est fermée.");
			return fermer;
		}
	}

	public boolean remplir(float quantite) {
		boolean retour=false;

		if (this.ouvert== true && quantite<=(this.contenanceEnL-this.contenuEnL))
		{
			retour = true;
			contenuEnL+= quantite;
			
		}

		return retour;
		
	}
	public boolean vider(float quantite) {
		boolean retour= false;
		
		if(this.ouvert == true && ) {
			
		}
		}
}

