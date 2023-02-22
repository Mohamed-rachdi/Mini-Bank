import java.util.Scanner;
public class Banque {
	private Client[] clients = new Client[100];
	private int nbClients;
	public void ajouterClient(String nomClient){
		Client c1=new  Client(nomClient);
		   if(this.nbClients<100){
		 clients[nbClients]=c1;
		 nbClients+=1;
		   }}
	public void interaction(){
		 boolean fin=false;
	    	while(!fin){
	    	System.out.println("********************** Menu Banque **********************");
	    	System.out.println("Quelle opération voulez-vous effectuer ?");    	
	    	    	
	    	System.out.println("1) Ajouter un client ");
	    	System.out.println("2) Effectuer une opération sur un client ");
	    	System.out.println("3) quiter le programe  ");
	    
	    	Scanner c = new Scanner(System.in);
	    	int s=c.nextInt();
	    	switch(s){
	    	
	    	case 1 : 
	    		System.out.println("entre le nom de client "); 
	    		Scanner h= new Scanner(System.in);
	        	String nom=h.nextLine();
	        	this.ajouterClient(nom);
	        	System.out.println("le client a été ajoute ");
	        	System.out.println("");
	        	break;
	    	case 2 : 
	    		System.out.println("choisissez le client :"); 	
	    		for(int i=0;i<this.nbClients;i++)
	    			System.out.println((i+1)+")"+this.clients[i].getNom());
	    		System.out.println("Votre choix");
	    		Scanner g = new Scanner(System.in);
	        	int numero=g.nextInt();
	        	this.clients[numero].operationsClient();
	    		
	        	break;
	    	case 3 : 
	    		 fin=true;
	        		}
	        		
	    	 
	    	  

	    }
	}	   
}	   
	   
	
	
	
	
	
	
	
	
	
	

