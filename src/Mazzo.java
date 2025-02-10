import java.util.Random;

class Mazzo {
    private Personaggio[] carte;
    private int posi=0;
    
    public Mazzo() {
        carte = new Personaggio[30];
        inizializzaMazzo();
    }

    private void inizializzaMazzo() {
      
        for (int i = 0; i < 10; i++) {
            carte[posi++]=new Eroe();
        }
        // Aggiunge 10 Vampiri
        for (int i = 0; i < 10; i++) {
        	carte[posi++]=new Vampiro();
        }
        // Aggiunge 10 Licantropi
        for (int i = 0; i < 10; i++) {
        	carte[posi++]=new Licantropo();
        }
        mischiaMazzo();
    }

    public void mischiaMazzo() {
    	Random random = new Random();

        // Algoritmo di mescolamento di Fisher-Yates (o Knuth shuffle)
        for (int i = carte.length - 1; i > 0; i--) {
            // Genera un indice casuale j tra 0 e i (incluso)
            int j = random.nextInt(i + 1);
            // Scambia array[i] e array[j]
            Personaggio temp = carte[i];
            carte[i] = carte[j];
            carte[j] = temp;
        }
    }
    
    public Personaggio pescaCarta() {
      if (posi>0) {
        	return carte[--posi];
      }
      System.out.println("Il mazzo è vuoto!");
      return null;
    }

    public int getSize() {
        return posi;
    }
}