class Eroe extends Personaggio implements Umano {
    public Eroe() {
        super(10);
    }

    @Override
    public void combatti() {
        int nuovaForza = getForza() - 3;
        if (nuovaForza < 0) {
            nuovaForza = 0;
        }
        setForza(nuovaForza);
        //System.out.println("Eroe combatte! Forza diminuita a: " + getForza());
        System.out.println("---- Eroe combatte");
    }
    @Override
    public void lotta() {
    	combatti();
    }
    
    @Override 
    public String getTipo() { return "Eroe"; }
}
