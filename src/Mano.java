import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Mano {
	private Personaggio[] mano=new Personaggio[5];
	int carte;
	
	Mano(Mazzo m) {
		carte=5;
		for (int i=0;i<carte;i++) {
			mano[i]=m.pescaCarta();
		}
	}

	public Personaggio gioca(int i) {
		int p=i%carte;
		Personaggio per=mano[p];
		per.lotta();
		if (per.getForza()<=0) {
			mano[p]=mano[--carte];
		}
	    return per;
	}
	
	public boolean pesca(Mazzo m) {
		if (carte<5 && m.getSize()>0) {
			mano[carte++]=m.pescaCarta();
			return true;
		} else return false;
	}

	public int getSize() {
		return carte;
	}
	
	@Override
	public String toString() {
		String smano="";
		String s="";
		for (int i=0;i<carte;i++) {
			//smano+=String.format("%d - %s forza: %d\n",i+1,mano[i].getTipo(),mano[i].getForza());		
		    smano+=""+(i+1)+" - "+mano[i].toString()+"\n";
		}
		return smano;
	}
}
