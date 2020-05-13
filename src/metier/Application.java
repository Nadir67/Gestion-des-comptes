package metier;

import java.util.List;

public class Application {

	public static void main(String[] args) {
	try {
		
		Compte cp1=new CompteCourant(1,1100, 500);
		Compte cp2=new CompteEpargne(2,1500, 5.5);
		
		
		cp1.verser(200);
		cp1.retirer(300);
		
		cp1.virement(400, cp2);
		
		cp1.verser(400);
		cp1.retirer(300);
		
		System.out.println("Solde du Compte cp1="+cp1.consulterSolde());
		System.out.println("Solde du Compte cp2="+cp2.consulterSolde());
		System.out.println("-------------------------------------------------------------------");
	
		
		List<Operation> lisOperations=cp1.getOperations();
		for(Operation o: lisOperations) {
			System.out.println(o.getClass().getSimpleName()+"--------"+o.getNumero()+"--"+o.getDateOperation()+"--"+o.getMontant());
		}
		
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Total des versements du compte cp1="+cp1.totalVersements());
		System.out.println("Total des retraits du compte cp1="+cp1.totalRetraits());
		System.out.println("------------------------------------------------------------------");
		cp1.retirer(600000);
	
	
	}
	
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	


	
	}

}
