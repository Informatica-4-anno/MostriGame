class Vampiro extends Personaggio implements Mostro {
    public Vampiro() {
        super(15);
    }

    @Override
    public void azzanna() {
        int nuovaForza = getForza() - 2;
        if (nuovaForza < 0) {
            nuovaForza = 0;
        }
        setForza(nuovaForza);
        // System.out.println("Vampiro azzanna! Forza diminuita a: " + getForza());
        System.out.println("---- Vampiro azzanna");
    }
    @Override
    public void lotta() {
    	azzanna();
    }
    @Override 
    public String getTipo() { return "Vampiro"; }
}