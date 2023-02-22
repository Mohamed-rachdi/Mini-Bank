import java.util.Scanner;
public class Client {
	private String nom;
	private Compte compte;
    private Compte[] comptes = new Compte[10];
    private int nbComptes;
    public String getNom(){
    	return this.nom;
    }
    public float  getSolde(){
    	return this.compte.getsolde();
    }
    public void afficherSolde(){
		compte.afficherSolde();
		
	}
    Client(String nom){
    	
    	this.nom=nom;
    }
   public void ajouterCompte(){
	   
	   Compte c1=new  Compte();
	   if(this.nbComptes<10){
	   comptes[nbComptes]=c1;
	   this.nbComptes+=1; }
	   
	   
   }

   
  
    public float soldeTotal(){
    	float s=0;
    	for(int i=0;i<this.nbComptes;i++)
    	{ s=s+this.comptes[i].getsolde();}
    	return s;
    }
    public void bilanClient(){
    	
    	for(int i=0;i<this.nbComptes;i++)
    	{ System.out.println("le solde du compte n°"+i+1+ "est de "+this.comptes[i].getsolde()+"DH");}
    	
    }
    public void operationsClient(){
    	 boolean fin=false;
    	while(!fin){
    	System.out.println("********************** Menu Client **********************");
    	System.out.println("Quelle opération voulez-vous effectuer sur le client "+this.nom);    	
    	    	
    	System.out.println("1) Faire un retrait ");
    	System.out.println("2) Faire un dépot ");
    	System.out.println("3) Faire un virement  ");
    	
    	System.out.println("4) Afficher un bilan ");
    	System.out.println("5) Revenr au menu Banque ");
    	System.out.println("saisir votre choix SVP : ");
    	Scanner c = new Scanner(System.in);
    	int s=c.nextInt();
    	switch(s){
    	
    	case 1 : 
    		System.out.println("De quel montant ?"); 
    		Scanner mn= new Scanner(System.in);
        	float   mnt=mn.nextFloat();
        	this.comptes[0].depot(mnt);
        	System.out.println("le depot a ete effectue");
        	System.out.println("");
        	break;
    	case 2 : 
    		System.out.println("De quel montant ?"); 
    		Scanner mn1= new Scanner(System.in);
        	float   mnt1=mn1.nextFloat();
        	this.comptes[0].retrait(mnt1);
        	System.out.println("le retrait  a ete effectue");
        	System.out.println("");
        	break;	
    	case 3 : 
    		System.out.println("De quel montant ?"); 
    		Scanner mn2= new Scanner(System.in);
        	float   montant=mn2.nextFloat();
        	System.out.println("compte emetteur  ?"); 
        	Scanner mn3= new Scanner(System.in);
        	int emetteur=mn3.nextInt();
        	System.out.println("compte distinataire  ?"); 
        	Scanner mn4= new Scanner(System.in);
        	int distinataire=mn4.nextInt();
        	if((emetteur <= this.nbComptes)&&  ( distinataire< this.nbComptes)){
        		this.comptes[emetteur].virer(montant,comptes[distinataire]);
        		System.out.println("le virement a été effectué");
        		System.out.println("");}
        	else {System.out.println("on peut pas ");System.out.println("");}
        	break;	
        		
    	  case 4 : 
    		this.ajouterCompte();
    		System.out.println("le compte n "+this.nbComptes+"a été créé");
    		System.out.println("");
    		
        	break;		
    		
    	  case 5 : 
      		this.bilanClient();
          	break;
    	  case 6:
    		  fin=true;
    	}

    }}
    

    
}
