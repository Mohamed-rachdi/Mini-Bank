
public class Compte {
     private int numero;
     private float solde;
     

	public  void depot(float valeur) {
		
		this.solde=this.solde+valeur;
		
	}
	public  void retrait(float valeur) {
		this.solde=this.solde-valeur;
		
	}
	public float getsolde(){
		
		return this.solde;
	}
	public void afficherSolde(){
		
		System.out.println("le solde est : " + this.solde +"DH");
	}
	public void virer(float valeur , Compte destinataire){
		if(valeur >0)
		this.retrait(valeur);
		destinataire.depot(valeur);}
	}


