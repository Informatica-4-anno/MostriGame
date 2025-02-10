import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Principale {
	public static void main(String[] args) {
		// Istanzia gli oggetti
//		Eroe eroe = new Eroe();
//		Licantropo licantropo = new Licantropo();
//		Vampiro vampiro = new Vampiro();
//
//		// Fa combattere l'Eroe tre volte
//		System.out.println("Eroe:");
//		eroe.lotta();
//		eroe.lotta();
//		eroe.lotta();

//		// Fa combattere il Vampiro una volta
//		System.out.println("\nVampiro:");
//		vampiro.lotta();
//
//		// Fa combattere il Licantropo due volte
//		System.out.println("\nLicantropo:");
//		licantropo.lotta();
//		licantropo.lotta();
//
//		// Stampa la forza fisica rimasta
//		System.out.println("\nForza finale:");
//		System.out.println("Eroe: " + eroe.getForza());
//		System.out.println("Vampiro: " + vampiro.getForza());
//		System.out.println("Licantropo: " + licantropo.getForza());
		Scanner sc=new Scanner(System.in);
		Mazzo m=new Mazzo();
		m.mischiaMazzo();
		Mano manoGiocatore=new Mano(m);
		Mano manoComputer=new Mano(m);
		Random rnd=new Random();
		int risp;
		while (manoGiocatore.getSize()>0 && manoComputer.getSize()>0) {
			do {
				System.out.println("=================================================");
				System.out.println();
				System.out.println(manoGiocatore); 
				System.out.print("scegli:");
				try {
					risp = sc.nextInt();
				} catch(InputMismatchException e) {
				    risp=0;	
				}
			} while (risp<=0 || risp >manoGiocatore.getSize());
			risp--;
			Personaggio gPer = manoGiocatore.gioca(risp);
			Personaggio cPer = manoComputer.gioca((manoComputer.getSize()>1)?
					                        rnd.nextInt(manoComputer.getSize()-1)+1:1);
			System.out.println("=================================================");
			if (gPer.getForza()<=0) {
				 System.out.print("* Giocatore: "+gPer.getTipo()+" morto");
			} else {
				System.out.print("* Giocatore: "+gPer);
			}
			System.out.println(" "+manoGiocatore.getSize()+" carte residue");
			if (cPer.getForza()<=0) {
				 System.out.print("* Computer : "+cPer.getTipo()+" morto");
			} else {
				System.out.print("* Computer : "+cPer);
			}
			System.out.println(" "+manoComputer.getSize()+" carte residue");
		}
		System.out.println("=================================================");
		if (manoGiocatore.getSize()>0) 
			System.out.println("Giocatore vince");
		else if (manoComputer.getSize()>0)
			System.out.println("Computer vince");
		else
			System.out.println("Pareggio");
			
	}

}
