package bouteilles;

public class Bouteille {
	
	//attributes 
	private String typeDeContenu;
	private float contenanceEnL;
	private float contenuEnL;
	private boolean ouvert;
	
	//access/modifier
	
	//constructor
	
	//constructeur par defaut
	public Bouteille() {
		typeDeContenu="H20";
		contenanceEnL=1;
		contenuEnL=1;
		ouvert=false;
	}
	
	//constructeur classique
	
	public Bouteille(float _contenanceEnL,float _contenuEnL,boolean _ouvert,String _typeDeContenu) {
		
		// this refers to the object, not the class
		this.contenanceEnL=_contenanceEnL;
		this.contenuEnL=_contenuEnL;
		this.ouvert=_ouvert;
		this.typeDeContenu=_typeDeContenu;
	}
	
	//constructeur par recopie ou de clonage
	
	public Bouteille(Bouteille _bouteilleARecopier) {
		this.contenanceEnL=_bouteilleARecopier.contenanceEnL;
		this.contenuEnL=_bouteilleARecopier.contenuEnL;
		this.ouvert=_bouteilleARecopier.ouvert;
		this.typeDeContenu=_bouteilleARecopier.typeDeContenu;
		
	}
	
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
			
		System.out.println("Impossible, la bouteille est déja ouverte");
		return ;
		}
		else {
			
			ouvert = true;
			System.out.println("La bouteille est ouverte");
			return ouvert;
		}
	}
	
	}

