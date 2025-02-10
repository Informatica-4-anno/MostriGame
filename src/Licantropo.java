import java.util.Random;

class Licantropo extends Personaggio implements Umano, Mostro {
    private boolean lunaPiena;

    public Licantropo() {
        super(15); // Forza iniziale come mostro
        this.lunaPiena = isLunaPiena();
    }

    public boolean isLunaPiena() {
        // Simula la luna piena in modo casuale per semplicità
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public void combatti() {
        this.lunaPiena = isLunaPiena(); //Ricalcola ad ogni azione
        int decremento = lunaPiena ? 2 : 3;
        int nuovaForza = getForza() - decremento;
        if (nuovaForza < 0) {
            nuovaForza = 0;
        }
        setForza(nuovaForza);
       // System.out.println("Licantropo combatte (umano)! Forza diminuita a: " + getForza() + " (Luna piena: " + lunaPiena + ")");
        System.out.println("---- Licantropo combatte come umano");
    }

    @Override
    public void azzanna() {
        this.lunaPiena = isLunaPiena(); //Ricalcola ad ogni azione
        int decremento = lunaPiena ? 2 : 3;
        int nuovaForza = getForza() - decremento;
        if (nuovaForza < 0) {
            nuovaForza = 0;
        }
        setForza(nuovaForza);
       // System.out.println("Licantropo azzanna (mostro)! Forza diminuita a: " + getForza() + " (Luna piena: " + lunaPiena + ")");
        System.out.println("---- Licantropo azzanna come mostro");
    }
    @Override
    public void lotta() {
      this.lunaPiena = isLunaPiena();
      if (lunaPiena) {
        azzanna();
      } else {
        combatti();
      }
    }
    
    @Override 
    public String getTipo() { return "Licantropo"; }
    
}
