abstract class Personaggio {
    private int forza;

    public Personaggio(int forza) {
        this.forza = forza;
    }

    public int getForza() {
        return forza;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }
    abstract public void lotta(); 
    abstract public String getTipo();
    
    @Override
	public String toString() {
		return this.getTipo() + " Forza:" + this.getForza();
	}
}